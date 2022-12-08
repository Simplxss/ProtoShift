package emu.grasscutter.server.game;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.game.GameSession.SessionState;

import emu.grasscutter.utils.Crypto;
import emu.grasscutter.utils.MT19937;
import emu.grasscutter.utils.Utils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.reflections.Reflections;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static emu.grasscutter.Configuration.SERVER;


public final class GameServerPacketHandler {
    private static final Map<Integer, PacketHandler> newHandlers = new HashMap<>();
    private static final Map<Integer, PacketHandler> oldHandlers = new HashMap<>();

    static {
        Reflections reflections = new Reflections("emu.grasscutter.server.packet");
        Set<Class<? extends PacketHandler>> handlerClasses = reflections.getSubTypesOf(PacketHandler.class);

        for (var obj : handlerClasses) {
            registerPacketHandler(obj);
        }

        // Debug
        Grasscutter.getLogger().info("Registered newHandlers " + newHandlers.size() + " " + PacketHandler.class.getSimpleName() + "s");
        Grasscutter.getLogger().info("Registered oldHandlers " + oldHandlers.size() + " " + PacketHandler.class.getSimpleName() + "s");
    }

    public static void registerPacketHandler(Class<? extends PacketHandler> handlerClass) {
        try {
            Opcodes opcode = handlerClass.getAnnotation(Opcodes.class);

            if (opcode == null || opcode.disabled() || opcode.value() <= 0) {
                return;
            }

            PacketHandler packetHandler = handlerClass.getDeclaredConstructor().newInstance();

            if (opcode.type() == 1) {
                newHandlers.put(opcode.value(), packetHandler);
            } else {
                oldHandlers.put(opcode.value(), packetHandler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PacketHandler getHandler(PacketOpcodes opcode) {
        return opcode.type == 1 ? newHandlers.get(opcode.value) : oldHandlers.get(opcode.value);
    }

    public static void handlePacket(GameSession session, byte[] bytes, boolean fromServer) {
        int flag = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
        boolean isUseDispatchKey;

        // Decrypt and turn back into a packet
        if (flag == 0x8c3f) {
            Crypto.xor(bytes, Crypto.DISPATCH_KEY, false);
            isUseDispatchKey = true;
        } else {
            Crypto.xor(bytes, session.getEncryptKey(), false);
            isUseDispatchKey = false;
        }

        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        // Log
        //logPacket(packet);
        // Handle
        try {
            boolean allDebug = SERVER.debugLevel == Grasscutter.ServerDebugMode.ALL;
            while (packet.readableBytes() > 0) {
                // Length
                if (packet.readableBytes() < 12) {
                    return;
                }
                // Packet sanity check
                int const1 = packet.readUnsignedShort();
                if (const1 != 0x4567) {
                    if (allDebug) {
                        Grasscutter.getLogger().error("Bad Data Package Received: got " + const1 + " ,expect 0x4567\n" + Utils.bytesToHex(bytes));
                    }
                    return; // Bad packet
                }
                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readShort();
                int payloadLength = packet.readInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[payloadLength];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readUnsignedShort();
                if (const2 != 0x89ab) {
                    if (allDebug) {
                        Grasscutter.getLogger().error("Bad Data Package Received: got " + const2 + " ,expect 0x89ab\n" + Utils.bytesToHex(bytes));
                    }
                    return; // Bad packet
                }
                // Handle

                handle(session, new PacketOpcodes(opcode, fromServer ? 2 : 1), header, payload, isUseDispatchKey,
                        Grasscutter.getConfig().server.game.tickWhenHandlePacket ? GameSessionManager.getHandlerManager().get(session) : null);

            }
        } catch (Exception e) {
            Grasscutter.getLogger().error("Error handling packet: " + e.getMessage());
        } finally {
            //byteBuf.release(); //Needn't
            packet.release();
        }
    }

    public static void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, boolean isUseDispatchKey, HandlerManager handlers) {
        PacketHandler handler = (opcode.type == 1 ? newHandlers.get(opcode.value) : oldHandlers.get(opcode.value));

        if (SERVER.debugLevel == Grasscutter.ServerDebugMode.ALL) {
            Grasscutter.getLogger().info("Recv packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + "\n"
                    + Utils.bytesToHex(payload));
        }


        if (opcode.value == PacketOpcodes.NONE) return;

        if (handler != null) {
            try {
                // Make sure session is ready for packets
                SessionState state = session.getState();

                if (!(state == SessionState.ACTIVE || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.PingReq) || (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.PingRsp))) {
                    if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.GetPlayerTokenReq) {
                        if (state != SessionState.WAITING_FOR_TOKEN) return;

                        var req = emu.grasscutter.net.newproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);

                        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                        cipher.init(Cipher.DECRYPT_MODE, Crypto.CUR_SIGNING_KEY);

                        var client_seed_encrypted = Utils.base64Decode(req.getClientRandKey());
                        session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
                    } else if (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp) {
                        if (state != SessionState.WAITING_FOR_TOKEN) return;

                        var rsp = emu.grasscutter.net.oldproto.GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.parseFrom(payload);

                        if (rsp.getRetcode() == 0) {
                            long encrypt_seed;
                            if ((encrypt_seed = rsp.getSecretKeySeed()) == 0) {
                                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                cipher.init(Cipher.DECRYPT_MODE, Crypto.getPriKey(rsp.getKeyId()));
                                byte[] seed_bytes = cipher.doFinal(Utils.base64Decode(rsp.getServerRandKey()));
                                encrypt_seed = ByteBuffer.wrap(seed_bytes).getLong() ^ session.getClientSeed();
                            }

                            var encrypt_key = MT19937.generateKey(encrypt_seed);

                            session.setEncryptKey(encrypt_key);

                            // Set session state
                            session.setState(GameSession.SessionState.ACTIVE);
                        }
                    } else return;
                }

                if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.UnionCmdNotify) {
                    var req = emu.grasscutter.net.newproto.UnionCmdNotifyOuterClass.UnionCmdNotify.parseFrom(payload);
                    var new_req = emu.grasscutter.net.newproto.UnionCmdNotifyOuterClass.UnionCmdNotify.newBuilder();
                    for (var cmd : req.getCmdListList()) {
                        BasePacket new_packet = newHandlers.get(cmd.getMessageId()).Packet(cmd.getBody().toByteArray());
                        new_req.addCmdList(emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.newBuilder()
                                .setMessageId(new_packet.getOpcode().value)
                                .setBody(ByteString.copyFrom(new_packet.getData())));
                    }
                }

                if (handlers == null
                        || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.GetPlayerTokenReq)
                        || (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp)
                        || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.SetPlayerBornDataReq)
                        || (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.SetPlayerBornDataRsp)
                        || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.PlayerLoginReq)
                        || (opcode.type == 2 && opcode.value == PacketOpcodes.newOpcodes.PlayerLoginRsp)) {
                    handler.handle(session, header, payload, isUseDispatchKey);
                } else {
                    if (handlers.getSession() == session) {
                        handlers.getHandler().add(new Handler(session, opcode, header, payload, isUseDispatchKey, System.currentTimeMillis()));
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return; // Packet successfully handled
        }

        Grasscutter.getLogger().error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode));

    }
}
