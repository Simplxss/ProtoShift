package emu.protoshift.config;

/**
 * *when your JVM fails*
 */
public class ConfigContainer {
    public Server server = new Server();
    public Remote remote = new Remote();

    public static class Server {
        public DebugMode debugMode = DebugMode.NONE;
        public Game game = new Game();
        public Console console = new Console();
    }

    public static class Remote {
        public GateServer gateserver = new GateServer();
        public MuipServer muipserver = new MuipServer();
    }

    public enum DebugMode {
        ALL, NONE
    }

    public static class Game {
        public String bindAddress = "0.0.0.0";
        public int bindPort = 22102;
        public int kcpInterval = 20;
        public boolean disableVersionCheck = true;
    }

    public static class Console {
        public boolean enabled = false;
        public int consoleUid = 1;
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
