package emu.protoshift.server.packet.injecter;

import emu.protoshift.ProtoShift;
import emu.protoshift.net.newproto.GetPlayerTokenReqOuterClass;
import emu.protoshift.net.oldproto.GetPlayerTokenRspOuterClass;

import emu.protoshift.server.game.GameSession;

import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.MT19937;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.util.Base64;

public class HandleLogin {
    public static void onGetPlayerTokenReq(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenReq injected");
        try {
            var req = GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, Crypto.CUR_SIGNING_KEY);

            byte[] client_seed_encrypted = Base64.getDecoder().decode(req.getClientRandKey());
            session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onGetPlayerTokenRsp(GameSession session, byte[] payload) {
        ProtoShift.getLogger().info("GetPlayerTokenRsp injected");
        try {
            var rsp = GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.parseFrom(payload);

            if (rsp.getRetcode() == 0) {
                long encrypt_seed;
                if ((encrypt_seed = rsp.getSecretKeySeed()) == 0) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.DECRYPT_MODE, Crypto.getPriKey(rsp.getKeyId()));
                    byte[] seed_bytes_encrypted = Base64.getDecoder().decode(rsp.getServerRandKey());
                    encrypt_seed = ByteBuffer.wrap(cipher.doFinal(seed_bytes_encrypted)).getLong() ^ session.getClientSeed();
                }

                byte[] encrypt_key = MT19937.generateKey(encrypt_seed);

                session.setUid(rsp.getUid());
                session.setEncryptKey(encrypt_key);

                // Set session state
                session.setState(GameSession.SessionState.ACTIVE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
