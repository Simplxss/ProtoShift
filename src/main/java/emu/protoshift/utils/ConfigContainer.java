package emu.protoshift.utils;

import com.google.gson.JsonObject;

import emu.protoshift.ProtoShift;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;

/**
 * *when your JVM fails*
 */
public class ConfigContainer {
    public Language language = new Language();
    public Server server = new Server();

    // DO NOT. TOUCH. THE VERSION NUMBER.
    public int version = version();

    public enum ServerDebugMode {
        ALL, NONE
    }

    public static class Server {
        public ServerDebugMode debugLevel = ServerDebugMode.NONE;

        public Game game = new Game();
    }


    public static class Language {
        public Locale language = Locale.getDefault();
        public Locale fallback = Locale.US;
    }

    public static class Game {
        public String bindAddress = "0.0.0.0";
        public int bindPort = 22102;
        public int kcpInterval = 20;
        public String remoteAddress = "127.0.0.1";
        public int remotePort = 20041;
    }


    private static int version() {
        return 3;
    }

    /**
     * Attempts to update the server's existing configuration to the latest
     */
    public static void updateConfig() {
        try { // Check if the server is using a legacy config.
            var configObject = JsonUtils.loadToClass(new FileReader(ProtoShift.configFile), JsonObject.class);
            if (!configObject.has("version")) {
                ProtoShift.getLogger().info("Updating legacy ..");
                ProtoShift.saveConfig(new ConfigContainer());
            }
        } catch (Exception ignored) {
        }

        var existing = ProtoShift.getConfig().version;
        var latest = version();

        if (existing == latest)
            return;

        // Create a new configuration instance.
        ConfigContainer updated = new ConfigContainer();
        // Update all configuration fields.
        Field[] fields = ConfigContainer.class.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            try {
                field.set(updated, field.get(ProtoShift.getConfig()));
            } catch (Exception exception) {
                ProtoShift.getLogger().error("Failed to update a configuration field.", exception);
            }
        });
        updated.version = version();

        try { // Save configuration & reload.
            ProtoShift.saveConfig(updated);
            ProtoShift.loadConfig();
        } catch (Exception exception) {
            ProtoShift.getLogger().warn("Failed to inject the updated ", exception);
        }
    }
}
