package emu.protoshift.server.injecter;

import emu.protoshift.net.newproto.GetPlayerTokenReqOuterClass;
import emu.protoshift.net.oldproto.GetPlayerTokenRspOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.MT19937;
import emu.protoshift.utils.Utils;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;

public class handleLogin {
    public static void onGetPlayerTokenReq(GameSession session, byte[] payload) {
        try {
            var req = GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, Crypto.CUR_SIGNING_KEY);

            var client_seed_encrypted = Utils.base64Decode(req.getClientRandKey());
            session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onGetPlayerTokenRsp(GameSession session, byte[] payload) {
        try {
            var rsp = GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.parseFrom(payload);

            if (rsp.getRetcode() == 0) {
                long encrypt_seed;
                if ((encrypt_seed = rsp.getSecretKeySeed()) == 0) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.DECRYPT_MODE, Crypto.getPriKey(rsp.getKeyId()));
                    byte[] seed_bytes = cipher.doFinal(Utils.base64Decode(rsp.getServerRandKey()));
                    encrypt_seed = ByteBuffer.wrap(seed_bytes).getLong() ^ session.getClientSeed();
                }

                var encrypt_key = MT19937.generateKey(encrypt_seed);

                session.setEncryptKey(encrypt_key);

                // Set session state
                session.setState(GameSession.SessionState.ACTIVE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
