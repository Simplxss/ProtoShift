package emu.grasscutter.utils;

import com.google.gson.JsonObject;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.Grasscutter.ServerDebugMode;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;

import static emu.grasscutter.Grasscutter.config;

/**
 * *when your JVM fails*
 */
public class ConfigContainer {
    private static int version() {
        return 3;
    }

    /**
     * Attempts to update the server's existing configuration to the latest
     */
    public static void updateConfig() {
        try { // Check if the server is using a legacy config.
            JsonObject configObject = Grasscutter.getGsonFactory()
                    .fromJson(new FileReader(Grasscutter.configFile), JsonObject.class);
            if (!configObject.has("version")) {
                Grasscutter.getLogger().info("Updating legacy ..");
                Grasscutter.saveConfig(null);
            }
        } catch (Exception ignored) {
        }

        var existing = config.version;
        var latest = version();

        if (existing == latest)
            return;

        // Create a new configuration instance.
        ConfigContainer updated = new ConfigContainer();
        // Update all configuration fields.
        Field[] fields = ConfigContainer.class.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            try {
                field.set(updated, field.get(config));
            } catch (Exception exception) {
                Grasscutter.getLogger().error("Failed to update a configuration field.", exception);
            }
        });
        updated.version = version();

        try { // Save configuration & reload.
            Grasscutter.saveConfig(updated);
            Grasscutter.loadConfig();
        } catch (Exception exception) {
            Grasscutter.getLogger().warn("Failed to inject the updated ", exception);
        }
    }

    public Language language = new Language();
    public Server server = new Server();

    // DO NOT. TOUCH. THE VERSION NUMBER.
    public int version = version();

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
        public KCPConfig kcpConfig = new KCPConfig();
        public boolean tickWhenHandlePacket = true;
        public int tick = 0;

        public String remoteAddress = "127.0.0.1";
        public int remotePort = 22102;

        public boolean enableConsole = true;
    }

    public static class KCPConfig {
        public int interval = 20;
        public int resend = 2;
        public boolean ackNoDelay = true;
        public boolean fastFlush = true;
        public boolean isPoolAllocator = true;
        public boolean isHeapAllocator = false;
        public boolean useConvChannel = true;
        public long conv = 1L;
        public int multiply = 2;
    }


}
