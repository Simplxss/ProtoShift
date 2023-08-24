package emu.protoshift.server.packet;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.net.packet.*;
import emu.protoshift.server.game.GameSession;
import emu.protoshift.server.packet.injecter.Handle;
import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public final class PacketHandler {
    public static void init() {
    }

    public static void handlePacket(GameSession session, byte[] bytes, boolean isFromServer) {
        // Decrypt and turn back into a packet
        BasePacket.EncryptType encryptType;
        if (bytes[0] == 0x45 && bytes[1] == 0x67)
            encryptType = BasePacket.EncryptType.NONE;
        else if (bytes[0] == (byte) (0x45 ^ Crypto.DISPATCH_KEY[0]) && bytes[1] == (byte) (0x67 ^ Crypto.DISPATCH_KEY[1])) {
            encryptType = BasePacket.EncryptType.DISPATCH_KEY;
            Crypto.xor(bytes, Crypto.DISPATCH_KEY);
        } else {
            encryptType = BasePacket.EncryptType.ENCRYPT_KEY;
            Crypto.xor(bytes, session.getEncryptKey());
        }
        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        // Handle
        try {
            while (packet.readableBytes() >= 12) {
                // Packet sanity check
                int const1 = packet.readUnsignedShort();
                if (const1 != 0x4567) {
                    ProtoShift.getLogger().error("Bad Data Package Received from " + (isFromServer ? "server" : "client") + ": got " + const1 + " ,expect 0x4567\n" + Utils.bytesToHex(bytes));
                    break; // Bad packet
                }
                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readUnsignedShort();
                long payloadLength = packet.readUnsignedInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[Math.toIntExact(payloadLength)];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readUnsignedShort();
                if (const2 != 0x89ab) {
                    ProtoShift.getLogger().error("Bad Data Package Received " + (isFromServer ? "server" : "client") + ": got " + const2 + " ,expect 0x89ab\n" + Utils.bytesToHex(bytes));
                    break; // Bad packet
                }
                // Handle
                handle(session, new PacketOpcodes(opcode, isFromServer ? 2 : 1), header, payload, encryptType);
            }
        } catch (Exception e) {
            ProtoShift.getLogger().error("Error handling packet: " + e.getMessage());
        } finally {
            packet.release();
        }
    }

    public static void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) {
        ProtoShift.getLogger().info("Receive packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode));
        if (Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL) {
            ProtoShift.getLogger().debug(Utils.bytesToHex(payload));
        }

        try {
            var new_payload = Handle.preHandle(session, opcode, payload);

            opcode.type = opcode.type == 1 ? 2 : 1;
            var packet = new BasePacket(header, opcode, encryptType);
            packet.setData(new_payload);
            session.send(packet);

        } catch (IllegalStateException ignored) {
            ProtoShift.getLogger()
                    .error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + ", server is inactive!");
        }
    }
}
