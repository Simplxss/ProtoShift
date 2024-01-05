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
                        case ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE -> {
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
                        case ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM -> {
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
                        case ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM -> {
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
                        case ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE -> {
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
                        case ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE -> {
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
                        case ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_SETATE -> {
                            var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.newBuilder();
                            try{
                                var abilityData = emu.protoshift.net.newproto.AbilityMetaSetKilledStateOuterClass.AbilityMetaSetKilledState.parseFrom(invoke.getAbilityData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setAbilityData(new_abilityData.build().toByteString());
                        }
                        case ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE -> {
                            var new_abilityData = emu.protoshift.net.oldproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.newBuilder();
                            try{
                                var abilityData = emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.parseFrom(invoke.getAbilityData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(abilityData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_abilityData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setAbilityData(new_abilityData.build().toByteString());
                        }
                        case ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE -> {
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
                        case ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION -> {
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
                        case ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET -> {
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
                        case ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL -> {
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
                        case ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE -> {
                            var new_abilityData = emu.protoshift.net.oldproto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.newBuilder();
                            try{
                                var abilityData = emu.protoshift.net.newproto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.parseFrom(invoke.getAbilityData());
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
        ProtoShift.getLogger().debug("ClientAbilityChangeNotify injected");
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
        ProtoShift.getLogger().debug("AbilityInvocationsNotify injected");
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
