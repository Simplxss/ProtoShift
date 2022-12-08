package emu.grasscutter.server.game;

import emu.grasscutter.net.packet.PacketOpcodes;
import lombok.Getter;

@Getter
public class Handler {
    private final GameSession session;
    private final PacketOpcodes opcode;
    private final byte[] header;
    private final byte[] payload;
    private final boolean isUseDispatchKey;
    private final long timeMills;

    public Handler(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, boolean isUseDispatchKey, long timeMills) {
        this.session = session;
        this.opcode = opcode;
        this.header = header;
        this.payload = payload;
        this.isUseDispatchKey = isUseDispatchKey;
        this.timeMills = timeMills;
    }
}
