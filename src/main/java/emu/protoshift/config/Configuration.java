package emu.protoshift.config;

import static emu.protoshift.ProtoShift.config;

/**
 * A data container for the server's configuration.
 * <p>
 * Use `import static emu.grasscutter.Configuration.*;`
 * to import all configuration constants.
 */
public final class Configuration extends ConfigContainer {
    public static DebugMode DEBUG_MODE_INFO = config.server.debugMode;
    public static final HTTP HTTP = config.server.http;

    public static final Game GAME = config.server.game;

    public static final Console CONSOLE = config.server.console;
    public static final SDKServer SDK_SERVER = config.remote.sdkserver;
    public static final DispatchServer DISPATCH_SERVER = config.remote.dispatchserver;

    public static final GateServer GATE_SERVER = config.remote.gateserver;

    public static final MuipServer MUIP_SERVER = config.remote.muipserver;
}
