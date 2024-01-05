package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass;
import emu.protoshift.net.newproto.CombatInvokeEntryOuterClass;

import java.util.List;

public class HandleCombat {
    private static void handleCombatInvokes(List<CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder> invokes) {
        try {
            for (var invoke : invokes) {
                switch (invoke.getArgumentType()) {
                        case COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT -> {
                            var new_combatData = emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.newBuilder();
                            try{
                                var combatData = emu.protoshift.net.newproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.parseFrom(invoke.getCombatData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setCombatData(new_combatData.build().toByteString());
                        }
                        case COMBAT_TYPE_ARGUMENT_FACE_TO_DIR -> {
                            var new_combatData = emu.protoshift.net.oldproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.newBuilder();
                            try{
                                var combatData = emu.protoshift.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.parseFrom(invoke.getCombatData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setCombatData(new_combatData.build().toByteString());
                        }
                        case COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET -> {
                            var new_combatData = emu.protoshift.net.oldproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.newBuilder();
                            try{
                                var combatData = emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.parseFrom(invoke.getCombatData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setCombatData(new_combatData.build().toByteString());
                        }
                        case COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED -> {
                            var new_combatData = emu.protoshift.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.newBuilder();
                            try{
                                var combatData = emu.protoshift.net.newproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.parseFrom(invoke.getCombatData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setCombatData(new_combatData.build().toByteString());
                        }
                        case COMBAT_TYPE_ARGUMENT_ENTITY_MOVE -> {
                            var new_combatData = emu.protoshift.net.oldproto.EntityMoveInfoOuterClass.EntityMoveInfo.newBuilder();
                            try{
                                var combatData = emu.protoshift.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.parseFrom(invoke.getCombatData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setCombatData(new_combatData.build().toByteString());
                        }
                        case COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE -> {
                            var new_combatData = emu.protoshift.net.oldproto.EvtFixedRushMoveOuterClass.EvtFixedRushMove.newBuilder();
                            try{
                                var combatData = emu.protoshift.net.newproto.EvtFixedRushMoveOuterClass.EvtFixedRushMove.parseFrom(invoke.getCombatData());
                                String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.setCombatData(new_combatData.build().toByteString());
                        }
                    default -> ProtoShift.getLogger().error("Unknown ability type: " + invoke.getArgumentType());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] onCombatInvocationsNotify(byte[] payload) {
        ProtoShift.getLogger().debug("CombatInvocationsNotify injected");
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
