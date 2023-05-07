package emu.protoshift.server.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.oldproto.GetPlayerFriendListRspOuterClass;
import emu.protoshift.net.oldproto.FriendBriefOuterClass;
import emu.protoshift.net.oldproto.ProfilePictureOuterClass;
import emu.protoshift.net.oldproto.FriendOnlineStateOuterClass;
import emu.protoshift.net.oldproto.PlatformTypeOuterClass;


public class handleFriends {
    public static byte[] onGetPlayerFriendListRsp(byte[] payload) {
        var rsp = GetPlayerFriendListRspOuterClass.GetPlayerFriendListRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);
            rsp.addFriendList(FriendBriefOuterClass.FriendBrief.newBuilder()
                    .setUid(ProtoShift.getConfig().server.console.consoleUid)
                    .setNickname(ProtoShift.getConfig().server.console.consoleNickname)
                    .setLevel(ProtoShift.getConfig().server.console.consoleLevel)
                    .setWorldLevel(ProtoShift.getConfig().server.console.consoleWorldLevel)
                    .setSignature(ProtoShift.getConfig().server.console.consoleSignature)
                    .setNameCardId(ProtoShift.getConfig().server.console.consoleNameCardId)
                    .setProfilePicture(ProfilePictureOuterClass.ProfilePicture.newBuilder()
                            .setAvatarId(ProtoShift.getConfig().server.console.consoleAvatarId)
                            .setCostumeId(ProtoShift.getConfig().server.console.consoleCostumeId)
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
}
