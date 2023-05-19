package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.protoshift.net.newproto.AbilityInvocationsNotifyOuterClass;
import emu.protoshift.net.newproto.AbilityInvokeEntryOuterClass;
import emu.protoshift.net.newproto.ClientAbilityChangeNotifyOuterClass;

import java.util.List;

public class HandleAbility {
    private static void handleAbilityInvokes(List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder> invokes) {
        try {
            for (var invoke : invokes) {
                switch (invoke.getArgumentType()) {
                    case ABILITY_META_MODIFIER_CHANGE -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaModifierChangeOuterClass.AbilityMetaModifierChange.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMetaModifierChangeOuterClass.AbilityMetaModifierChange.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_OVERRIDE_PARAM -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_CLEAR_OVERRIDE_PARAM -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityStringOuterClass.AbilityString.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_REINIT_OVERRIDEMAP -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_GLOBAL_FLOAT_VALUE -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_CLEAR_GLOBAL_FLOAT_VALUE -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityStringOuterClass.AbilityString.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_ADD_NEW_ABILITY -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMetaAddAbilityOuterClass.AbilityMetaAddAbility.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_SET_POSE_PARAMETER -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaSetPoseParameterOuterClass.AbilityMetaSetPoseParameter.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMetaSetPoseParameterOuterClass.AbilityMetaSetPoseParameter.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_UPDATE_BASE_REACTION_DAMAGE -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaUpdateBaseReactionDamageOuterClass.AbilityMetaUpdateBaseReactionDamage.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMetaUpdateBaseReactionDamageOuterClass.AbilityMetaUpdateBaseReactionDamage.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_META_TRIGGER_ELEMENT_REACTION -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMetaTriggerElementReactionOuterClass.AbilityMetaTriggerElementReaction.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_ACTION_SET_CRASH_DAMAGE -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_ACTION_CREATE_GADGET -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityActionCreateGadgetOuterClass.AbilityActionCreateGadget.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityActionCreateGadgetOuterClass.AbilityActionCreateGadget.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_ACTION_GENERATE_ELEM_BALL -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityActionGenerateElemBallOuterClass.AbilityActionGenerateElemBall.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityActionGenerateElemBallOuterClass.AbilityActionGenerateElemBall.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_MIXIN_WIND_SEED_SPAWNER -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMixinWindSeedSpawnerOuterClass.AbilityMixinWindSeedSpawner.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMixinWindSeedSpawnerOuterClass.AbilityMixinWindSeedSpawner.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    case ABILITY_MIXIN_SCENE_PROP_SYNC -> {
                        var new_abilityData = emu.protoshift.net.oldproto.AbilityMixinScenePropSyncOuterClass.AbilityMixinScenePropSync.newBuilder();
                        try{
                            var abilityData = emu.protoshift.net.newproto.AbilityMixinScenePropSyncOuterClass.AbilityMixinScenePropSync.parseFrom(invoke.getAbilityData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setAbilityData(new_abilityData.build().toByteString());
                    }
                    default -> ProtoShift.getLogger().error("Unknown ability type: " + invoke.getArgumentType());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] onClientAbilityChangeNotify(byte[] payload) {
        ProtoShift.getLogger().info("ClientAbilityChangeNotify injected");
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
        ProtoShift.getLogger().info("AbilityInvocationsNotify injected");
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
