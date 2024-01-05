package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.net.newproto.GetPlayerTokenReqOuterClass;
import emu.protoshift.net.oldproto.GetPlayerTokenRspOuterClass;
import emu.protoshift.net.oldproto.PlayerLoginRspOuterClass;
import emu.protoshift.net.oldproto.ResVersionConfigOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.utils.Crypto;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Base64;

public class HandleLogin {
    public static byte[] onGetPlayerTokenReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenReq injected");
        var req = GetPlayerTokenReqOuterClass.GetPlayerTokenReq.newBuilder();
        try {
            req.mergeFrom(payload);

            req.setAccountUid("10003");

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            SecureRandom secureRandom = new SecureRandom();
            long clientSeed = secureRandom.nextLong();
            byte[] seedBytes = ByteBuffer.wrap(new byte[8]).putLong(clientSeed).array();

            cipher.init(Cipher.ENCRYPT_MODE, Crypto.SIGNING_KEY_FOR_UPSTREAM);
            req.setClientRandKey(Base64.getEncoder().encodeToString(cipher.doFinal(seedBytes)));

            session.setClientSeed(clientSeed);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return req.build().toByteArray();
    }

    public static byte[] onGetPlayerTokenRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenRsp injected");
        var rsp = GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);

            if (rsp.getRetcode() == 0) {
                long encryptSeed = rsp.getSecretKeySeed();
                if (encryptSeed == 0) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.DECRYPT_MODE, Crypto.getPriKey(rsp.getKeyId()));
                    byte[] seedBytes = cipher.doFinal(Base64.getDecoder().decode(rsp.getServerRandKey()));
                    encryptSeed = ByteBuffer.wrap(seedBytes).getLong() ^ session.getClientSeed();
                }

                byte[] encrypt_key = Crypto.generateKey(encryptSeed);

                session.setUid(rsp.getUid());
                session.setEncryptKey(encrypt_key);
                // Set session state
                session.setState(GameSession.SessionState.ACTIVE);


                rsp.setServerRandKey("CfO2d7eEYha5bJRXdCfoiemPNAtXDpyNTQ3ObeTt5a7SSHz6GAEO1WPiTQ7fR6OG8LqhVN3ZTxH9Bnkc09BnCxud+kn0+PiGv1PTOuWK0LkQQ1xmg89zA9IHS+OJd1yKT2BBmJf4sN61gi+WtT7aFwRlzku3kGCk6p2wiPo2enE7UwCFi/GiD4vq/m3hNZiKBjitAvheaqbSLjMpBax+c8HXoY5G09ap1PjEnUQPIK0xZRRQKpnrWcCyP4j8N3WwYYQGDW+OYOJjBvJdv+D6XSdEi+4IsZASYVpu9V8UZ570Cakbc+IjUm0UZJXghcR7izIjKtoNHf2Fmc26DEp1Jw==");
                rsp.setSign("mMx/Klovbzq1QxQvVgm30nYhj0jDOykyo9aparyWRNz3ACxV/2gIdLpyM/SMerWMTcx26NapQ9HsKK7BRK7Yx+nMR0O83BkBlxfl+NEarYr6kj9lBKAxZYXTXFRYA4sRynvwa/MOPmGwYMNl6aVvMohhvrsTopsRvIuGFtnCVL2wBfbxcNnbVfP5k+DxPuQnxa/vi+ju8TogW2R+r0p9zQ5NJe1oaYe4xYbyhefFVv11FA/JQHwMHLEyrEdPqTzdN75CUmE09yLuAoeJzoJ1vwwjwfcH9dMDPxsewNJBGiylVHYf56kF4HypNkYNjtxbghgLBaHg0ZoeYHTOJ7YUTQ==");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsp.build().toByteArray();
    }

    public static byte[] onPlayerLoginRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("onPlayerLoginRsp injected");
        if (!Configuration.GAME.disableVersionCheck)
            return payload;
        var rsp = PlayerLoginRspOuterClass.PlayerLoginRsp.newBuilder();
        try {
            rsp.mergeFrom(payload);

            rsp.setClientDataVersion(0)
                    .setClientSilenceDataVersion(0)
                    .setClientMd5("")
                    .setClientSilenceMd5("")
                    .setResVersionConfig(ResVersionConfigOuterClass.ResVersionConfig.newBuilder())
                    .setClientVersionSuffix("")
                    .setClientSilenceVersionSuffix("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsp.build().toByteArray();
    }
}
