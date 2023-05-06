package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.packet.*;
import emu.protoshift.server.game.GameSession.SessionState;

import emu.protoshift.utils.ConfigContainer;
import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.MT19937;
import emu.protoshift.utils.Utils;

import com.google.protobuf.ByteString;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.reflections.Reflections;
import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.function.Consumer;

public final class GameServerPacketHandler {
    private static final Map<Integer, PacketHandler> newHandlers = new HashMap<>();
    private static final Map<Integer, PacketHandler> oldHandlers = new HashMap<>();

    static {
        Reflections reflections = new Reflections("emu.protoshift.server.packet");
        Set<Class<? extends PacketHandler>> handlerClasses = reflections.getSubTypesOf(PacketHandler.class);

        for (var obj : handlerClasses) {
            registerPacketHandler(obj);
        }

        // Debug
        ProtoShift.getLogger().info("Registered newHandlers " + newHandlers.size() + " " + PacketHandler.class.getSimpleName() + "s");
        ProtoShift.getLogger().info("Registered oldHandlers " + oldHandlers.size() + " " + PacketHandler.class.getSimpleName() + "s");
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
            boolean allDebug = ProtoShift.getConfig().server.debugLevel == ConfigContainer.ServerDebugMode.ALL;
            while (packet.readableBytes() > 0) {
                // Length
                if (packet.readableBytes() < 12) {
                    return;
                }
                // Packet sanity check
                int const1 = packet.readUnsignedShort();
                if (const1 != 0x4567) {
                    if (allDebug) {
                        ProtoShift.getLogger().error("Bad Data Package Received: got " + const1 + " ,expect 0x4567\n" + Utils.bytesToHex(bytes));
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
                        ProtoShift.getLogger().error("Bad Data Package Received: got " + const2 + " ,expect 0x89ab\n" + Utils.bytesToHex(bytes));
                    }
                    return; // Bad packet
                }
                // Handle

                handle(session, new PacketOpcodes(opcode, fromServer ? 2 : 1), header, payload, isUseDispatchKey);

            }
        } catch (Exception e) {
            ProtoShift.getLogger().error("Error handling packet: " + e.getMessage());
        } finally {
            //byteBuf.release(); //Needn't
            packet.release();
        }
    }

    public static void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, boolean isUseDispatchKey) {
        PacketHandler handler = (opcode.type == 1 ? newHandlers.get(opcode.value) : oldHandlers.get(opcode.value));

        if (ProtoShift.getConfig().server.debugLevel == ConfigContainer.ServerDebugMode.ALL) {
            ProtoShift.getLogger().info("Recv packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + "\n"
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

                        var req = emu.protoshift.net.newproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);

                        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                        cipher.init(Cipher.DECRYPT_MODE, Crypto.CUR_SIGNING_KEY);

                        var client_seed_encrypted = Utils.base64Decode(req.getClientRandKey());
                        session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
                    } else if (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp) {
                        if (state != SessionState.WAITING_FOR_TOKEN) return;

                        var rsp = emu.protoshift.net.oldproto.GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.parseFrom(payload);

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

                Consumer<List<emu.protoshift.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder>> handleAbilityInvokes = Invokes -> {
                    for (var Invoke : Invokes) {
                        switch (Invoke.getArgumentType()) {
                            case ABILITY_META_MODIFIER_CHANGE ->
                                    Invoke.setAbilityData(emu.protoshift.net.newproto.AbilityMetaModifierChangeOuterClass.AbilityMetaModifierChange.newBuilder().build().toByteString());
                            default -> {}
                        }
                    }
                };

                Consumer<List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder>> handleCombatInvokes = Invokes -> {
                    for (var Invoke : Invokes) {
                        switch (Invoke.getArgumentType()) {
                            case COMBAT_EVT_BEING_HIT ->
                                    Invoke.setCombatData(emu.protoshift.net.newproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.newBuilder().build().toByteString());
                            default -> {}
                        }
                    }
                };

                if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.UnionCmdNotify) {
                    var req = emu.protoshift.net.newproto.UnionCmdNotifyOuterClass.UnionCmdNotify.newBuilder();
                    req.mergeFrom(payload);
                    for (var cmd : req.getCmdListBuilderList()) {
                        BasePacket new_packet = newHandlers.get(cmd.getMessageId()).Packet(cmd.getBody().toByteArray());
                        cmd.setBody(ByteString.copyFrom(new_packet.getData()));
                    }
                    payload = req.build().toByteArray();
                } else if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.ClientAbilityChangeNotify) {
                    var req = emu.protoshift.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.newBuilder();
                    req.mergeFrom(payload);
                    handleAbilityInvokes.accept(req.getInvokesBuilderList());
                    payload = req.build().toByteArray();
                } else if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.AbilityInvocationsNotify) {
                    var req = emu.protoshift.net.newproto.AbilityInvocationsNotifyOuterClass.AbilityInvocationsNotify.newBuilder();
                    req.mergeFrom(payload);
                    handleAbilityInvokes.accept(req.getInvokesBuilderList());
                    payload = req.build().toByteArray();
                } else if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.CombatInvocationsNotify) {
                    var req = emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.newBuilder();
                    req.mergeFrom(payload);
                    handleCombatInvokes.accept(req.getInvokeListBuilderList());
                    payload = req.build().toByteArray();
                }

                handler.handle(session, header, payload, isUseDispatchKey);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return; // Packet successfully handled
        }

        ProtoShift.getLogger().error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode));

    }
}
