package emu.protoshift.server.packet.recv;

    import com.google.protobuf.InvalidProtocolBufferException;
    import com.google.protobuf.util.JsonFormat;

    import emu.protoshift.net.packet.BasePacket;
    import emu.protoshift.net.packet.Opcodes;
    import emu.protoshift.net.packet.PacketHandler;
    import emu.protoshift.net.packet.PacketOpcodes;

    import emu.protoshift.server.game.GameSession;

    @Opcodes(value = PacketOpcodes.newOpcodes.EvtDestroyServerGadgetNotify, type = 1)
    public class HandlerEvtDestroyServerGadgetNotify extends PacketHandler {
        public static class Packet extends BasePacket {
            public Packet(byte[] header, EncryptType encryptType, byte[] payload) {
                super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.EvtDestroyServerGadgetNotify, 2), encryptType);
                var q = emu.protoshift.net.oldproto.EvtDestroyServerGadgetNotifyOuterClass.EvtDestroyServerGadgetNotify.newBuilder();
                try{
                    JsonFormat.parser().ignoringUnknownFields().merge(
                            JsonFormat.printer().printingEnumsAsInts().print(
                                emu.protoshift.net.newproto.EvtDestroyServerGadgetNotifyOuterClass.EvtDestroyServerGadgetNotify.parseFrom(payload)
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
    