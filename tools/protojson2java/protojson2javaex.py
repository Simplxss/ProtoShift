from cmdIdList import oldcmdList, newcmdList

from os import listdir, mkdir
from os.path import exists
import json
import re

PROTOJSON_NEW_DIR = '..\\proto2json\\output\\new\\'
PROTOJSON_OLD_DIR = '..\\proto2json\\output\\old\\'
OUTPUT_RECV_DIR = '..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\recv\\'
OUTPUT_SEND_DIR = '..\\..\\src\\main\\java\\emu\\protoshift\\server\\packet\\send\\'

oldobject_map = {}
newobject_map = {}
enum_list = []


def name_convert_to_camel(name: str) -> str:
    result = name.capitalize()
    result = re.sub(r'[0-9]([a-z])', lambda x: x.group()
                    [0] + x.group()[1].upper(), result)
    result = re.sub(r'(_[0-9])', lambda x: x.group()[1], result)
    result = re.sub(r'(_[a-z])', lambda x: x.group()[1].upper(), result)
    return result


def analysis_field(name, json, map):
    if 'MessageName' in json:
        map[json['MessageName']] = {
            'dir': (map[name]['dir'] if name != 'root' else 'root') + '.'+json['MessageName'],
            'classic': [],
            'repeated': [],
            'map': [],
            'oneof': []
        }
        if json['MessageBody'] is not None:
            for key in json['MessageBody']:
                analysis_field(json['MessageName'], key, map)
        return
    if 'EnumName' in json:
        enum_list.append(json['EnumName'])
        return
    if 'OneofName' in json:
        # idk whether it would work
        map[name+'.'+json['OneofName']] = {
            'classic': [],
            'repeated': [],
            'map': []
        }
        map[name]['oneof'].append(name+'.'+json['OneofName'])
        if json['OneofFields'] != None:
            for key in json['OneofFields']:
                analysis_field(name+'.'+json['OneofName'], key, map)
        return
    if 'Type' in json:
        if json['Type'] in ['double', 'float', 'int32', 'int64', 'uint32', 'uint64', 'sint32', 'sint64', 'fixed32', 'fixed64', 'sfixed32', 'sfixed64', 'bool', 'string', 'bytes']:
            if 'IsRepeated' in json:
                if json['IsRepeated']:
                    map[name]['repeated'].append(
                        {'Name': name_convert_to_camel(json['FieldName']), 'Type': 'classic'})
                    return
            if 'FieldName' in json:
                map[name]['classic'].append(
                    {'Name': name_convert_to_camel(json['FieldName']), 'Type': 'classic'})
                return
            if 'MapName' in json:
                map[name]['map'].append(
                    {'Name': name_convert_to_camel(json['MapName']), 'Type': 'classic'})
                return
        else:
            if 'IsRepeated' in json:
                if json['IsRepeated']:
                    map[name]['repeated'].append(
                        {'Name': name_convert_to_camel(json['FieldName']), 'Type': json['Type']})
                    return
            if 'FieldName' in json:
                map[name]['classic'].append(
                    {'Name': name_convert_to_camel(json['FieldName']), 'Type': json['Type']})
                return
            if 'MapName' in json:
                map[name]['map'].append(
                    {'Name': name_convert_to_camel(json['MapName']), 'Type': json['Type']})
                return
    else:
        return


def analysis_json(json, map):
    for i in json['ProtoBody']:
        analysis_field('root', i, map)


def generate_classic_parameter(oldparameter, newparameter, isrecv, datafrom):
    s = ''
    for key in oldparameter:
        if key in newparameter:
            if key['Type'] == 'classic':
                s += '\n                    .set' + \
                    key['Name']+'('+datafrom+'.get'+key['Name']+'())'
            elif key['Type'] in enum_list:
                s += '\n                    .set' + \
                    key['Name']+'Value('+datafrom+'.get'+key['Name']+'Value())'
            else:
                if key['Type'] in oldobject_map and key['Type'] in newobject_map:
                    s += '\n                    .set'+key['Name']+'('+generate_object_parameter(
                        key['Type'], oldobject_map[key['Type']], newobject_map[key['Type']], isrecv, datafrom+'.get'+key['Name']+'()')+')'
                else:
                    s += '\n                    // '+key['Name']
        else:
            s += '\n                    // '+key['Name']

    return s


def generate_repeated_parameter(oldparameter, newparameter, isrecv, datafrom):
    s = ''
    for key in oldparameter:
        if key in newparameter:
            if key['Type'] == 'classic':
                s += '\n                    .addAll' + \
                    key['Name']+'('+datafrom+'.get'+key['Name']+'List())'
            elif key['Type'] in enum_list:
                s += '\n                    .addAll' + \
                    key['Name']+'Value('+datafrom+'.get' + \
                    key['Name']+'ValueList())'
            else:
                if key['Type'] in oldobject_map and key['Type'] in newobject_map:
                    s += '\n                        .addAll' + \
                        key['Name']+'(new LinkedList<>() {{'
                    s += '\n                            '+datafrom+'.get'+key['Name']+'List().forEach(i -> add('+generate_object_parameter(
                        key['Type'], oldobject_map[key['Type']], newobject_map[key['Type']], isrecv, 'i')+'));'
                    s += '\n                    }})'
                else:
                    s += '\n                    // '+key['Name']
        else:
            s += '\n                    // '+key['Name']

    return s


