import csv
import json
from os import path
import sys


def readCmdidCsv(csvpath):
    if not path.exists(csvpath):
        return {}

    cmdid = {}
    with open(csvpath, "r") as f:
        reader = csv.reader(f)
        for line in reader:
            cmdid[line[1]] = line[0]
    return cmdid


def readCmdidJson(jsonpath):
    if not path.exists(jsonpath):
        return {}

    cmdid = {}
    with open(jsonpath, "r") as f:
        lists = json.load(f)
        for line in lists:
            cmdid[str(line["id"])] = line["name"]
    return cmdid


def readPacketIdJson(jsonpath):
    if not path.exists(jsonpath):
        return {}

    cmdid = {}
    with open(jsonpath, "r") as f:
        cmdid = json.load(f)
    return cmdid


def generateJava(cmdid):
    s = ""
    for i in cmdid:
        s += "        public static final int " + cmdid[i] + " = " + i + ";\r"
    return s


def generatePython(cmdid):
    s = ""
    for i in cmdid:
        s += '"' + cmdid[i] + '",'
    return s[:-1]

# id:name
oldpath=f"..\\..\\proto\\{sys.argv[1]}\\"
newpath=f"..\\..\\proto\\{sys.argv[2]}\\"

newcmdid1, oldcmdid1 = readCmdidCsv(
    f"{oldpath}cmdid.csv"
), readCmdidCsv(f"{newpath}cmdid.csv")
newcmdid2, oldcmdid2 = readCmdidJson(
    f"{oldpath}cmdid.json"
), readCmdidJson(f"{newpath}cmdid.json")
newcmdid3, oldcmdid3 = readPacketIdJson(
    f"{oldpath}packetIds.json"
), readCmdidJson(f"{newpath}packetIds.json")

newcmdid = newcmdid1 if newcmdid1 else newcmdid2
oldcmdid = oldcmdid1 if oldcmdid1 else oldcmdid2

newcmdid = newcmdid if newcmdid else newcmdid3
oldcmdid = oldcmdid if oldcmdid else oldcmdid3

if not (newcmdid and oldcmdid):
    print("cmdid.csv or packetIds.json not found")
    exit(1)


with open(
    "..\\..\\src\\main\\java\\emu\\protoshift\\net\\packet\\PacketOpcodes.java", "w"
) as file:
    file.write(
        """package emu.protoshift.net.packet;


public class PacketOpcodes {
    public int value;
    public int type; // 1 new, 2 old


    public PacketOpcodes(int value, int type) {
        this.value = value;
        this.type = type;
    }
    
    public static class newOpcodes{
"""
        + generateJava(newcmdid)
        + """
    }

    public static class oldOpcodes{
"""
        + generateJava(oldcmdid)
        + """
    }
}
"""
    )

with open("..\\protojson2java\\cmdIdList.py", "w") as file:
    file.write(
        "newcmdList=["
        + generatePython(newcmdid)
        + "]"
        + "\r\r"
        + "oldcmdList=["
        + generatePython(oldcmdid)
        + "]"
    )
