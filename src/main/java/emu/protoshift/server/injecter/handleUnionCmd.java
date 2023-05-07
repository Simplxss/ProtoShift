package emu.protoshift.server.injecter;

import emu.protoshift.net.newproto.UnionCmdNotifyOuterClass;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketHandler;

import com.google.protobuf.ByteString;

import java.util.Map;


public class handleUnionCmd {
    public static byte[] onUnionCmdNotify(byte[] payload, Map<Integer, PacketHandler> newHandlers) {
        var req = UnionCmdNotifyOuterClass.UnionCmdNotify.newBuilder();
        try {
            req.mergeFrom(payload);
            for (var cmd : req.getCmdListBuilderList()) {
                BasePacket new_packet = newHandlers.get(cmd.getMessageId()).Packet(cmd.getBody().toByteArray());
                cmd.setBody(ByteString.copyFrom(new_packet.getData()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }
}
