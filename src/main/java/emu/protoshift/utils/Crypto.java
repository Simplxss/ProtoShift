package emu.protoshift.utils;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

import emu.protoshift.ProtoShift;

public final class Crypto {
    public static byte[] DISPATCH_KEY;

    public static PrivateKey CUR_SIGNING_KEY;

    public static void loadKeys() {
        DISPATCH_KEY = FileUtils.readResource("/keys/dispatchKey.bin");
        try {
            CUR_SIGNING_KEY = KeyFactory.getInstance("RSA")
                    .generatePrivate(new PKCS8EncodedKeySpec(FileUtils.readResource("/keys/SigningKey.der")));
        } catch (Exception e) {
            ProtoShift.getLogger().error("An error occurred while loading keys.", e);
        }
    }

    public static void xor(byte[] packet, byte[] key, boolean skip_enc) {
        if (!skip_enc) {
            try {
                for (int i = 0; i < packet.length; i++) {
                    packet[i] ^= key[i % key.length];
                }
            } catch (Exception e) {
                ProtoShift.getLogger().error("Crypto error.", e);
            }
        }
    }

    public static PrivateKey getPriKey(int keyId) {
        try {
            return KeyFactory.getInstance("RSA")
                    .generatePrivate(new PKCS8EncodedKeySpec(FileUtils.readResource("/keys/game_keys/" + keyId + ".der")));
        } catch (Exception e) {
			ProtoShift.getLogger().error("An error occurred while loading keys.", e);
            throw new RuntimeException(e);
        }
    }
}
