package emu.grasscutter;

import emu.grasscutter.utils.ConfigContainer;

import java.util.Locale;

import static emu.grasscutter.Grasscutter.config;


/**
 * A data container for the server's configuration.
 * 
 * Use `import static emu.grasscutter.Configuration.*;`
 * to import all configuration constants.
 */
public final class Configuration extends ConfigContainer {
    
    /*
     * Constants
     */


    public static final Locale FALLBACK_LANGUAGE = config.language.fallback;

    public static final Server SERVER = config.server;

    public static final Game GAME_INFO = config.server.game;

}
