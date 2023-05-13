package emu.protoshift.utils;


import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class JsonUtils {
    static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Deprecated(forRemoval = true)
    public static Gson getGsonFactory() {
        return gson;
    }

    /*
     * Encode an object to a JSON string
     */
    public static String encode(Object object) {
        return gson.toJson(object);
    }

    public static <T> T loadToClass(InputStreamReader fileReader, Class<T> classType) throws IOException {
        return gson.fromJson(fileReader, classType);
    }

}