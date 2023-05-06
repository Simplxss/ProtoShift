package emu.protoshift.net.packet;

import emu.protoshift.server.game.GameSession;

public abstract class PacketHandler {
	public abstract BasePacket Packet(byte[] payload) throws Exception;
	public abstract void handle(GameSession session, byte[] header, byte[] payload, boolean isUseDispatchKey) throws Exception;
}
