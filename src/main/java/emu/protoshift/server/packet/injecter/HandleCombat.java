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
                    case COMBAT_EVT_BEING_HIT -> {
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
                    case COMBAT_ANIMATOR_STATE_CHANGED -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtAnimatorStateChangedInfoOuterClass.EvtAnimatorStateChangedInfo.parseFrom(invoke.getCombatData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setCombatData(new_combatData.build().toByteString());
                    }
                    case COMBAT_FACE_TO_DIR -> {
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
                    case COMBAT_SET_ATTACK_TARGET -> {
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
                    case COMBAT_RUSH_MOVE -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.parseFrom(invoke.getCombatData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setCombatData(new_combatData.build().toByteString());
                    }
                    case COMBAT_ANIMATOR_PARAMETER_CHANGED -> {
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
                    case ENTITY_MOVE -> {
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
                    case SYNC_ENTITY_POSITION -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtSyncEntityPositionInfoOuterClass.EvtSyncEntityPositionInfo.parseFrom(invoke.getCombatData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setCombatData(new_combatData.build().toByteString());
                    }
                    case COMBAT_COMPENSATE_POS_DIFF -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.parseFrom(invoke.getCombatData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setCombatData(new_combatData.build().toByteString());
                    }
                    case COMBAT_FIXED_RUSH_MOVE -> {
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
                    case COMBAT_BEING_HEALED_NTF -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.parseFrom(invoke.getCombatData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setCombatData(new_combatData.build().toByteString());
                    }
                    case COMBAT_SKILL_ANCHOR_POSITION_NTF -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.parseFrom(invoke.getCombatData());
                            String json = JsonFormat.printer().printingEnumsAsInts().print(combatData);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_combatData);
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.setCombatData(new_combatData.build().toByteString());
                    }
                    case COMBAT_GRAPPLING_HOOK_MOVE -> {
                        var new_combatData = emu.protoshift.net.oldproto.EvtGrapplingHookMoveOuterClass.EvtGrapplingHookMove.newBuilder();
                        try{
                            var combatData = emu.protoshift.net.newproto.EvtGrapplingHookMoveOuterClass.EvtGrapplingHookMove.parseFrom(invoke.getCombatData());
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