def generate_map_parameter(oldparameter, newparameter, isrecv, datafrom):
    s = ''
    for key in oldparameter:
        if key in newparameter:
            if key['Type'] == 'classic':
                s += '\n                    .putAll' + \
                    key['Name']+'('+datafrom+'.get'+key['Name']+'Map())'
            elif key['Type'] in enum_list:
                s += '\n                    .putAll' + \
                    key['Name']+'Value('+datafrom+'.get' + \
                    key['Name']+'ValueMap())'
            else:
                if key['Type'] in oldobject_map and key['Type'] in newobject_map:
                    s += '\n                        .putAll' + \
                        key['Name']+'(new HashMap<>() {{'
                    s += '\n                            '+datafrom+'.get'+key['Name']+'Map().forEach((key, value) -> put(key, '+generate_object_parameter(
                        key['Type'], oldobject_map[key['Type']], newobject_map[key['Type']], isrecv, 'value')+'));'
                    s += '\n                    }})'
                else:
                    s += '\n                    // '+key['Name']
        else:
            s += '\n                    // '+key['Name']

    return s


def generate_oneof_parameter(oldparameter, newparameter, isrecv, datafrom):
    s = ''
    # Temp comment it because all key were different
    for key1, key2 in zip(oldparameter, newparameter):
        s += generate_classic_parameter(
            oldobject_map[key1]['classic'], newobject_map[key2]['classic'], isrecv, datafrom)
        s += generate_repeated_parameter(
            oldobject_map[key1]['repeated'], newobject_map[key2]['repeated'], isrecv, datafrom)
        s += generate_map_parameter(
            oldobject_map[key1]['map'], newobject_map[key2]['map'], isrecv, datafrom)
    return s


def generate_object_parameter(name, oldparameter, newparameter, isrecv, datafrom):
    dir = oldobject_map[name]['dir'] if isrecv else newobject_map[name]['dir']
    node = dir.split('.', 3)
    s = 'emu.protoshift.net.' + \
        ('oldproto' if isrecv else 'newproto') + \
        '.'+node[1]+'OuterClass.'+node[1] + \
        ('.'+node[2] if len(node) == 3 else '')+'.newBuilder()'
    s += generate_classic_parameter(
        oldparameter['classic'], newparameter['classic'], isrecv, datafrom)
    s += generate_repeated_parameter(
        oldparameter['repeated'], newparameter['repeated'], isrecv, datafrom)
    s += generate_map_parameter(oldparameter['map'],
                                newparameter['map'], isrecv, datafrom)
    s += generate_oneof_parameter(oldparameter['oneof'],
                                  newparameter['oneof'], isrecv, datafrom)
    s += '\n                .build()'
    return s


if (not exists(OUTPUT_RECV_DIR)):
    mkdir(OUTPUT_RECV_DIR)
if (not exists(OUTPUT_SEND_DIR)):
    mkdir(OUTPUT_SEND_DIR)

for i in listdir(PROTOJSON_NEW_DIR):
    newjson = json.load(open(PROTOJSON_NEW_DIR + i, 'r', encoding='utf-8'))
    analysis_json(newjson, newobject_map)

for i in listdir(PROTOJSON_OLD_DIR):
    oldjson = json.load(open(PROTOJSON_OLD_DIR + i, 'r', encoding='utf-8'))
    analysis_json(oldjson, oldobject_map)

for i in oldcmdList:
    if i in newcmdList:
        if i not in oldobject_map or i not in newobject_map:
            continue
        with open(OUTPUT_RECV_DIR+'Handler'+i+'.java', 'w', encoding='utf-8') as file:
            file.write(
                '''
package emu.protoshift.server.packet.recv;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.Opcodes;
import emu.protoshift.net.packet.PacketHandler;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.server.game.GameSession;

import java.util.LinkedList;
import java.util.HashMap;

@Opcodes(value = PacketOpcodes.newOpcodes.'''+i+''', type = 1)
public class Handler'''+i+''' extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+''' req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.'''+i+''', 2));
        
            var q = '''+generate_object_parameter(i, oldobject_map[i], newobject_map[i], True, 'req')+''';
            this.setData(q.toByteArray());
        }
    }
    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+''' req = emu.protoshift.net.newproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, req));
    }

}
'''
            )
        with open(OUTPUT_SEND_DIR+'Handler'+i+'.java', 'w', encoding='utf-8') as file:
            file.write(
                '''
package emu.protoshift.server.packet.send;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.Opcodes;
import emu.protoshift.net.packet.PacketHandler;
import emu.protoshift.net.packet.PacketOpcodes;
import emu.protoshift.server.game.GameSession;

import java.util.LinkedList;
import java.util.HashMap;

@Opcodes(value = PacketOpcodes.oldOpcodes.'''+i+''',type = 2)
public class Handler'''+i+''' extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+''' rsp) {
            super(header, new PacketOpcodes(PacketOpcodes.newOpcodes.'''+i+''', 1));

            var q = '''+generate_object_parameter(i, oldobject_map[i], newobject_map[i], False, 'rsp')+''';
            this.setData(q.toByteArray());
        }
    }
    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+''' rsp = emu.protoshift.net.oldproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, rsp));
    }

}
'''
            )
