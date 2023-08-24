import sys

from os import listdir, mkdir
from os.path import exists, splitext
import shutil

from packetList import AbilityInvokeMap, CombatTypeMap

OUTPUT_PACKET_DIR = "..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\"

OUTPUT_INJECTER_DIR = OUTPUT_PACKET_DIR + "injecter\\"

if exists(OUTPUT_INJECTER_DIR):
    shutil.rmtree(OUTPUT_INJECTER_DIR)
mkdir(OUTPUT_INJECTER_DIR)

if len(sys.argv) > 1 and sys.argv[1] == "1":
    with open(OUTPUT_PACKET_DIR + "PacketHandler.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.net.packet.*;
import emu.protoshift.server.game.GameSession;
import emu.protoshift.server.packet.injecter.Handle;
import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public final class PacketHandler {
    public static void init() {
    }

    public static void handlePacket(GameSession session, byte[] bytes, boolean isFromServer) {
        // Decrypt and turn back into a packet
        BasePacket.EncryptType encryptType;
        if (bytes[0] == 0x45 && bytes[1] == 0x67)
            encryptType = BasePacket.EncryptType.NONE;
        else if (bytes[0] == (byte) (0x45 ^ Crypto.DISPATCH_KEY[0]) && bytes[1] == (byte) (0x67 ^ Crypto.DISPATCH_KEY[1])) {
            encryptType = BasePacket.EncryptType.DISPATCH_KEY;
            Crypto.xor(bytes, Crypto.DISPATCH_KEY);
        } else {
            encryptType = BasePacket.EncryptType.ENCRYPT_KEY;
            Crypto.xor(bytes, session.getEncryptKey());
        }
        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        // Handle
        try {
            while (packet.readableBytes() >= 12) {
                // Packet sanity check
                int const1 = packet.readUnsignedShort();
                if (const1 != 0x4567) {
                    ProtoShift.getLogger().error("Bad Data Package Received from " + (isFromServer ? "server" : "client") + ": got " + const1 + " ,expect 0x4567\\n" + Utils.bytesToHex(bytes));
                    break; // Bad packet
                }
                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readUnsignedShort();
                long payloadLength = packet.readUnsignedInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[Math.toIntExact(payloadLength)];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readUnsignedShort();
                if (const2 != 0x89ab) {
                    ProtoShift.getLogger().error("Bad Data Package Received " + (isFromServer ? "server" : "client") + ": got " + const2 + " ,expect 0x89ab\\n" + Utils.bytesToHex(bytes));
                    break; // Bad packet
                }
                // Handle
                handle(session, new PacketOpcodes(opcode, isFromServer ? 2 : 1), header, payload, encryptType);
            }
        } catch (Exception e) {
            ProtoShift.getLogger().error("Error handling packet: " + e.getMessage());
        } finally {
            packet.release();
        }
    }

    public static void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) {
        ProtoShift.getLogger().info("Receive packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode));
        if (Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL) {
            ProtoShift.getLogger().debug(Utils.bytesToHex(payload));
        }

        try {
            var new_payload = Handle.preHandle(session, opcode, payload);

            var packet = new BasePacket(header, opcode, encryptType);
            packet.setData(new_payload);
            session.send(packet);

        } catch (IllegalStateException ignored) {
            ProtoShift.getLogger()
                    .error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + ", server is inactive!");
        }
    }
}
"""
        )

    with open(OUTPUT_INJECTER_DIR + "Handle.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

import emu.protoshift.config.Configuration;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.server.game.GameSession;

public class Handle {
    public static byte[] preHandle(GameSession session, PacketOpcodes opcode, byte[] payload) {
        return switch (session.getState()) {
            case ACTIVE -> {
                if (Configuration.CONSOLE.enabled) {
                    if (opcode.value == PacketOpcodes.Opcodes.PrivateChatReq)
                        HandleChat.onPrivateChatReq(session, payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.PullPrivateChatReq)
                        HandleChat.onPullPrivateChatReq(session, payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.GetPlayerSocialDetailReq)
                        HandleFriends.onGetPlayerSocialDetailReq(session, payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.MarkMapReq)
                        HandleMap.onMarkMapReq(session, payload);
                }
                if (Configuration.CONSOLE.enabled) {
                    if (opcode.value == PacketOpcodes.Opcodes.PrivateChatRsp)
                        yield HandleChat.onPrivateChatRsp(session, payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.PullPrivateChatRsp)
                        yield HandleChat.onPullPrivateChatRsp(session, payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.PullRecentChatRsp)
                        yield HandleChat.onPullRecentChatRsp(session, payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.GetPlayerFriendListRsp)
                        yield HandleFriends.onGetPlayerFriendListRsp(payload);
                    else if (opcode.value == PacketOpcodes.Opcodes.GetPlayerSocialDetailRsp)
                        yield HandleFriends.onGetPlayerSocialDetailRsp(session, payload);
                }
                yield payload;
            }
            case WAITING_FOR_TOKEN -> {
                if (opcode.type == 1 && opcode.value == PacketOpcodes.Opcodes.GetPlayerTokenReq)
                    HandleLogin.onGetPlayerTokenReq(session, payload);
                else if (opcode.type == 2 && opcode.value == PacketOpcodes.Opcodes.GetPlayerTokenRsp)
                    HandleLogin.onGetPlayerTokenRsp(session, payload);
                yield payload;
            }
            case INACTIVE -> throw new IllegalStateException();
        };
    }
}
"""
        )
        with open(
            OUTPUT_INJECTER_DIR + "HandleChat.java", "w", encoding="utf-8"
        ) as file:
            file.write(
                """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import emu.protoshift.config.Configuration;

import emu.protoshift.net.proto.PrivateChatNotifyOuterClass;
import emu.protoshift.net.proto.PrivateChatReqOuterClass;
import emu.protoshift.net.proto.PullPrivateChatReqOuterClass;

import emu.protoshift.net.proto.PrivateChatRspOuterClass;
import emu.protoshift.net.proto.PullPrivateChatRspOuterClass;
import emu.protoshift.net.proto.PullRecentChatRspOuterClass;

import emu.protoshift.net.proto.ChatInfoOuterClass;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketOpcodes;

import emu.protoshift.server.game.GameSession;
import emu.protoshift.server.muipserver.Console;

import java.util.Date;

public class HandleChat {
    public static void onPrivateChatReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PrivateChatReq injected");
        try {
            var req = PrivateChatReqOuterClass.PrivateChatReq.parseFrom(payload);
            if (req.getTargetUid() == Configuration.CONSOLE.consoleUid) {
                session.setOnHandleConsoleCmd(true);

                String response = "";

                var packet = new BasePacket(new byte[0], new PacketOpcodes(PacketOpcodes.Opcodes.PrivateChatNotify, 1), BasePacket.EncryptType.ENCRYPT_KEY);
                switch (req.getContentCase()) {
                    case TEXT -> {
                        packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                                .setChatInfo(ChatInfoOuterClass.ChatInfo.newBuilder()
                                        .setTime((int) new Date().getTime())
                                        .setToUid(Configuration.CONSOLE.consoleUid)
                                        .setUid(session.getUid())
                                        .setText(req.getText())
                                        .build())
                                .build());
                        response = Console.exec(session.getUid(), req.getText());
                    }
                    case ICON -> {
                        packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                                .setChatInfo(ChatInfoOuterClass.ChatInfo.newBuilder()
                                        .setTime((int) new Date().getTime())
                                        .setToUid(Configuration.CONSOLE.consoleUid)
                                        .setUid(session.getUid())
                                        .setIcon(req.getIcon())
                                        .build())
                                .build());
                        // TODO: More quick commands
                        response = switch (req.getIcon()) {
                            case 1 -> Console.exec(session.getUid(), "point 3 all");
                            case 2 -> Console.exec(session.getUid(), "point 5 all");
                            default -> "This icon don't have any command";
                        };
                    }
                }
                session.send(packet);

                packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                        .setChatInfo(ChatInfoOuterClass.ChatInfo.newBuilder()
                                .setTime((int) new Date().getTime())
                                .setToUid(session.getUid())
                                .setUid(Configuration.CONSOLE.consoleUid)
                                .setText(response)
                                .build())
                        .build());
                session.send(packet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onPullPrivateChatReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullPrivateChatReq injected");
        try {
            var req = PullPrivateChatReqOuterClass.PullPrivateChatReq.parseFrom(payload);
            if (req.getTargetUid() == Configuration.CONSOLE.consoleUid)
                session.setOnHandlePullConsoleChat(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] onPrivateChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PrivateChatRsp injected");
        if (session.isOnHandleConsoleCmd()) {
            var rsp = PrivateChatRspOuterClass.PrivateChatRsp.newBuilder();
            rsp.setRetcode(0);
            return rsp.build().toByteArray();
        } else return payload;
    }

    public static byte[] onPullPrivateChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullPrivateChatRsp injected");
        if (session.isOnHandlePullConsoleChat()) {
            var rsp = PullPrivateChatRspOuterClass.PullPrivateChatRsp.newBuilder()
                    .addChatInfo(ChatInfoOuterClass.ChatInfo.newBuilder()
                            .setTime((int) new Date().getTime())
                            .setToUid(session.getUid())
                            .setUid(Configuration.CONSOLE.consoleUid)
                            .setText(Configuration.CONSOLE.consoleWelcomeText)
                            .build())
                    .setRetcode(0);
            return rsp.build().toByteArray();
        } else return payload;
    }

    public static byte[] onPullRecentChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullRecentChatRsp injected");
        var rsp = PullRecentChatRspOuterClass.PullRecentChatRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);
            rsp.addChatInfo(ChatInfoOuterClass.ChatInfo.newBuilder()
                    .setTime((int) new Date().getTime())
                    .setToUid(session.getUid())
                    .setUid(Configuration.CONSOLE.consoleUid)
                    .setText(Configuration.CONSOLE.consoleWelcomeText)
                    .build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsp.build().toByteArray();
    }
}
"""
            )
        with open(
            OUTPUT_INJECTER_DIR + "HandleFriends.java", "w", encoding="utf-8"
        ) as file:
            file.write(
                """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;

import emu.protoshift.net.proto.GetPlayerSocialDetailReqOuterClass;

import emu.protoshift.net.proto.GetPlayerFriendListRspOuterClass;
import emu.protoshift.net.proto.FriendBriefOuterClass;
import emu.protoshift.net.proto.ProfilePictureOuterClass;
import emu.protoshift.net.proto.FriendOnlineStateOuterClass;
import emu.protoshift.net.proto.PlatformTypeOuterClass;
import emu.protoshift.net.proto.GetPlayerSocialDetailRspOuterClass;
import emu.protoshift.net.proto.SocialDetailOuterClass;

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
"""
            )
        with open(
            OUTPUT_INJECTER_DIR + "HandleLogin.java", "w", encoding="utf-8"
        ) as file:
            file.write(
                """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.proto.GetPlayerTokenReqOuterClass;
import emu.protoshift.net.proto.GetPlayerTokenRspOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.utils.Crypto;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.util.Base64;

public class HandleLogin {
    public static void onGetPlayerTokenReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenReq injected");
        try {
            var req = GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, Crypto.SIGNING_KEY);

            byte[] client_seed_encrypted = Base64.getDecoder().decode(req.getClientRandKey());
            session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onGetPlayerTokenRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenRsp injected");
        try {
            var rsp = GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.parseFrom(payload);

            if (rsp.getRetcode() == 0) {
                long encrypt_seed;
                if ((encrypt_seed = rsp.getSecretKeySeed()) == 0) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.DECRYPT_MODE, Crypto.getPriKey(rsp.getKeyId()));
                    byte[] seed_bytes_encrypted = Base64.getDecoder().decode(rsp.getServerRandKey());
                    encrypt_seed = ByteBuffer.wrap(cipher.doFinal(seed_bytes_encrypted)).getLong() ^ session.getClientSeed();
                }

                byte[] encrypt_key = Crypto.generateKey(encrypt_seed);

                session.setUid(rsp.getUid());
                session.setEncryptKey(encrypt_key);

                // Set session state
                session.setState(GameSession.SessionState.ACTIVE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
"""
            )
        with open(
            OUTPUT_INJECTER_DIR + "HandleMap.java", "w", encoding="utf-8"
        ) as file:
            file.write(
                """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import emu.protoshift.net.proto.MapMarkPointTypeOuterClass;
import emu.protoshift.net.proto.MarkMapReqOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.server.muipserver.Console;

public class HandleMap {
    public static void onMarkMapReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("MarkMapReq injected");
        try {
            var req = MarkMapReqOuterClass.MarkMapReq.parseFrom(payload);
            if (req.getMark().getPointType() == MapMarkPointTypeOuterClass.MapMarkPointType.MAP_MARK_POINT_TYPE_FISH_POOL) {
                var Y = req.getMark().getName();
                Console.exec(session.getUid(), "goto " + req.getMark().getPos().getX() + (Y.equals("") ? " 500 " : " " + Y + " ") + req.getMark().getPos().getZ());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
"""
            )


