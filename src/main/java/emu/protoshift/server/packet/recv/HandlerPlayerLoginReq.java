package emu.protoshift.server.packet.recv;

    import com.google.protobuf.InvalidProtocolBufferException;
    import com.google.protobuf.util.JsonFormat;

    import emu.protoshift.net.packet.BasePacket;
    import emu.protoshift.net.packet.Opcodes;
    import emu.protoshift.net.packet.PacketHandler;
    import emu.protoshift.net.packet.PacketOpcodes;

    import emu.protoshift.server.game.GameSession;

    @Opcodes(value = PacketOpcodes.newOpcodes.PlayerLoginReq, type = 1)
    public class HandlerPlayerLoginReq extends PacketHandler {
        public static class Packet extends BasePacket {
            public Packet(byte[] header, EncryptType encryptType, byte[] payload) {
                super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.PlayerLoginReq, 2), encryptType);
                var q = emu.protoshift.net.oldproto.PlayerLoginReqOuterClass.PlayerLoginReq.newBuilder();
                try{
                    JsonFormat.parser().ignoringUnknownFields().merge(
                            JsonFormat.printer().printingEnumsAsInts().print(
                                emu.protoshift.net.newproto.PlayerLoginReqOuterClass.PlayerLoginReq.parseFrom(payload)
                            ), q);
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException(e);
                }
                this.setData(q.build());
            }
        }

        @Override
        public BasePacket handle(byte[] payload) throws Exception {
            return new Packet(new byte[0], BasePacket.EncryptType.NONE, payload);
        }

        @Override
        public void handle(GameSession session, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) throws Exception {
            session.send(new Packet(header, encryptType, payload));
        }
    }
    