package emu.protoshift.utils;

import emu.protoshift.ProtoShift;

import java.io.InputStream;

public final class FileUtils {
    public static byte[] readResource(String resourcePath) {
        try (InputStream is = ProtoShift.class.getResourceAsStream(resourcePath)) {
            assert is != null;
            return is.readAllBytes();
        } catch (Exception exception) {
            ProtoShift.getLogger().warn("Failed to read resource: " + resourcePath);
            exception.printStackTrace();
        }

        return new byte[0];
    }
}