else:
    from cmdIdList import oldcmdList, newcmdList

    PROTOJSON_NEW_DIR = "..\\proto2json\\output\\new\\"
    PROTOJSON_OLD_DIR = "..\\proto2json\\output\\old\\"
    OUTPUT_RECV_DIR = "..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\recv\\"
    OUTPUT_SEND_DIR = "..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\send\\"

    oldjson_list = []
    newjson_list = []

    for i in listdir(PROTOJSON_NEW_DIR):
        newjson_list.append(splitext(i)[0])

    for i in listdir(PROTOJSON_OLD_DIR):
        oldjson_list.append(splitext(i)[0])

    for i in oldcmdList:
        if i in newcmdList:
            if i not in newjson_list or i not in oldjson_list:
                continue

            with open(
                OUTPUT_RECV_DIR + "Handler" + i + ".java", "w", encoding="utf-8"
            ) as file:
                file.write(
                    """package emu.protoshift.server.packet.recv;

    import com.google.protobuf.InvalidProtocolBufferException;
    import com.google.protobuf.util.JsonFormat;

    import emu.protoshift.net.packet.BasePacket;
    import emu.protoshift.net.packet.Opcodes;
    import emu.protoshift.net.packet.PacketHandler;
    import emu.protoshift.net.packet.PacketOpcodes;

    import emu.protoshift.server.game.GameSession;

    @Opcodes(value = PacketOpcodes.newOpcodes."""
                    + i
                    + """, type = 1)
    public class Handler"""
                    + i
                    + """ extends PacketHandler {
        public static class Packet extends BasePacket {
            public Packet(byte[] header, EncryptType encryptType, byte[] payload) {
                super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes."""
                    + i
                    + """, 2), encryptType);
                var q = emu.protoshift.net.oldproto."""
                    + i
                    + """OuterClass."""
                    + i
                    + """.newBuilder();
                try{
                    JsonFormat.parser().ignoringUnknownFields().merge(
                            JsonFormat.printer().printingEnumsAsInts().print(
                                emu.protoshift.net.newproto."""
                    + i
                    + """OuterClass."""
                    + i
                    + """.parseFrom(payload)
                            ), q);
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException(e);
                }
                this.setData(q.build());
            }
        }

        @Override
        public BasePacket handle(byte[] payload) throws Exception {
            return new Packet(new byte[0], BasePacket.EncryptType.NONE, payload);
        }

        @Override
        public void handle(GameSession session, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) throws Exception {
            session.send(new Packet(header, encryptType, payload));
        }
    }
    """
                )
            with open(
                OUTPUT_SEND_DIR + "Handler" + i + ".java", "w", encoding="utf-8"
            ) as file:
                file.write(
                    """package emu.protoshift.server.packet.send;

    import com.google.protobuf.InvalidProtocolBufferException;
    import com.google.protobuf.util.JsonFormat;

    import emu.protoshift.net.packet.BasePacket;
    import emu.protoshift.net.packet.Opcodes;
    import emu.protoshift.net.packet.PacketHandler;
    import emu.protoshift.net.packet.PacketOpcodes;

    import emu.protoshift.server.game.GameSession;

    @Opcodes(value = PacketOpcodes.oldOpcodes."""
                    + i
                    + """, type = 2)
    public class Handler"""
                    + i
                    + """ extends PacketHandler {
        public static class Packet extends BasePacket {
            public Packet(byte[] header, EncryptType encryptType, byte[] payload) {
                super(header, new PacketOpcodes(PacketOpcodes.newOpcodes."""
                    + i
                    + """, 1), encryptType);
                var p = emu.protoshift.net.newproto."""
                    + i
                    + """OuterClass."""
                    + i
                    + """.newBuilder();
                try{
                    JsonFormat.parser().ignoringUnknownFields().merge(
                            JsonFormat.printer().printingEnumsAsInts().print(
                                    emu.protoshift.net.oldproto."""
                    + i
                    + """OuterClass."""
                    + i
                    + """.parseFrom(payload)
                            ), p);
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException(e);
                }

                this.setData(p.build());
            }
        }

        @Override
        public BasePacket handle(byte[] payload) throws Exception {
            return new Packet(new byte[0], BasePacket.EncryptType.NONE, payload);
        }

        @Override
        public void handle(GameSession session, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) throws Exception {
            session.send(new Packet(header, encryptType, payload));
        }
    }
    """
                )

    def generate_invoke_parameter(map, type):
        s = ""
        for key in map:
            if map[key] not in oldjson_list or map[key] not in newjson_list:
                continue
            s += (
                """
                        case """
                + key
                + """ -> {
                            var new_"""
                + type
                + """Data = emu.protoshift.net.oldproto."""
                + map[key]
                + """OuterClass."""
                + map[key]
                + """.newBuilder();
                            try{
                                var """
                + type
                + """Data = emu.protoshift.net.newproto."""
                + map[key]
                + """OuterClass."""
                + map[key]
                + """.parseFrom(invoke.get"""
                + type.capitalize()
                + """Data());
                                String json = JsonFormat.printer().printingEnumsAsInts().print("""
                + type
                + """Data);
                                JsonFormat.parser().ignoringUnknownFields().merge(json, new_"""
                + type
                + "Data"
                + """);
                            } catch (InvalidProtocolBufferException e) {
                                throw new RuntimeException(e);
                            }
                            invoke.set"""
                + type.capitalize()
                + """Data(new_"""
                + type
                + """Data.build().toByteString());
                        }"""
            )
        return s

    with open(
        OUTPUT_INJECTER_DIR + "HandleAbility.java", "w", encoding="utf-8"
    ) as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

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
                    switch (invoke.getArgumentType()) {"""
            + generate_invoke_parameter(AbilityInvokeMap, "ability")
            + """
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
    """
        )

    with open(OUTPUT_INJECTER_DIR + "HandleCombat.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

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
                    switch (invoke.getArgumentType()) {"""
            + generate_invoke_parameter(CombatTypeMap, "combat")
            + """
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
    """
        )

    with open(OUTPUT_PACKET_DIR + "PacketHandler.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.net.packet.*;
import emu.protoshift.server.game.GameSession;
import emu.protoshift.server.packet.injecter.Handle;
import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;

public final class PacketHandler {
    public static final Map<Integer, emu.protoshift.net.packet.PacketHandler> newHandlers = new HashMap<>();
    public static final Map<Integer, emu.protoshift.net.packet.PacketHandler> oldHandlers = new HashMap<>();

    public static void init() {
        Reflections reflections = new Reflections("emu.protoshift.server.packet");

        for (var obj : reflections.getSubTypesOf(emu.protoshift.net.packet.PacketHandler.class)) {
            registerPacketHandler(obj);
        }

        // Debug
        ProtoShift.getLogger().info("Registered newHandlers " + newHandlers.size() + " " + emu.protoshift.net.packet.PacketHandler.class.getSimpleName() + "s");
        ProtoShift.getLogger().info("Registered oldHandlers " + oldHandlers.size() + " " + emu.protoshift.net.packet.PacketHandler.class.getSimpleName() + "s");
    }

    public static void registerPacketHandler(Class<? extends emu.protoshift.net.packet.PacketHandler> handlerClass) {
        try {
            Opcodes opcode = handlerClass.getAnnotation(Opcodes.class);

            if (opcode == null || opcode.value() <= 0)
                return;

            emu.protoshift.net.packet.PacketHandler packetHandler = handlerClass.getDeclaredConstructor().newInstance();

            if (opcode.type() == 1) {
                newHandlers.put(opcode.value(), packetHandler);
            } else {
                oldHandlers.put(opcode.value(), packetHandler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void handlePacket(GameSession session, byte[] bytes, boolean isFromServer) {
        // Decrypt and turn back into a packet
        BasePacket.EncryptType encryptType;
        if (bytes[0] == 0x45 && bytes[1] == 0x67)
            encryptType = BasePacket.EncryptType.NONE;
        else if (bytes[0] == (byte) (0x45 ^ Crypto.DISPATCH_KEY[0]) && bytes[1] == (byte) (0x67 ^ Crypto.DISPATCH_KEY[1])) {
            encryptType = BasePacket.EncryptType.DISPATCH_KEY;
            Crypto.xor(bytes, Crypto.DISPATCH_KEY);
        } else {
            encryptType = BasePacket.EncryptType.ENCRYPT_KEY;
            Crypto.xor(bytes, session.getEncryptKey());
        }
        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        // Handle
        try {
            while (packet.readableBytes() >= 12) {
                // Packet sanity check
                int const1 = packet.readUnsignedShort();
                if (const1 != 0x4567) {
                    ProtoShift.getLogger().error("Bad Data Package Received from " + (isFromServer ? "server" : "client") + ": got " + const1 + " ,expect 0x4567\n" + Utils.bytesToHex(bytes));
                    break; // Bad packet
                }
                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readUnsignedShort();
                long payloadLength = packet.readUnsignedInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[Math.toIntExact(payloadLength)];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readUnsignedShort();
                if (const2 != 0x89ab) {
                    ProtoShift.getLogger().error("Bad Data Package Received " + (isFromServer ? "server" : "client") + ": got " + const2 + " ,expect 0x89ab\n" + Utils.bytesToHex(bytes));
                    break; // Bad packet
                }
                // Handle
                handle(session, new PacketOpcodes(opcode, isFromServer ? 2 : 1), header, payload, encryptType);
            }
        } catch (Exception e) {
            ProtoShift.getLogger().error("Error handling packet: " + e.getMessage());
        } finally {
            packet.release();
        }
    }

    public static void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, BasePacket.EncryptType encryptType) {
        ProtoShift.getLogger().info("Receive packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode));
        if (Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL) {
            ProtoShift.getLogger().debug(Utils.bytesToHex(payload));
        }

        emu.protoshift.net.packet.PacketHandler handler = (opcode.type == 1 ? newHandlers.get(opcode.value) : oldHandlers.get(opcode.value));

        try {
            var new_payload = Handle.preHandle(session, opcode, payload);

            if (handler != null) {
                try {
                    handler.handle(session, header, new_payload, encryptType);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else ProtoShift.getLogger()
                    .error("packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + " don't have handler!");

        } catch (IllegalStateException ignored) {
            ProtoShift.getLogger()
                    .error("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + ", server is inactive!");
        }
    }
}
"""
        )

    with open(OUTPUT_INJECTER_DIR + "Handle.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

import emu.protoshift.config.Configuration;
import emu.protoshift.net.packet.PacketOpcodes;
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
                        else if (opcode.value == PacketOpcodes.newOpcodes.GetPlayerSocialDetailReq)
                            HandleFriends.onGetPlayerSocialDetailReq(session, payload);
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
                        else if (opcode.value == PacketOpcodes.oldOpcodes.GetPlayerSocialDetailRsp)
                            yield HandleFriends.onGetPlayerSocialDetailRsp(session, payload);
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
            case INACTIVE -> throw new IllegalStateException();
        };
    }
}
"""
        )
    with open(OUTPUT_INJECTER_DIR + "HandleChat.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import emu.protoshift.config.Configuration;

import emu.protoshift.net.newproto.PrivateChatNotifyOuterClass;
import emu.protoshift.net.newproto.PrivateChatReqOuterClass;
import emu.protoshift.net.newproto.PullPrivateChatReqOuterClass;

import emu.protoshift.net.oldproto.PrivateChatRspOuterClass;
import emu.protoshift.net.oldproto.PullPrivateChatRspOuterClass;
import emu.protoshift.net.oldproto.PullRecentChatRspOuterClass;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketOpcodes;

import emu.protoshift.server.game.GameSession;
import emu.protoshift.server.muipserver.Console;

import java.util.Date;

public class HandleChat {
    public static void onPrivateChatReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PrivateChatReq injected");
        try {
            var req = PrivateChatReqOuterClass.PrivateChatReq.parseFrom(payload);
            if (req.getTargetUid() == Configuration.CONSOLE.consoleUid) {
                session.setOnHandleConsoleCmd(true);

                String response = "";

                var packet = new BasePacket(new byte[0], new PacketOpcodes(PacketOpcodes.newOpcodes.PrivateChatNotify, 1), BasePacket.EncryptType.ENCRYPT_KEY);
                switch (req.getContentCase()) {
                    case TEXT -> {
                        packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                                .setChatInfo(emu.protoshift.net.newproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                                        .setTime((int) new Date().getTime())
                                        .setToUid(Configuration.CONSOLE.consoleUid)
                                        .setUid(session.getUid())
                                        .setText(req.getText())
                                        .build())
                                .build());
                        response = Console.exec(session.getUid(), req.getText());
                    }
                    case ICON -> {
                        packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                                .setChatInfo(emu.protoshift.net.newproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                                        .setTime((int) new Date().getTime())
                                        .setToUid(Configuration.CONSOLE.consoleUid)
                                        .setUid(session.getUid())
                                        .setIcon(req.getIcon())
                                        .build())
                                .build());
                        // TODO: More quick commands
                        response = switch (req.getIcon()) {
                            case 1 -> Console.exec(session.getUid(), "point 3 all");
                            case 2 -> Console.exec(session.getUid(), "point 5 all");
                            default -> "This icon don't have any command";
                        };
                    }
                }
                session.send(packet);

                packet.setData(PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                        .setChatInfo(emu.protoshift.net.newproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                                .setTime((int) new Date().getTime())
                                .setToUid(session.getUid())
                                .setUid(Configuration.CONSOLE.consoleUid)
                                .setText(response)
                                .build())
                        .build());
                session.send(packet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onPullPrivateChatReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullPrivateChatReq injected");
        try {
            var req = PullPrivateChatReqOuterClass.PullPrivateChatReq.parseFrom(payload);
            if (req.getTargetUid() == Configuration.CONSOLE.consoleUid)
                session.setOnHandlePullConsoleChat(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] onPrivateChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PrivateChatRsp injected");
        if (session.isOnHandleConsoleCmd()) {
            var rsp = PrivateChatRspOuterClass.PrivateChatRsp.newBuilder();
            rsp.setRetcode(0);
            return rsp.build().toByteArray();
        } else return payload;
    }

    public static byte[] onPullPrivateChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullPrivateChatRsp injected");
        if (session.isOnHandlePullConsoleChat()) {
            var rsp = PullPrivateChatRspOuterClass.PullPrivateChatRsp.newBuilder()
                    .addChatInfo(emu.protoshift.net.oldproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                            .setTime((int) new Date().getTime())
                            .setToUid(session.getUid())
                            .setUid(Configuration.CONSOLE.consoleUid)
                            .setText(Configuration.CONSOLE.consoleWelcomeText)
                            .build())
                    .setRetcode(0);
            return rsp.build().toByteArray();
        } else return payload;
    }

    public static byte[] onPullRecentChatRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().debug("PullRecentChatRsp injected");
        var rsp = PullRecentChatRspOuterClass.PullRecentChatRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);
            rsp.addChatInfo(emu.protoshift.net.oldproto.ChatInfoOuterClass.ChatInfo.newBuilder()
                    .setTime((int) new Date().getTime())
                    .setToUid(session.getUid())
                    .setUid(Configuration.CONSOLE.consoleUid)
                    .setText(Configuration.CONSOLE.consoleWelcomeText)
                    .build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsp.build().toByteArray();
    }
}
"""
        )
    with open(
        OUTPUT_INJECTER_DIR + "HandleFriends.java", "w", encoding="utf-8"
    ) as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

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
"""
        )
    with open(OUTPUT_INJECTER_DIR + "HandleLogin.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.newproto.GetPlayerTokenReqOuterClass;
import emu.protoshift.net.oldproto.GetPlayerTokenRspOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.utils.Crypto;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.util.Base64;

public class HandleLogin {
    public static void onGetPlayerTokenReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenReq injected");
        try {
            var req = GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, Crypto.SIGNING_KEY);

            byte[] client_seed_encrypted = Base64.getDecoder().decode(req.getClientRandKey());
            session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onGetPlayerTokenRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenRsp injected");
        try {
            var rsp = GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.parseFrom(payload);

            if (rsp.getRetcode() == 0) {
                long encrypt_seed;
                if ((encrypt_seed = rsp.getSecretKeySeed()) == 0) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.DECRYPT_MODE, Crypto.getPriKey(rsp.getKeyId()));
                    byte[] seed_bytes_encrypted = Base64.getDecoder().decode(rsp.getServerRandKey());
                    encrypt_seed = ByteBuffer.wrap(cipher.doFinal(seed_bytes_encrypted)).getLong() ^ session.getClientSeed();
                }

                byte[] encrypt_key = Crypto.generateKey(encrypt_seed);

                session.setUid(rsp.getUid());
                session.setEncryptKey(encrypt_key);

                // Set session state
                session.setState(GameSession.SessionState.ACTIVE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
"""
        )
    with open(OUTPUT_INJECTER_DIR + "HandleMap.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;

import emu.protoshift.net.newproto.MapMarkPointTypeOuterClass;
import emu.protoshift.net.newproto.MarkMapReqOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.server.muipserver.Console;

public class HandleMap {
    public static void onMarkMapReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("MarkMapReq injected");
        try {
            var req = MarkMapReqOuterClass.MarkMapReq.parseFrom(payload);
            if (req.getMark().getPointType() == MapMarkPointTypeOuterClass.MapMarkPointType.FISH_POOL) {
                var Y = req.getMark().getName();
                Console.exec(session.getUid(), "goto " + req.getMark().getPos().getX() + (Y.equals("") ? " 500 " : " " + Y + " ") + req.getMark().getPos().getZ());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
"""
        )
    with open(OUTPUT_INJECTER_DIR + "HandleTime.java", "w", encoding="utf-8") as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

public class HandleTime {
}
"""
        )
    with open(
        OUTPUT_INJECTER_DIR + "HandleUnionCmd.java", "w", encoding="utf-8"
    ) as file:
        file.write(
            """package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.newproto.UnionCmdNotifyOuterClass;

import emu.protoshift.net.packet.BasePacket;

import com.google.protobuf.ByteString;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.server.game.GameSession;


import static emu.protoshift.server.packet.PacketHandler.newHandlers;


public class HandleUnionCmd {
    public static byte[] onUnionCmdNotify(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("UnionCmdNotify injected");
        var req = UnionCmdNotifyOuterClass.UnionCmdNotify.newBuilder();
        try {
            req.mergeFrom(payload);
            for (var cmd : req.getCmdListBuilderList()) {

                BasePacket new_packet = newHandlers.get(cmd.getMessageId()).
                        handle(Handle.preHandle(session, new PacketOpcodes(cmd.getMessageId(), 1), cmd.getBody().toByteArray()));
                cmd.setMessageId(new_packet.getOpcode().value);
                cmd.setBody(ByteString.copyFrom(new_packet.getData()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }
}
"""
        )
