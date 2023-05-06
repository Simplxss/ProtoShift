import os
import sys

for file in os.listdir(fr'../../proto/{sys.argv[1]}/proto'):
    with open(f'../../proto/{sys.argv[1]}/proto/{file}', 'r') as f:
        temp = ''
        for line in f.readlines():
            if 'java_package' in line:
                temp += "option java_package = \"emu.protoshift.net.newproto\";\r"
            else:
                temp += line
                
    with open(f'../../proto/{sys.argv[1]}/proto/{file}', 'w') as out:
        out.write(temp)

for file in os.listdir(fr'../../proto/{sys.argv[2]}/proto'):
    with open(f'../../proto/{sys.argv[2]}/proto/{file}', 'r') as f:
        temp = ''
        for line in f.readlines():
            if 'java_package' in line:
                temp += "option java_package = \"emu.protoshift.net.oldproto\";\r"
            else:
                temp += line
                
    with open(f'../../proto/{sys.argv[2]}/proto/{file}', 'w') as out:
        out.write(temp)
