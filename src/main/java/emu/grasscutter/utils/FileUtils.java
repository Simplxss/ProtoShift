package emu.grasscutter.utils;

import emu.grasscutter.Grasscutter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public final class FileUtils {

	public static void write(String dest, byte[] bytes) {
		Path path = Path.of(dest);

		try {
			Files.write(path, bytes);
		} catch (IOException e) {
			Grasscutter.getLogger().warn("Failed to write file: " + dest);
		}
	}

	public static void writeString(String dest , String info){
		write(dest, info.getBytes(StandardCharsets.UTF_8));
	}

	public static byte[] readResource(String resourcePath) {
		try (InputStream is = Grasscutter.class.getResourceAsStream(resourcePath)) {
			return is.readAllBytes();
		} catch (Exception exception) {
			Grasscutter.getLogger().warn("Failed to read resource: " + resourcePath);
			exception.printStackTrace();
		}

		return new byte[0];
	}

	@Deprecated  // No current uses of this anyway
	public static String getFilenameWithoutPath(String fileName) {
		int i = fileName.lastIndexOf(".");
		if (i > 0) {
			return fileName.substring(0, i);
		} else {
			return fileName;
		}
	}

}