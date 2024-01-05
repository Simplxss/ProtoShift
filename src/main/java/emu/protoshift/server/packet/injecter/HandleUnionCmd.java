package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.newproto.UnionCmdNotifyOuterClass;

import emu.protoshift.net.packet.BasePacket;

import com.google.protobuf.ByteString;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.server.game.GameSession;


import static emu.protoshift.server.packet.PacketHandler.newHandlers;


public class HandleUnionCmd {
    public static byte[] onUnionCmdNotify(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("UnionCmdNotify injected");
        var req = UnionCmdNotifyOuterClass.UnionCmdNotify.newBuilder();
        try {
            req.mergeFrom(payload);
            for (var cmd : req.getCmdListBuilderList()) {

                BasePacket new_packet = newHandlers.get(cmd.getMessageId()).
                        handle(Handle.preHandle(session, new PacketOpcodes(cmd.getMessageId(), 1), cmd.getBody().toByteArray()));
                cmd.setMessageId(new_packet.getOpcode().value);
                cmd.setBody(ByteString.copyFrom(new_packet.getData()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }
}
