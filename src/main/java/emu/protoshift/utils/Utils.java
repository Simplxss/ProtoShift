package emu.protoshift.utils;

import io.netty.buffer.ByteBuf;

public final class Utils {
	private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

	public static String bytesToHex(byte[] bytes) {
		if (bytes == null) return "";
	    char[] hexChars = new char[bytes.length * 2];
	    for (int j = 0; j < bytes.length; j++) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = HEX_ARRAY[v >>> 4];
	        hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public static byte[] byteBufToArray(ByteBuf buf) {
		byte[] bytes = new byte[buf.capacity()];
		buf.getBytes(0, bytes);
		return bytes;
	}
}
