package emu.grasscutter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import emu.grasscutter.server.game.GameServer;
import emu.grasscutter.utils.ConfigContainer;
import emu.grasscutter.utils.Crypto;
import emu.grasscutter.utils.Language;
import emu.grasscutter.utils.Utils;

import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.io.*;

import static emu.grasscutter.utils.Language.translate;

public final class Grasscutter {
	private static final Logger log = LoggerFactory.getLogger(Grasscutter.class);
	private static LineReader consoleLineReader = null;
	
	private static Language language;

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	public static final File configFile = new File("./config.json");

	private static GameServer gameServer;

	public static ConfigContainer config;

	static {
		// Declare logback configuration.
		System.setProperty("logback.configurationFile", "src/main/resources/logback.xml");

		// Load server configuration.
		Grasscutter.loadConfig();
		// Attempt to update configuration.
		ConfigContainer.updateConfig();

		// Load translation files.
		Grasscutter.loadLanguage();

		// Check server structure.
		Utils.startupCheck();
	}

  	public static void main(String[] args) throws Exception {
		Crypto.loadKeys(); // Load keys from buffers.
		// Parse arguments.
		boolean exitEarly = false;
		for (String arg : args) {
            if (arg.toLowerCase().equals("-version")) {
                System.out.println("Grasscutter version: " + BuildConfig.VERSION + "-" + BuildConfig.GIT_HASH);
                exitEarly = true;
            }
			if (arg.toLowerCase().equals("-debug")) {
				Configuration.SERVER.debugLevel= ServerDebugMode.ALL;
			}
		} 
		
		// Exit early if argument sets it.
		if(exitEarly) System.exit(0);
	
		// Initialize server.
		Grasscutter.getLogger().info(translate("messages.status.starting"));
		Grasscutter.getLogger().info(translate("messages.status.game_version", GameConstants.VERSION));
		Grasscutter.getLogger().info(translate("messages.status.version", BuildConfig.VERSION, BuildConfig.GIT_HASH));
	
		// Create server instances.
		gameServer = new GameServer();
	
		// Start servers.
		gameServer.start();
	
		// Hook into shutdown event.
		Runtime.getRuntime().addShutdownHook(new Thread(Grasscutter::onShutdown));
	
		// Open console.
		startConsole();
 	}

	/**
	 * Server shutdown event.
	 */
	private static void onShutdown() {
	}

	/*
	 * Methods for the language system component.
	 */
	
	public static void loadLanguage() {
		var locale = config.language.language;
		language = Language.getLanguage(Utils.getLanguageCode(locale));
	}
	
	/*
	 * Methods for the configuration system component.
	 */

	/**
	 * Attempts to load the configuration from a file.
	 */
	public static void loadConfig() {
		// Check if config.json exists. If not, we generate a new config.
		if (!configFile.exists()) {
			getLogger().info("config.json could not be found. Generating a default configuration ...");
			config = new ConfigContainer();
			Grasscutter.saveConfig(config);
			return;
		} 

		// If the file already exists, we attempt to load it.
		try (FileReader file = new FileReader(configFile)) {
			config = gson.fromJson(file, ConfigContainer.class);
		} catch (Exception exception) {
			getLogger().error("There was an error while trying to load the configuration from config.json. Please make sure that there are no syntax errors. If you want to start with a default configuration, delete your existing config.json.");
			System.exit(1);
		} 
	}

	/**
	 * Saves the provided server configuration.
	 * @param config The configuration to save, or null for a new one.
	 */
	public static void saveConfig(@Nullable ConfigContainer config) {
		if(config == null) config = new ConfigContainer();
		
		try (FileWriter file = new FileWriter(configFile)) {
			file.write(gson.toJson(config));
		} catch (IOException ignored) {
			Grasscutter.getLogger().error("Unable to write to config file.");
		} catch (Exception e) {
			Grasscutter.getLogger().error("Unable to save config file.", e);
		}
	}

	/*
	 * Getters for the various server components.
	 */
	
	public static ConfigContainer getConfig() {
		return config;
	}

	public static Language getLanguage() {
		return language;
	}

	public static Language getLanguage(String langCode) {
        return Language.getLanguage(langCode);
	}

	public static Logger getLogger() {
		return log;
	}

	public static LineReader getConsole() {
		if (consoleLineReader == null) {
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
			consoleLineReader = LineReaderBuilder.builder()
					.terminal(terminal)
					.build();
		}
		return consoleLineReader;
	}

	public static Gson getGsonFactory() {
		return gson;
	}

	public static GameServer getGameServer() {
		return gameServer;
	}

	public static void startConsole() {
		//npe
		getConsole();

		getLogger().info(translate("messages.status.done"));
		boolean isLastInterrupted = false;
		while (config.server.game.enableConsole) {
			try {
				consoleLineReader.readLine("> ");
			} catch (UserInterruptException e) {
				if (!isLastInterrupted) {
					isLastInterrupted = true;
					Grasscutter.getLogger().info("Press Ctrl-C again to shutdown.");
					continue;
				} else {
					Runtime.getRuntime().exit(0);
				}
			} catch (EndOfFileException e) {
				Grasscutter.getLogger().info("EOF detected.");
				continue;
			} catch (IOError e) {
				Grasscutter.getLogger().error("An IO error occurred.", e);
				continue;
			}

			isLastInterrupted = false;
		}
	}


	public enum ServerDebugMode {
		ALL, MISSING, NONE
	}
}
