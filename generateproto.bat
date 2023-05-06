@ECHO OFF

:: 0) Input version

set /p NewVersion=Please input new proto version(v3.4):
set /p OldVersion=Please input old proto version(v3.2):

if "%NewVersion%"=="" set NewVersion=v3.4
if "%OldVersion%"=="" set OldVersion=v3.2


:: 1) Backup Handler.java

md ".\backup"

move /Y ".\src\main\java\emu\protoshift\server\packet\recv\Handler.java" ".\backup\Handler.recv.java"
move /Y ".\src\main\java\emu\protoshift\server\packet\send\Handler.java" ".\backup\Handler.send.java"


:: 2) Clean exist files

del /Q ".\src\main\java\emu\protoshift\server\packet\recv"
del /Q ".\src\main\java\emu\protoshift\server\packet\send"

if not exist ".\src\main\java\emu\protoshift\server\packet\recv" md ".\src\main\java\emu\protoshift\server\packet\recv"
if not exist ".\src\main\java\emu\protoshift\server\packet\send" md ".\src\main\java\emu\protoshift\server\packet\send"


:: 3) Updata Opcodes and Rename Proto Class

cd tools\opcode_shift
python opcode_shift.py %NewVersion% %OldVersion%

cd ..\rename_proto_class
python rename_proto_class.py %NewVersion% %OldVersion%
cd ..\..\


:: 4) Build proto

del /Q ".\src\generated"

if not exist ".\src\generated" md ".\src\generated"

.\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\*.proto"
.\tools\protoc\protoc.exe -I=".\proto\%OldVersion%\proto" --java_out=".\src\generated" ".\proto\%OldVersion%\proto\*.proto"


:: 5) Translate proto to json, then java

cd tools\proto2json
proto2json.exe %NewVersion% %OldVersion%

cd ..\protojson2java
python protojson2java.py
cd ..\..\


:: 7) Recover Handler.java

move /Y ".\backup\Handler.recv.java" ".\src\main\java\emu\protoshift\server\packet\recv\Handler.java"
move /Y ".\backup\Handler.send.java" ".\src\main\java\emu\protoshift\server\packet\send\Handler.java"

rd /Q ".\backup"