package emu.protoshift.server.packet.recv;

import emu.protoshift.net.packet.Opcodes;
import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketHandler;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.server.game.GameSession;

@Opcodes(value = PacketOpcodes.NONE, type = 1)
public class Handler extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, boolean isUseDispatchKey) {
            super(header, new PacketOpcodes(PacketOpcodes.NONE, 2), isUseDispatchKey);

        }
    }

    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], false);
    }

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload, boolean isUseDispatchKey) throws Exception {
        session.send(new Packet(header, isUseDispatchKey));
    }
}
