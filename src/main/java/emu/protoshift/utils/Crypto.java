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

    public static void xor(byte[] packet, byte[] key) {
        try {
            for (int i = 0; i < packet.length; i++) {
                packet[i] ^= key[i % key.length];
            }
        } catch (Exception e) {
            ProtoShift.getLogger().error("Crypto error.", e);
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

    public static byte[] generateKey(long seed) {
        var mt = new MersenneTwister64();
        mt.setSeed(seed);
        mt.setSeed(mt.nextLong());
        mt.nextLong();
        byte[] key = new byte[4096];
        for (int i = 0; i < 4096 >> 3; i++) {
            var rand = mt.nextLong();
            key[i << 3] = (byte) (rand >> 56);
            key[(i << 3) + 1] = (byte) (rand >> 48);
            key[(i << 3) + 2] = (byte) (rand >> 40);
            key[(i << 3) + 3] = (byte) (rand >> 32);
            key[(i << 3) + 4] = (byte) (rand >> 24);
            key[(i << 3) + 5] = (byte) (rand >> 16);
            key[(i << 3) + 6] = (byte) (rand >> 8);
            key[(i << 3) + 7] = (byte) rand;
        }
        return key;
    }
}
