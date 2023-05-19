package emu.protoshift;

import emu.protoshift.config.ConfigContainer;
import emu.protoshift.config.Configuration;

import emu.protoshift.server.game.GameServer;

import emu.protoshift.utils.*;

import lombok.Getter;

import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

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

        // Load keys from buffers.
        Crypto.loadKeys();
    }

    public static void main(String[] args) {
        // Parse arguments.
        for (String arg : args) {
            if (arg.equalsIgnoreCase("-version")) {
                System.out.println("ProtoShift version: " + BuildConfig.VERSION + "-" + BuildConfig.GIT_HASH);
                System.exit(0);
            }
            if (arg.equalsIgnoreCase("-debug")) {
                Configuration.DEBUG_MODE_INFO = Configuration.DebugMode.ALL;
            }
        }

        if(Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL) {
            logger.setLevel(ch.qos.logback.classic.Level.DEBUG);
            logger.info("Debug mode enabled.");
        }

        // Initialize server.
        logger.info("Starting Protoshift...");
        logger.info("Protoshift version: %s-%s".formatted(BuildConfig.VERSION, BuildConfig.GIT_HASH));

        // Create server instances.
        gameServer = new GameServer();

        // Open console.
        startConsole();
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

    public static void startConsole() {
        Terminal terminal = null;
        try {
            terminal = TerminalBuilder.builder().jna(true).build();
        } catch (Exception e) {
            try {
                // Fallback to a dumb jline terminal.
                terminal = TerminalBuilder.builder().dumb(true).build();
            } catch (Exception ignored) {
                // When dumb is true, build() never throws.
            }
        }
        var consoleLineReader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();

        logger.info("Done!");
        boolean isLastInterrupted = false;
        while (true) {
            try {
                consoleLineReader.readLine("");
            } catch (UserInterruptException e) {
                if (!isLastInterrupted) {
                    isLastInterrupted = true;
                    logger.info("Press Ctrl-C again to shutdown.");
                    continue;
                } else {
                    Runtime.getRuntime().exit(0);
                }
            }

            isLastInterrupted = false;
        }
    }
}
