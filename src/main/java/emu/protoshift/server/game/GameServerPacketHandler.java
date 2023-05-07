package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.packet.*;
import emu.protoshift.server.injecter.*;

import emu.protoshift.utils.ConfigContainer;
import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import org.reflections.Reflections;

import java.util.Map;
import java.util.HashMap;

public final class GameServerPacketHandler {
    private static final Map<Integer, PacketHandler> newHandlers = new HashMap<>();
    private static final Map<Integer, PacketHandler> oldHandlers = new HashMap<>();

    static {
        Reflections reflections = new Reflections("emu.protoshift.server.packet");

        for (var obj : reflections.getSubTypesOf(PacketHandler.class)) {
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

    public static void handlePacket(GameSession session, byte[] bytes, boolean isFromServer) {
        boolean isUseDispatchKey = (bytes[0] == (0x45 & Crypto.DISPATCH_KEY[0]) && bytes[1] == (0x67 & Crypto.DISPATCH_KEY[1]));

        // Decrypt and turn back into a packet
        if (isUseDispatchKey)
            Crypto.xor(bytes, Crypto.DISPATCH_KEY, false);
        else
            Crypto.xor(bytes, session.getEncryptKey(), false);

        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        // Handle
        try {
            boolean allDebug = ProtoShift.getConfig().server.debugLevel == ConfigContainer.ServerDebugMode.ALL;
            while (packet.readableBytes() > 12) {
                // Packet sanity check
                int const1 = packet.readUnsignedShort();
                if (const1 != 0x4567) {
                    if (allDebug) {
                        ProtoShift.getLogger().error("Bad Data Package Received from " + (isFromServer ? "server" : "client") + ": got " + const1 + " ,expect 0x4567\n" + Utils.bytesToHex(bytes));
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
                        ProtoShift.getLogger().error("Bad Data Package Received " + (isFromServer ? "server" : "client") + ": got " + const2 + " ,expect 0x89ab\n" + Utils.bytesToHex(bytes));
                    }
                    return; // Bad packet
                }
                // Handle
                handle(session, new PacketOpcodes(opcode, isFromServer ? 2 : 1), header, payload, isUseDispatchKey);
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

        if (handler != null) {
            try {
                switch (session.getState()) {
                    case ACTIVE -> {
                        if (opcode.type == 1) {
                            if (opcode.value == PacketOpcodes.newOpcodes.UnionCmdNotify)
                                payload = handleUnionCmd.onUnionCmdNotify(payload, newHandlers);
                            else if (opcode.value == PacketOpcodes.newOpcodes.ClientAbilityChangeNotify)
                                payload = handleAbility.onClientAbilityChangeNotify(payload);
                            else if (opcode.value == PacketOpcodes.newOpcodes.AbilityInvocationsNotify)
                                payload = handleAbility.onAbilityInvocationsNotify(payload);
                            else if (opcode.value == PacketOpcodes.newOpcodes.CombatInvocationsNotify)
                                payload = handleCombat.onCombatInvocationsNotify(payload);

                            if (ProtoShift.getConfig().server.console.enabled) {
                                if (opcode.value == PacketOpcodes.newOpcodes.PrivateChatReq)
                                    handleChat.onPrivateChatReq(session, payload);
                                else if (opcode.value == PacketOpcodes.oldOpcodes.PullPrivateChatReq)
                                    handleChat.onPullPrivateChatReq(session, payload);
                            }
                        }
                        if (opcode.type == 2) {
                            if (ProtoShift.getConfig().server.console.enabled) {
                                if (opcode.value == PacketOpcodes.oldOpcodes.PrivateChatRsp)
                                    payload = handleChat.onPrivateChatRsp(session, payload);
                                else if (opcode.value == PacketOpcodes.oldOpcodes.PullPrivateChatRsp)
                                    payload = handleChat.onPullPrivateChatRsp(session, payload);
                                else if (opcode.value == PacketOpcodes.oldOpcodes.PullRecentChatRsp)
                                    payload = handleChat.onPullRecentChatRsp(session, payload);
                                else if (opcode.value == PacketOpcodes.oldOpcodes.GetPlayerFriendListRsp)
                                    payload = handleFriends.onGetPlayerFriendListRsp(payload);
                            }
                        }
                    }
                    case WAITING_FOR_TOKEN -> {
                        if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.GetPlayerTokenReq)
                            handleLogin.onGetPlayerTokenReq(session, payload);
                        else if (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp)
                            handleLogin.onGetPlayerTokenRsp(session, payload);
                    }
                    case INACTIVE -> {
                        ProtoShift.getLogger()
                                .error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + ", server is inactive!");
                        return;
                    }
                }
                handler.handle(session, header, payload, isUseDispatchKey);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else ProtoShift.getLogger()
                .error("packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + " don't have handler!");
    }
}
