package emu.protoshift.net.packet;

import emu.protoshift.server.game.GameSession;

public abstract class PacketHandler {
	public abstract BasePacket handle(byte[] payload) throws Exception;
	public abstract void handle(GameSession session, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) throws Exception;
}
