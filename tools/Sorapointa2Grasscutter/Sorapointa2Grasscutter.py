# Refer to yuuki

import os 

for file in os.listdir(r'../../proto/new'):
    with open(f'../../proto/new/{file}', 'r') as f:
        temp = ''
        for line in f.readlines():
            if 'org.sorapointa.proto' in line:
                temp += "option java_package = \"emu.grasscutter.net.newproto\";\r"
            else:
                temp += line
                
    with open(f'../../proto/new/{file}', 'w') as out:
        out.write(temp)

for file in os.listdir(r'../../proto/old'):
    with open(f'../../proto/old/{file}', 'r') as f:
        temp = ''
        for line in f.readlines():
            if 'org.sorapointa.proto' in line:
                temp += "option java_package = \"emu.grasscutter.net.oldproto\";\r"
            else:
                temp += line
                
    with open(f'../../proto/old/{file}', 'w') as out:
        out.write(temp)
