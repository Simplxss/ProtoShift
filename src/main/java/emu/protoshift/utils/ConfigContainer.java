package emu.protoshift.utils;

import java.util.Locale;

/**
 * *when your JVM fails*
 */
public class ConfigContainer {
    public Language language = new Language();
    public Server server = new Server();
    public Remote remote = new Remote();

    public static class Language {
        public Locale language = Locale.getDefault();
        public Locale fallback = Locale.US;
    }

    public static class Server {
        public ServerDebugMode debugLevel = ServerDebugMode.NONE;

        public Game game = new Game();

        public Console console = new Console();
    }

    public static class Remote {
        public GateServer gateserver = new GateServer();
        public MuipServer muipserver = new MuipServer();
    }

    public enum ServerDebugMode {
        ALL, NONE
    }

    public static class Game {
        public String bindAddress = "0.0.0.0";
        public int bindPort = 22102;
        public int kcpInterval = 20;
    }

    public static class Console {
        public boolean enabled = true;
        public int consoleUid = 0;
        public String consoleNickname = "ProtoShift";
        public int consoleLevel = 60;
        public int consoleWorldLevel = 8;
        public String consoleSignature = "Debug the world!";
        public int consoleNameCardId = 210001;
        public int consoleAvatarId = 10000077;
        public int consoleCostumeId = 0;
        public String consoleWelcomeText = "Welcome to connect ProtoShift Alpha!";
    }

    public static class GateServer {
        public String ip = "127.0.0.1";
        public int port = 20041;
    }

    public static class MuipServer {
        public String address = "http://127.0.0.1:20011/api";
        public String region = "dev_gio";
    }
}
