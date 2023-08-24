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
    public enum EncryptType {
        NONE, DISPATCH_KEY, ENCRYPT_KEY
    }
    @Getter
    private final EncryptType encryptType;

    public BasePacket(byte[] header, PacketOpcodes opcode, EncryptType encryptType) {
        this.header = header;
        this.opcode = opcode;
        this.encryptType = encryptType;
    }

    public void setData(byte[] data) {
        this.data = data;
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
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2 + 2 + 2 + 4 + header.length + data.length + 2);
        this.writeUInt16(byteArrayOutputStream, const1);
        this.writeUInt16(byteArrayOutputStream, opcode.value);
        this.writeUInt16(byteArrayOutputStream, header.length);
        this.writeUInt32(byteArrayOutputStream, data.length);
        try {
            this.writeBytes(byteArrayOutputStream, header);
            this.writeBytes(byteArrayOutputStream, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.writeUInt16(byteArrayOutputStream, const2);
        return byteArrayOutputStream.toByteArray();
    }

    public void writeUInt16(ByteArrayOutputStream byteArrayOutputStream, int i) {
        // Unsigned short
        byteArrayOutputStream.write((byte) ((i >>> 8) & 0xFF));
        byteArrayOutputStream.write((byte) (i & 0xFF));
    }

    public void writeUInt32(ByteArrayOutputStream byteArrayOutputStream, int i) {
        // Unsigned int (long)
        byteArrayOutputStream.write((byte) ((i >>> 24) & 0xFF));
        byteArrayOutputStream.write((byte) ((i >>> 16) & 0xFF));
        byteArrayOutputStream.write((byte) ((i >>> 8) & 0xFF));
        byteArrayOutputStream.write((byte) (i & 0xFF));
    }

    public void writeBytes(ByteArrayOutputStream byteArrayOutputStream, byte[] bytes) throws IOException {
        byteArrayOutputStream.write(bytes);
    }
}