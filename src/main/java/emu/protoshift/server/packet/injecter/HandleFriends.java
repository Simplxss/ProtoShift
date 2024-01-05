package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.net.newproto.GetPlayerSocialDetailReqOuterClass;

import emu.protoshift.net.oldproto.GetPlayerFriendListRspOuterClass;
import emu.protoshift.net.oldproto.FriendBriefOuterClass;
import emu.protoshift.net.oldproto.ProfilePictureOuterClass;
import emu.protoshift.net.oldproto.FriendOnlineStateOuterClass;
import emu.protoshift.net.oldproto.PlatformTypeOuterClass;
import emu.protoshift.net.oldproto.GetPlayerSocialDetailRspOuterClass;
import emu.protoshift.net.oldproto.SocialDetailOuterClass;

import emu.protoshift.server.game.GameSession;

import java.util.Date;

public class HandleFriends {
    public static void onGetPlayerSocialDetailReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("GetPlayerSocialDetailReq injected");
        try {
            var req = GetPlayerSocialDetailReqOuterClass.GetPlayerSocialDetailReq.parseFrom(payload);
            if (req.getUid() == Configuration.CONSOLE.consoleUid)
                session.setOnHandleGetConsoleSocialDetail(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] onGetPlayerFriendListRsp(byte[] payload) {
        ProtoShift.getLogger().debug("GetPlayerFriendListRsp injected");
        var rsp = GetPlayerFriendListRspOuterClass.GetPlayerFriendListRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);
            rsp.addFriendList(FriendBriefOuterClass.FriendBrief.newBuilder()
                    .setUid(Configuration.CONSOLE.consoleUid)
                    .setNickname(Configuration.CONSOLE.consoleNickname)
                    .setLevel(Configuration.CONSOLE.consoleLevel)
                    .setWorldLevel(Configuration.CONSOLE.consoleWorldLevel)
                    .setSignature(Configuration.CONSOLE.consoleSignature)
                    .setLastActiveTime((int) new Date().getTime())
                    .setNameCardId(Configuration.CONSOLE.consoleNameCardId)
                    .setProfilePicture(ProfilePictureOuterClass.ProfilePicture.newBuilder()
                            .setAvatarId(Configuration.CONSOLE.consoleAvatarId)
                            .setCostumeId(Configuration.CONSOLE.consoleCostumeId)
                            .build())
                    .setIsGameSource(true)
                    .setOnlineState(FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE)
                    .setPlatformType(PlatformTypeOuterClass.PlatformType.PLATFORM_TYPE_PC)
                    .build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsp.build().toByteArray();
    }

    public static byte[] onGetPlayerSocialDetailRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("GetPlayerSocialDetailRsp injected");
        if (session.isOnHandleGetConsoleSocialDetail()) {
            var rsp = GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.newBuilder()
                    .setDetailData(SocialDetailOuterClass.SocialDetail.newBuilder()
                            .setUid(Configuration.CONSOLE.consoleUid)
                            .setNickname(Configuration.CONSOLE.consoleNickname)
                            .setLevel(Configuration.CONSOLE.consoleLevel)
                            .setAvatarId(Configuration.CONSOLE.consoleAvatarId)
                            .setSignature(Configuration.CONSOLE.consoleSignature)
                            .setWorldLevel(Configuration.CONSOLE.consoleWorldLevel)
                            .setOnlineState(FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE)
                            .setIsFriend(true)
                            .setIsMpModeAvailable(false)
                            .setNameCardId(Configuration.CONSOLE.consoleNameCardId)
                            .setProfilePicture(ProfilePictureOuterClass.ProfilePicture.newBuilder()
                                    .setAvatarId(Configuration.CONSOLE.consoleAvatarId)
                                    .setCostumeId(Configuration.CONSOLE.consoleCostumeId)
                                    .build()))
                    .setRetcode(0);
            return rsp.build().toByteArray();
        } else return payload;
    }
}
