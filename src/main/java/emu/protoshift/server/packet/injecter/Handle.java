package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.net.packet.PacketOpcodesUtil;
import emu.protoshift.server.game.GameSession;

public class Handle {
    public static byte[] preHandle(GameSession session, PacketOpcodes opcode, byte[] payload) {
        return switch (session.getState()) {
            case ACTIVE -> {
                if (opcode.type == 1) {
                    if (opcode.value == PacketOpcodes.newOpcodes.UnionCmdNotify)
                        yield HandleUnionCmd.onUnionCmdNotify(session, payload);
                    else if (opcode.value == PacketOpcodes.newOpcodes.ClientAbilityChangeNotify)
                        yield HandleAbility.onClientAbilityChangeNotify(payload);
                    else if (opcode.value == PacketOpcodes.newOpcodes.AbilityInvocationsNotify)
                        yield HandleAbility.onAbilityInvocationsNotify(payload);
                    else if (opcode.value == PacketOpcodes.newOpcodes.CombatInvocationsNotify)
                        yield HandleCombat.onCombatInvocationsNotify(payload);

                    if (Configuration.CONSOLE.enabled) {
                        if (opcode.value == PacketOpcodes.newOpcodes.PrivateChatReq)
                            HandleChat.onPrivateChatReq(session, payload);
                        else if (opcode.value == PacketOpcodes.newOpcodes.PullPrivateChatReq)
                            HandleChat.onPullPrivateChatReq(session, payload);
                        else if (opcode.value == PacketOpcodes.newOpcodes.MarkMapReq)
                            HandleMap.onMarkMapReq(session, payload);
                    }
                } else if (opcode.type == 2) {
                    if (Configuration.CONSOLE.enabled) {
                        if (opcode.value == PacketOpcodes.oldOpcodes.PrivateChatRsp)
                            yield HandleChat.onPrivateChatRsp(session, payload);
                        else if (opcode.value == PacketOpcodes.oldOpcodes.PullPrivateChatRsp)
                            yield HandleChat.onPullPrivateChatRsp(session, payload);
                        else if (opcode.value == PacketOpcodes.oldOpcodes.PullRecentChatRsp)
                            yield HandleChat.onPullRecentChatRsp(session, payload);
                        else if (opcode.value == PacketOpcodes.oldOpcodes.GetPlayerFriendListRsp)
                            yield HandleFriends.onGetPlayerFriendListRsp(payload);
                    }
                }
                yield payload;
            }
            case WAITING_FOR_TOKEN -> {
                if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.GetPlayerTokenReq)
                    HandleLogin.onGetPlayerTokenReq(session, payload);
                else if (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp)
                    HandleLogin.onGetPlayerTokenRsp(session, payload);
                yield payload;
            }
            case INACTIVE -> {
                ProtoShift.getLogger()
                        .error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + ", server is inactive!");
                throw new IllegalStateException();
            }
        };
    }
}
