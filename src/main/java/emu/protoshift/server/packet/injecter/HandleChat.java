package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import emu.protoshift.net.newproto.PrivateChatNotifyOuterClass;
import emu.protoshift.net.newproto.PrivateChatReqOuterClass;
import emu.protoshift.net.newproto.PullPrivateChatReqOuterClass;

import emu.protoshift.net.oldproto.PrivateChatRspOuterClass;
import emu.protoshift.net.oldproto.PullPrivateChatRspOuterClass;
import emu.protoshift.net.oldproto.PullRecentChatRspOuterClass;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketOpcodes;

import emu.protoshift.server.game.GameSession;
import emu.protoshift.server.muipserver.console;

import java.util.Date;

public class HandleChat {
    public static void onPrivateChatReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PrivateChatReq injected");
        try {
            var req = PrivateChatReqOuterClass.PrivateChatReq.parseFrom(payload);
            if (req.getTargetUid() == ProtoShift.getConfig().server.console.consoleUid) {
                session.setOnHandleConsoleCmd(true);

                var packet = new BasePacket(new byte[0], new PacketOpcodes(PacketOpcodes.newOpcodes.PrivateChatNotify, 1), false);

                packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                        .setChatInfo(emu.protoshift.net.newproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                                .setTime((int) new Date().getTime())
                                .setToUid(ProtoShift.getConfig().server.console.consoleUid)
                                .setUid(session.getUid())
                                .setText(req.getText())
                                .setIcon(req.getIcon())
                                .build())
                        .build());
                session.send(packet);

                var response = console.exec(session.getUid(), req.getText());

                packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                        .setChatInfo(emu.protoshift.net.newproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                                .setTime((int) new Date().getTime())
                                .setToUid(session.getUid())
                                .setUid(ProtoShift.getConfig().server.console.consoleUid)
                                .setText(response)
                                .build())
                        .build());
                session.send(packet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onPullPrivateChatReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullPrivateChatReq injected");
        try {
            var req = PullPrivateChatReqOuterClass.PullPrivateChatReq.parseFrom(payload);
            if (req.getTargetUid() == ProtoShift.getConfig().server.console.consoleUid)
                session.setOnHandlePullConsoleChat(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] onPrivateChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PrivateChatRsp injected");
        if (session.isOnHandleConsoleCmd()) {
            var rsp = PrivateChatRspOuterClass.PrivateChatRsp.newBuilder();
            try {
                rsp.mergeFrom(payload);
                rsp.setRetcode(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return rsp.build().toByteArray();
        } else return payload;
    }

    public static byte[] onPullPrivateChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullPrivateChatRsp injected");
        if (session.isOnHandlePullConsoleChat()) {
            var rsp = PullPrivateChatRspOuterClass.PullPrivateChatRsp.newBuilder()
                    .addChatInfo(emu.protoshift.net.oldproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                            .setTime((int) new Date().getTime())
                            .setToUid(session.getUid())
                            .setUid(ProtoShift.getConfig().server.console.consoleUid)
                            .setText(ProtoShift.getConfig().server.console.consoleWelcomeText)
                            .build())
                    .setRetcode(0)
                    .build();
            return rsp.toByteArray();
        } else return payload;
    }

    public static byte[] onPullRecentChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullRecentChatRsp injected");
        var rsp = PullRecentChatRspOuterClass.PullRecentChatRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);
            rsp.addChatInfo(emu.protoshift.net.oldproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                    .setTime((int) new Date().getTime())
                    .setToUid(session.getUid())
                    .setUid(ProtoShift.getConfig().server.console.consoleUid)
                    .setText(ProtoShift.getConfig().server.console.consoleWelcomeText)
                    .build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsp.build().toByteArray();
    }
}
