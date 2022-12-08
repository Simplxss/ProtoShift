package emu.grasscutter.utils;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.encoder.Encoder;

import java.nio.charset.StandardCharsets;

public class ServerLogEventAppender<E> extends AppenderBase<E> {
    protected Encoder<E> encoder;

    @Override
    protected void append(E event) {
        byte[] byteArray = this.encoder.encode(event);
        String msg = new String(byteArray, StandardCharsets.UTF_8);
        String[] s = msg.split(" ");
        String[] split = s[1].split(":");
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < s.length; i++) {
            sb.append(s[i]).append(" ");
        }

        var notify = s[0] + " <" + getSubString(split[0], "m", "[") + ":" + getSubString(split[1], "m", "[") + "> " + sb;

    }

    public static String getSubString(String text, String left, String right) {
        String result = "";
        int zLen;
        if (left == null || left.isEmpty()) {
            zLen = 0;
        } else {
            zLen = text.indexOf(left);
            if (zLen > -1) {
                zLen += left.length();
            } else {
                zLen = 0;
            }
        }
        int yLen = text.indexOf(right, zLen);
        if (yLen < 0 || right.isEmpty()) {
            yLen = text.length();
        }
        result = text.substring(zLen, yLen);
        return result;
    }
}
