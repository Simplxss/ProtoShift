package emu.grasscutter.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import emu.grasscutter.ProtoShift;
import io.netty.buffer.ByteBuf;

import javax.annotation.Nullable;


@SuppressWarnings({"UnusedReturnValue", "BooleanMethodIsAlwaysInverted"})
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

	/**
	 * Creates a string with the path to a file.
	 * @param path The path to the file.
	 * @return A path using the operating system's file separator.
	 */
	public static String toFilePath(String path) {
		return path.replace("/", File.separator);
	}

	/**
	 * Retrieves a string from an input stream.
	 * @param stream The input stream.
	 * @return The string.
	 */
	public static String readFromInputStream(@Nullable InputStream stream) {
		if(stream == null) return "empty";
		
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
			String line; while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
			} stream.close();
		} catch (IOException e) {
			ProtoShift.getLogger().warn("Failed to read from input stream.");
		} catch (NullPointerException ignored) {
			return "empty";
		} return stringBuilder.toString();
	}

	/**
	 * Gets the language code from a given locale.
	 * @param locale A locale.
	 * @return A string in the format of 'XX-XX'.
	 */
	public static String getLanguageCode(Locale locale) {
		return String.format("%s-%s", locale.getLanguage(), locale.getCountry());
	}

	/**
	 * Base64 decodes a given string.
	 * @param toDecode A base64 encoded string.
	 * @return An array of bytes.
	 */
	public static byte[] base64Decode(String toDecode) {
		return Base64.getDecoder().decode(toDecode);
	}


}
