import csv

NEWCMDID_PATH='..\\..\\proto\\newcmdid.csv'
OLDCMDID_PATH='..\\..\\proto\\oldcmdid.csv'


newcmdid = {}
oldcmdid = {}


def generateJava(cmdid):
    s = ''
    for i in cmdid:
        s += '        public static final int '+i+' = ' + cmdid[i]+';\r'
    return s


def generatePython(cmdid):
    s = ''
    for i in cmdid:
        s += '"'+i+'",'
    return s[:-1]


reader = csv.reader(open(NEWCMDID_PATH))
for line in reader:
    newcmdid[line[0]] = line[1]

reader = csv.reader(open(OLDCMDID_PATH))
for line in reader:
    oldcmdid[line[0]] = line[1]

with open('..\\..\\src\\main\\java\\emu\\grasscutter\\net\\packet\\PacketOpcodes.java', 'w') as file:
    file.write('''package emu.grasscutter.net.packet;


public class PacketOpcodes {
    public int value;
    public int type; // 1 new, 2 old


    public PacketOpcodes(int value, int type) {
        this.value = value;
        this.type = type;
    }

    // Empty
    public static final int NONE = 0;
    // Opcodes

    public static class newOpcodes{
''' + generateJava(newcmdid) + '''
    }

    public static class oldOpcodes{
''' + generateJava(oldcmdid) + '''
    }
}
''')

with open('..\\protojson2java\\cmdIdList.py', 'w') as file:
    file.write('newcmdList=['+generatePython(newcmdid)+']'
               + '\r\r' +
               'oldcmdList=['+generatePython(oldcmdid)+']'
               )
