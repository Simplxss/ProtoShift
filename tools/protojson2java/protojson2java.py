from cmdIdList import oldcmdList, newcmdList
from packetList import AbilityInvokeMap, CombatTypeMap

from os import listdir
from os.path import splitext

PROTOJSON_NEW_DIR = '..\\proto2json\\output\\new\\'
PROTOJSON_OLD_DIR = '..\\proto2json\\output\\old\\'
OUTPUT_RECV_DIR = '..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\recv\\'
OUTPUT_SEND_DIR = '..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\send\\'

OUTPUT_INJECTER_DIR = '..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\injecter\\'

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

        with open(OUTPUT_RECV_DIR+'Handler'+i+'.java', 'w', encoding='utf-8') as file:
            file.write(
'''package emu.protoshift.server.packet.recv;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.Opcodes;
import emu.protoshift.net.packet.PacketHandler;
import emu.protoshift.net.packet.PacketOpcodes;

import emu.protoshift.server.game.GameSession;

@Opcodes(value = PacketOpcodes.newOpcodes.'''+i+''', type = 1)
public class Handler'''+i+''' extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, boolean isUseDispatchKey, emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+''' req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.'''+i+''', 2), isUseDispatchKey);

            var q = emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+'''.newBuilder();
            try{
                String json = JsonFormat.printer().printingEnumsAsInts().print(req);
                JsonFormat.parser().ignoringUnknownFields().merge(json, q);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }

            this.setData(q.build());
        }
    }

    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], false, emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload));
    }

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload, boolean isUseDispatchKey) throws Exception {
        session.send(new Packet(header, isUseDispatchKey, emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload)));
    }

}
''')
        with open(OUTPUT_SEND_DIR+'Handler'+i+'.java', 'w', encoding='utf-8') as file:
            file.write(
'''package emu.protoshift.server.packet.send;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.Opcodes;
import emu.protoshift.net.packet.PacketHandler;
import emu.protoshift.net.packet.PacketOpcodes;

import emu.protoshift.server.game.GameSession;

@Opcodes(value = PacketOpcodes.oldOpcodes.'''+i+''', type = 2)
public class Handler'''+i+''' extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, boolean isUseDispatchKey, emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+''' rsp) {
            super(header, new PacketOpcodes(PacketOpcodes.newOpcodes.'''+i+''', 1), isUseDispatchKey);

            var p = emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+'''.newBuilder();
            try{
                String json = JsonFormat.printer().printingEnumsAsInts().print(rsp);
                JsonFormat.parser().ignoringUnknownFields().merge(json, p);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }

            this.setData(p.build());
        }
    }

    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], false, emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload));
    }

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload, boolean isUseDispatchKey) throws Exception {
        session.send(new Packet(header, isUseDispatchKey, emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload)));
    }

}
''')

def generate_invoke_parameter(map, type):
    s=''
    for key in map:
        if map[key] not in oldjson_list or map[key] not in newjson_list:
            continue
        s+='''
                    case '''+key+''' -> {
                        var new_'''+type+'''Data = emu.protoshift.net.oldproto.'''+map[key]+'''OuterClass.'''+map[key]+'''.newBuilder();
                        try{
                            var '''+type+'''Data = emu.protoshift.net.newproto.'''+map[key]+'''OuterClass.'''+map[key]+'''.parseFrom(invoke.get'''+type.capitalize()+'''Data());
                            String json = JsonFormat.printer().printingEnumsAsInts().print('''+type+'''Data);
                            JsonFormat.parser().ignoringUnknownFields().merge(json, new_'''+type+'Data'+''');
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        }
                        invoke.set'''+type.capitalize()+'''Data(new_'''+type+'''Data.build().toByteString());
                    }'''
    return s

with open(OUTPUT_INJECTER_DIR+'HandleAbility.java', 'w', encoding='utf-8') as file:
    file.write(
'''package emu.protoshift.server.packet.injecter;

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
                switch (invoke.getArgumentType()) {'''+generate_invoke_parameter(AbilityInvokeMap,'ability')+'''
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
''')

with open(OUTPUT_INJECTER_DIR+'HandleCombat.java', 'w', encoding='utf-8') as file:
    file.write(
'''package emu.protoshift.server.packet.injecter;

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
                switch (invoke.getArgumentType()) {'''+generate_invoke_parameter(CombatTypeMap,'combat')+'''
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
''')