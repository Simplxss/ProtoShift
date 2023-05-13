package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;

import emu.protoshift.config.Configuration;

import kcp.highway.ChannelConfig;
import kcp.highway.KcpServer;

import java.net.InetSocketAddress;

public final class GameServer extends KcpServer {
    public GameServer() {
        // Start KCP server.
        ChannelConfig channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, Configuration.GAME.kcpInterval, 2, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(30 * 1000);//30s
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);

        InetSocketAddress address;
        if (Configuration.GAME.bindAddress.equals("")) {
            address = new InetSocketAddress(Configuration.GAME.bindPort);
        } else {
            address = new InetSocketAddress(
                    Configuration.GAME.bindAddress,
                    Configuration.GAME.bindPort
            );
        }

        // Initialize packet handlers.
        GameServerPacketHandler.init();

        // Initialize KCP server.
        this.init(GameSessionManager.getListener(), channelConfig, address);

        ProtoShift.getLogger().info("Protoshift is FREE software. If you have paid for this, you may have been scammed. Homepage: https://github.com/YuFanXing/ProtoShift");
        ProtoShift.getLogger().info("Game Server started on port %s".formatted(Integer.toString(address.getPort())));

        Runtime.getRuntime().addShutdownHook(new Thread(this::onServerShutdown));
    }

    public void onServerShutdown() {
        for (GameSession session : GameSessionManager.getSessions().values()) {
            session.close();
        }
    }
}
