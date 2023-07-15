import csv
import json
from os import path
import sys


def readCmdidCsv():
    NEWCMDID_PATH = f"..\\..\\proto\\{sys.argv[1]}\\cmdid.csv"
    OLDCMDID_PATH = f"..\\..\\proto\\{sys.argv[2]}\\cmdid.csv"

    if not (path.exists(NEWCMDID_PATH) and path.exists(OLDCMDID_PATH)):
        return {}, {}

    newcmdid = oldcmdid = {}
    with open(NEWCMDID_PATH, "r") as f:
        reader = csv.reader(f)
        for line in reader:
            newcmdid[line[1]] = line[0]

    with open(OLDCMDID_PATH, "r") as f:
        reader = csv.reader(f)
        for line in reader:
            oldcmdid[line[1]] = line[0]
    return newcmdid, oldcmdid


def readCmdidJson():
    NEWCMDID_PATH = f"..\\..\\proto\\{sys.argv[1]}\\packetIds.json"
    OLDCMDID_PATH = f"..\\..\\proto\\{sys.argv[2]}\\packetIds.json"

    if not (path.exists(NEWCMDID_PATH) and path.exists(OLDCMDID_PATH)):
        return {}, {}

    with open(NEWCMDID_PATH, "r") as f:
        newcmdid = json.load(f)

    with open(OLDCMDID_PATH, "r") as f:
        oldcmdid = json.load(f)
    return newcmdid, oldcmdid


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


newcmdid1, oldcmdid1 = readCmdidCsv()
newcmdid2, oldcmdid2 = readCmdidJson()

newcmdid = newcmdid1 if newcmdid1 else newcmdid2
oldcmdid = oldcmdid1 if oldcmdid1 else oldcmdid2

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
