package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;

import emu.protoshift.net.oldproto.GetPlayerFriendListRspOuterClass;
import emu.protoshift.net.oldproto.FriendBriefOuterClass;
import emu.protoshift.net.oldproto.ProfilePictureOuterClass;
import emu.protoshift.net.oldproto.FriendOnlineStateOuterClass;
import emu.protoshift.net.oldproto.PlatformTypeOuterClass;

public class HandleFriends {
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
}
