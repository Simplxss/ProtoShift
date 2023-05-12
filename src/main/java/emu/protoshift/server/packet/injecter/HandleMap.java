package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import emu.protoshift.net.newproto.MapMarkPointTypeOuterClass;
import emu.protoshift.net.newproto.MarkMapReqOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.server.muipserver.Console;

public class HandleMap {
    public static void onMarkMapReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("MarkMapReq injected");
        try {
            var req = MarkMapReqOuterClass.MarkMapReq.parseFrom(payload);
            if (req.getMark().getPointType() == MapMarkPointTypeOuterClass.MapMarkPointType.FISH_POOL) {
                var Y = req.getMark().getName();
                Console.exec(session.getUid(), "goto " + req.getMark().getPos().getX() + (Y.equals("") ? " 500 " : " " + Y + " ") + req.getMark().getPos().getZ());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
