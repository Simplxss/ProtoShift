package emu.protoshift.server.injecter;

import emu.protoshift.net.newproto.AbilityInvocationsNotifyOuterClass;
import emu.protoshift.net.newproto.AbilityInvokeEntryOuterClass;
import emu.protoshift.net.newproto.ClientAbilityChangeNotifyOuterClass;

import java.util.List;

public class handleAbility {
    private static void handleAbilityInvokes(List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder> invokes) {
        for (var invoke : invokes) {
            switch (invoke.getArgumentType()) {
                case ABILITY_META_MODIFIER_CHANGE ->
                        invoke.setAbilityData(emu.protoshift.net.newproto.AbilityMetaModifierChangeOuterClass.AbilityMetaModifierChange.newBuilder().build().toByteString());
                default -> {
                }
            }
        }
    }

    public static byte[] onClientAbilityChangeNotify(byte[] payload) {
        var req = ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.newBuilder();
        try {
            req.mergeFrom(payload);
            handleAbilityInvokes(req.getInvokesBuilderList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }

    public static byte[] onAbilityInvocationsNotify(byte[] payload) {
        var req = AbilityInvocationsNotifyOuterClass.AbilityInvocationsNotify.newBuilder();
        try {
            req.mergeFrom(payload);
            handleAbilityInvokes(req.getInvokesBuilderList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }
}
