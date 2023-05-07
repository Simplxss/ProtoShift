package emu.protoshift.net.packet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.google.protobuf.GeneratedMessageV3;

import lombok.Getter;

public class BasePacket {
    private static final int const1 = 17767; // 0x4567
    private static final int const2 = -30293; // 0x89ab

    @Getter
    private final PacketOpcodes opcode;
    private byte[] header;
    @Getter
    private byte[] data;
    // Encryption
    public boolean isUseDispatchKey;

    public BasePacket(byte[] header, PacketOpcodes opcode, boolean isUseDispatchKey) {
        this.header = header;
        this.opcode = opcode;
        this.isUseDispatchKey = isUseDispatchKey;
    }

    public void setData(GeneratedMessageV3 proto) {
        this.data = proto.toByteArray();
    }

    public byte[] build() {
        if (header == null) {
            header = new byte[0];
        }
        if (data == null) {
            data = new byte[0];
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2 + 2 + 2 + 4 + header.length + data.length + 2);
        this.writeUint16(baos, const1);
        this.writeUint16(baos, opcode.value);
        this.writeUint16(baos, header.length);
        this.writeUint32(baos, data.length);
        this.writeBytes(baos, header);
        this.writeBytes(baos, data);
        this.writeUint16(baos, const2);
        return baos.toByteArray();
    }

    public void writeUint16(ByteArrayOutputStream baos, int i) {
        // Unsigned short
        baos.write((byte) ((i >>> 8) & 0xFF));
        baos.write((byte) (i & 0xFF));
    }

    public void writeUint32(ByteArrayOutputStream baos, int i) {
        // Unsigned int (long)
        baos.write((byte) ((i >>> 24) & 0xFF));
        baos.write((byte) ((i >>> 16) & 0xFF));
        baos.write((byte) ((i >>> 8) & 0xFF));
        baos.write((byte) (i & 0xFF));
    }

    public void writeBytes(ByteArrayOutputStream baos, byte[] bytes) {
        try {
            baos.write(bytes);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}