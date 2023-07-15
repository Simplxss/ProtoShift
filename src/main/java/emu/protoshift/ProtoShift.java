package emu.protoshift;

import emu.protoshift.config.ConfigContainer;
import emu.protoshift.config.Configuration;

import emu.protoshift.server.game.GameServer;

import emu.protoshift.utils.*;

import lombok.Getter;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public final class ProtoShift {
    @Getter
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ProtoShift.class);

    @Getter
    private static GameServer gameServer;

    public static ConfigContainer config;

    static {
        // Declare logback configuration.
        System.setProperty("logback.configurationFile", "src/main/resources/logback.xml");

        // Load server configuration.
        loadConfig();
        if (Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL) {
            logger.setLevel(ch.qos.logback.classic.Level.DEBUG);
            logger.info("Debug mode enabled.");
        }

        // Load keys from buffers.
        Crypto.loadKeys();
    }

    public static void main(String[] args) {

        // Initialize server.
        logger.info("Starting ProtoShift...");
        logger.info("ProtoShift version: " + BuildConfig.VERSION + "-" + BuildConfig.GIT_HASH);

        // Create server instances.
        gameServer = new GameServer();

        logger.info("Done!");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException ignored) {
        }
    }

    /*
     * Methods for the configuration system component.
     */

    /**
     * Attempts to load the configuration from a file.
     */
    public static void loadConfig() {
        var configFile = new File("./config.json");
        // Check if config.json exists. If not, we generate a new config.
        if (!configFile.exists()) {
            logger.info("config.json could not be found. Generating a default configuration ...");
            ProtoShift.saveConfig(new ConfigContainer());
            System.exit(1);
        }

        // If the file already exists, we attempt to load it.
        try {
            config = JsonUtils.loadToClass(new FileReader(configFile), ConfigContainer.class);
        } catch (Exception exception) {
            logger.error("There was an error while trying to load the configuration from config.json. Please make sure that there are no syntax errors. If you want to start with a default configuration, delete your existing config.json.");
            System.exit(1);
        }
    }

    /**
     * Saves the provided server configuration.
     *
     * @param config The configuration to save, or null for a new one.
     */
    public static void saveConfig(ConfigContainer config) {
        var configFile = new File("./config.json");
        try (FileWriter file = new FileWriter(configFile)) {
            file.write(JsonUtils.encode(config));
        } catch (Exception e) {
            logger.error("Unable to save config file.", e);
        }
    }
}