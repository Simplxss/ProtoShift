@ECHO OFF


:: 0) Input version
set DefaultNewVersion=v4.0.0
set DefaultOldVersion=v4.0.0

set /p NewVersion=Please input new proto version(%DefaultNewVersion%):
set /p OldVersion=Please input old proto version(%DefaultOldVersion%):

if "%NewVersion%"=="" set NewVersion=%DefaultNewVersion%
if "%OldVersion%"=="" set OldVersion=%DefaultOldVersion%

if "%NewVersion%"=="%OldVersion%" (
    echo The same version, build in direct forword mode
    set Direct=1
)

:: 1) Clean exist files

if exist ".\src\main\java\emu\protoshift\server\packet\recv" rmdir /S /Q ".\src\main\java\emu\protoshift\server\packet\recv"
if exist ".\src\main\java\emu\protoshift\server\packet\send" rmdir /S /Q ".\src\main\java\emu\protoshift\server\packet\send"

if not defined Direct (
    md ".\src\main\java\emu\protoshift\server\packet\recv"
    md ".\src\main\java\emu\protoshift\server\packet\send"
)


:: 2) Updata Opcodes and Rename Proto Class

cd tools\opcode_shift
python opcode_shift.py %NewVersion% %OldVersion%

cd ..\rename_proto_class
python rename_proto_class.py %NewVersion% %OldVersion%
cd ..\..\


:: 3) Build proto

if exist ".\src\generated" rmdir /S /Q ".\src\generated"

if not exist ".\src\generated" md ".\src\generated"

if defined Direct (
    @REM .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\Birthday.proto" ".\proto\%NewVersion%\proto\ChatInfo.proto" ".\proto\%NewVersion%\proto\FriendBrief.proto" ".\proto\%NewVersion%\proto\FriendEnterHomeOption.proto" ".\proto\%NewVersion%\proto\FriendOnlineState.proto" ".\proto\%NewVersion%\proto\GetPlayerFriendListRsp.proto" ".\proto\%NewVersion%\proto\GetPlayerSocialDetailReq.proto" ".\proto\%NewVersion%\proto\GetPlayerSocialDetailRsp.proto" ".\proto\%NewVersion%\proto\GetPlayerTokenReq.proto" ".\proto\%NewVersion%\proto\GetPlayerTokenRsp.proto" ".\proto\%NewVersion%\proto\MapMarkFromType.proto" ".\proto\%NewVersion%\proto\MapMarkPoint.proto" ".\proto\%NewVersion%\proto\MapMarkPointType.proto" ".\proto\%NewVersion%\proto\MarkMapReq.proto" ".\proto\%NewVersion%\proto\MovingPlatformType.proto" ".\proto\%NewVersion%\proto\PlatformType.proto" ".\proto\%NewVersion%\proto\PrivateChatNotify.proto" ".\proto\%NewVersion%\proto\PrivateChatReq.proto" ".\proto\%NewVersion%\proto\PrivateChatRsp.proto" ".\proto\%NewVersion%\proto\ProfilePicture.proto" ".\proto\%NewVersion%\proto\ProfilePictureChangeNotify.proto" ".\proto\%NewVersion%\proto\PullPrivateChatReq.proto" ".\proto\%NewVersion%\proto\PullPrivateChatRsp.proto" ".\proto\%NewVersion%\proto\PullRecentChatRsp.proto" ".\proto\%NewVersion%\proto\ReadPrivateChatReq.proto" ".\proto\%NewVersion%\proto\SocialDetail.proto" ".\proto\%NewVersion%\proto\SocialShowAvatarInfo.proto" ".\proto\%NewVersion%\proto\StopServerInfo.proto" ".\proto\%NewVersion%\proto\Vector.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\Birthday.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\ChatInfo.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\FriendBrief.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\FriendEnterHomeOption.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\FriendOnlineState.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\GetPlayerFriendListRsp.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\GetPlayerSocialDetailReq.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\GetPlayerSocialDetailRsp.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\GetPlayerTokenReq.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\GetPlayerTokenRsp.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\MapMarkFromType.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\MapMarkPoint.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\MapMarkPointType.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\MarkMapReq.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\MovingPlatformType.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\PlatformType.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\PrivateChatNotify.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\PrivateChatReq.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\ProfilePicture.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\ProfilePictureChangeNotify.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\PullPrivateChatReq.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\PullPrivateChatRsp.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\PullRecentChatRsp.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\ReadPrivateChatReq.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\SocialDetail.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\SocialShowAvatarInfo.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\StopServerInfo.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\Vector.proto"
) else (
    .\tools\protoc\protoc.exe -I=".\proto\%NewVersion%\proto" --java_out=".\src\generated" ".\proto\%NewVersion%\proto\*.proto"
    .\tools\protoc\protoc.exe -I=".\proto\%OldVersion%\proto" --java_out=".\src\generated" ".\proto\%OldVersion%\proto\*.proto"
)


:: 4) Translate proto to json, then java

if not defined Direct (
    cd tools\proto2json
    proto2json.exe %NewVersion% %OldVersion%
    cd ..\..\
)

cd tools\protojson2java
python protojson2java.py %Direct%
cd ..\..\

pause