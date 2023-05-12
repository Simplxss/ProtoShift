package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;

import kcp.highway.ChannelConfig;
import kcp.highway.KcpServer;

import java.net.InetSocketAddress;

import static emu.protoshift.utils.Language.translate;

public final class GameServer extends KcpServer {
    public GameServer() {

        // Start KCP server.
        ChannelConfig channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, ProtoShift.getConfig().server.game.kcpInterval, 2, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(30 * 1000);//30s
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);

        InetSocketAddress address;
        if (ProtoShift.getConfig().server.game.bindAddress.equals("")) {
            address = new InetSocketAddress(ProtoShift.getConfig().server.game.bindPort);
        } else {
            address = new InetSocketAddress(
                    ProtoShift.getConfig().server.game.bindAddress,
                    ProtoShift.getConfig().server.game.bindPort
            );
        }

        // Initialize packet handlers.
        GameServerPacketHandler.init();

        // Initialize KCP server.
        this.init(GameSessionManager.getListener(), channelConfig, address);

        ProtoShift.getLogger().info(translate("messages.status.free_software"));
        ProtoShift.getLogger().info(translate("messages.game.port_bind", Integer.toString(address.getPort())));

        Runtime.getRuntime().addShutdownHook(new Thread(this::onServerShutdown));
    }

    public void onServerShutdown() {
        for (GameSession session : GameSessionManager.getSessions().values()) {
            session.close();
        }
    }
}
