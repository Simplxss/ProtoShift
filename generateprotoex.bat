@ECHO OFF


:: 0) Input version

set /p NewVersion=Please input new proto version(v3.6.0):
set /p OldVersion=Please input old proto version(v3.2.0):

if "%NewVersion%"=="" set NewVersion=v3.6.0
if "%OldVersion%"=="" set OldVersion=v3.2.0


:: 1) Clean exist files

del /Q ".\src\main\java\emu\protoshift\server\packet\recv"
del /Q ".\src\main\java\emu\protoshift\server\packet\send"

if not exist ".\src\main\java\emu\protoshift\server\packet\recv" md ".\src\main\java\emu\protoshift\server\packet\recv"
if not exist ".\src\main\java\emu\protoshift\server\packet\send" md ".\src\main\java\emu\protoshift\server\packet\send"


:: 2) Updata Opcodes and Rename Proto Class

cd tools\opcode_shift
python opcode_shift.py %NewVersion% %OldVersion%

cd ..\rename_proto_class
python rename_proto_class.py %NewVersion% %OldVersion%
cd ..\..\


:: 3) Build proto

del /Q ".\src\generated"

if not exist ".\src\generated" md ".\src\generated"

.\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\*.proto"
.\tools\protoc\protoc.exe -I=".\proto\%OldVersion%\proto" --java_out=".\src\generated" ".\proto\%OldVersion%\proto\*.proto"


:: 4) Translate proto to json, then java

cd tools\proto2json
proto2json.exe %NewVersion% %OldVersion%

cd ..\protojson2java
python protojson2javaex.py
cd ..\..\