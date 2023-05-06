package emu.protoshift.net.packet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.google.protobuf.GeneratedMessageV3;

public class BasePacket {
    private static final int const1 = 17767; // 0x4567
    private static final int const2 = -30293; // 0x89ab
    private final PacketOpcodes opcode;
    private byte[] header;
    private byte[] data;
    // Encryption
    public boolean isUseDispatchKey;

    public BasePacket(byte[] header, PacketOpcodes opcode, boolean isUseDispatchKey) {
        this.header = header;
        this.opcode = opcode;
        this.isUseDispatchKey = isUseDispatchKey;
    }

    public PacketOpcodes getOpcode() {
        return this.opcode;
    }

    public byte[] getHeader() {
        return this.header;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setData(GeneratedMessageV3 proto) {
        this.data = proto.toByteArray();
    }

    @SuppressWarnings("rawtypes")
    public void setData(GeneratedMessageV3.Builder proto) {
        this.data = proto.build().toByteArray();
    }

    public byte[] build() {
        if (this.getHeader() == null) {
            this.header = new byte[0];
        }
        if (this.getData() == null) {
            this.data = new byte[0];
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2 + 2 + 2 + 4 + this.getHeader().length + this.getData().length + 2);
        this.writeUint16(baos, const1);
        this.writeUint16(baos, this.opcode.value);
        this.writeUint16(baos, this.header.length);
        this.writeUint32(baos, this.data.length);
        this.writeBytes(baos, this.header);
        this.writeBytes(baos, this.data);
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