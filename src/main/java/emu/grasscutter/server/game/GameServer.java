package emu.grasscutter.server.game;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.PacketHandler;
import kcp.highway.ChannelConfig;
import kcp.highway.KcpServer;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import static emu.grasscutter.Configuration.GAME_INFO;
import static emu.grasscutter.utils.Language.translate;

public final class GameServer extends KcpServer {
    private final InetSocketAddress address;

    private static InetSocketAddress getAdapterInetSocketAddress() {
        InetSocketAddress inetSocketAddress;
        if (GAME_INFO.bindAddress.equals("")) {
            inetSocketAddress = new InetSocketAddress(GAME_INFO.bindPort);
        } else {
            inetSocketAddress = new InetSocketAddress(
                    GAME_INFO.bindAddress,
                    GAME_INFO.bindPort
            );
        }
        return inetSocketAddress;
    }

    public GameServer() {
        this(getAdapterInetSocketAddress());
    }

    public GameServer(InetSocketAddress address) {
        ChannelConfig channelConfig = new ChannelConfig();
        var interval = Grasscutter.getConfig().server.game.kcpConfig.interval;
        var resend = Grasscutter.getConfig().server.game.kcpConfig.resend;
        var ackNoDelay = Grasscutter.getConfig().server.game.kcpConfig.ackNoDelay;
        var fastFlush = Grasscutter.getConfig().server.game.kcpConfig.fastFlush;
        var useConvChannel = Grasscutter.getConfig().server.game.kcpConfig.useConvChannel;
        var conv = Grasscutter.getConfig().server.game.kcpConfig.conv;
        var multiply = Grasscutter.getConfig().server.game.kcpConfig.multiply;

        channelConfig.nodelay(true, interval, resend, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(30 * 1000);//30s
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(ackNoDelay);
        channelConfig.setFastFlush(fastFlush);
        channelConfig.setUseConvChannel(useConvChannel);
        channelConfig.setConv(conv);
        // channelConfig.setMultiply(multiply);

        this.init(GameSessionManager.getListener(), channelConfig, address);

        this.address = address;
        // Hook into shutdown event.
        Runtime.getRuntime().addShutdownHook(new Thread(this::onServerShutdown));
    }

    public void start() {
        Grasscutter.getLogger().info(translate("messages.status.free_software"));
        Grasscutter.getLogger().info(translate("messages.game.port_bind", Integer.toString(address.getPort())));
    }

    public void onServerShutdown() {

        // Kick and save all players
        List<GameSession> list = new ArrayList<>(GameSessionManager.getSessions().size());
        list.addAll(GameSessionManager.getSessions().values());

        for (GameSession session : list) {
            session.getSession().close();
        }
    }
}
