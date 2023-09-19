package emu.protoshift.config;

/**
 * *when your JVM fails*
 */
public class ConfigContainer {
    public Server server = new Server();
    public Remote remote = new Remote();

    public static class Server {
        public DebugMode debugMode = DebugMode.NONE;
        public HTTP http = new HTTP();
        public Game game = new Game();
        public Console console = new Console();
    }

    public static class Remote {
        public SDKServer sdkserver = new SDKServer();
        public DispatchServer dispatchserver = new DispatchServer();
        public GateServer gateserver = new GateServer();
        public MuipServer muipserver = new MuipServer();
    }

    public enum DebugMode {
        ALL, NONE
    }

    public static class Encryption {
        public boolean useEncryption = true;
        /* Should 'https' be appended to URLs? */
        public boolean useInRouting = true;
        public String keystore = "./keystore.p12";
        public String keystorePassword = "123456";
    }

    public static class Policies {
        public Policies.CORS cors = new Policies.CORS();

        public static class CORS {
            public boolean enabled = true;
            public String[] allowedOrigins = new String[]{"*"};
        }
    }

    public static class HTTP {
        /* This starts the HTTP server before the game server. */
        public boolean startImmediately = false;

        public String bindAddress = "0.0.0.0";
        public int bindPort = 443;

        /* This is the address used in URLs. */
        public String accessAddress = "127.0.0.1";
        /* This is the port used in URLs. */
        public int accessPort = 0;

        public Encryption encryption = new Encryption();
        public Policies policies = new Policies();
    }

    public static class Game {
        /* This starts the HTTP server before the game server. */
        public String bindAddress = "0.0.0.0";
        public int bindPort = 22102;

        /* This is the address used in URLs. */
        public String accessAddress = "127.0.0.1";
        /* This is the port used in URLs. */
        public int accessPort = 0;

        public int kcpInterval = 20;
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

    public static class SDKServer {
        public String address = "https://hk4e-sdk.mihoyo.com";
    }

    public static class DispatchServer {
        public String address = "https://dispatchcnglobal.yuanshen.com";
        public String region = "cn_gf01";
    }

    public static class GateServer {
        public boolean enable = false;
        public String ip = "127.0.0.1";
        public int port = 20041;
    }

    public static class MuipServer {
        public String address = "http://127.0.0.1:20011/api";
        public String region = "dev_gio";
    }
}
