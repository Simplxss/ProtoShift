package emu.protoshift.server.injecter;

import emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass;
import emu.protoshift.net.newproto.CombatInvokeEntryOuterClass;

import java.util.List;

public class handleCombat {
    private static void handleCombatInvokes(List<CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder> invokes) {
        for (var invoke : invokes) {
            switch (invoke.getArgumentType()) {
                case COMBAT_EVT_BEING_HIT ->
                        invoke.setCombatData(emu.protoshift.net.newproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.newBuilder().build().toByteString());
                default -> {
                }
            }
        }
    }

    public static byte[] onCombatInvocationsNotify(byte[] payload) {
        var req = CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.newBuilder();
        try {
            req.mergeFrom(payload);
            handleCombatInvokes(req.getInvokeListBuilderList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }
}
