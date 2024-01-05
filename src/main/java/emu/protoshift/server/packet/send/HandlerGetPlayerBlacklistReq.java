package emu.protoshift.server.packet.send;

    import com.google.protobuf.InvalidProtocolBufferException;
    import com.google.protobuf.util.JsonFormat;

    import emu.protoshift.net.packet.BasePacket;
    import emu.protoshift.net.packet.Opcodes;
    import emu.protoshift.net.packet.PacketHandler;
    import emu.protoshift.net.packet.PacketOpcodes;

    import emu.protoshift.server.game.GameSession;

    @Opcodes(value = PacketOpcodes.oldOpcodes.GetPlayerBlacklistReq, type = 2)
    public class HandlerGetPlayerBlacklistReq extends PacketHandler {
        public static class Packet extends BasePacket {
            public Packet(byte[] header, EncryptType encryptType, byte[] payload) {
                super(header, new PacketOpcodes(PacketOpcodes.newOpcodes.GetPlayerBlacklistReq, 1), encryptType);
                var p = emu.protoshift.net.newproto.GetPlayerBlacklistReqOuterClass.GetPlayerBlacklistReq.newBuilder();
                try{
                    JsonFormat.parser().ignoringUnknownFields().merge(
                            JsonFormat.printer().printingEnumsAsInts().print(
                                    emu.protoshift.net.oldproto.GetPlayerBlacklistReqOuterClass.GetPlayerBlacklistReq.parseFrom(payload)
                            ), p);
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException(e);
                }

                this.setData(p.build());
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
    