package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;

import emu.protoshift.config.Configuration;

import emu.protoshift.server.packet.PacketHandler;
import emu.protoshift.utils.Utils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.DefaultEventLoop;
import io.netty.channel.EventLoop;
import kcp.highway.ChannelConfig;
import kcp.highway.KcpListener;
import kcp.highway.KcpServer;
import kcp.highway.Ukcp;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

public final class GameServer extends KcpServer implements KcpListener {
    private static final Map<GameSession, EventLoop> selector = new HashMap<>();
    private static final Map<Ukcp, GameSession> sessions = new HashMap<>();

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
        if (Configuration.GAME.bindAddress.isEmpty()) {
            address = new InetSocketAddress(Configuration.GAME.bindPort);
        } else {
            address = new InetSocketAddress(
                    Configuration.GAME.bindAddress,
                    Configuration.GAME.bindPort
            );
        }

        // Initialize packet handlers.
        PacketHandler.init();

        // Initialize KCP server.
        this.init(this, channelConfig, address);

        ProtoShift.getLogger().info("ProtoShift is FREE software. If you have paid for this, you may have been scammed. Homepage: https://github.com/YuFanXing/ProtoShift");
        ProtoShift.getLogger().info("Game Server started on port " + address.getPort());

        Runtime.getRuntime().addShutdownHook(new Thread(this::onServerShutdown));
    }

    public void onServerShutdown() {
        for (GameSession session : sessions.values()) {
            session.close();
        }
    }

    @Override
    public void onConnected(Ukcp ukcp) {
        ProtoShift.getLogger().info("new connection from: " + ukcp.user().getRemoteAddress());
        ukcp.setByteBufAllocator(new UnpooledByteBufAllocator(true));

        GameSession conversation = new GameSession(ukcp);

        selector.put(conversation, new DefaultEventLoop());
        sessions.put(ukcp, conversation);
    }

    @Override
    public void handleReceive(ByteBuf buf, Ukcp kcp) {
        byte[] byteData = Utils.byteBufToArray(buf);

        GameSession conversation = sessions.get(kcp);

        selector.get(conversation).execute(
                () -> {
                    if (conversation != null) {
                        PacketHandler.handlePacket(conversation, byteData, false);
                    }
                }
        );
    }

    @Override
    public void handleException(Throwable ex, Ukcp ukcp) {
        ProtoShift.getLogger().error("client exception: " + ukcp.user().getRemoteAddress(), ex);
    }

    @Override
    public void handleClose(Ukcp ukcp) {
        ProtoShift.getLogger().info("client disconnected: " + ukcp.user().getRemoteAddress());
        GameSession conversation = sessions.get(ukcp);
        if (conversation != null) {
            try {
                conversation.handleClose();
            } catch (Exception ignored) {
                ProtoShift.getLogger().error("Error while closing conversation");
            } finally {
                sessions.remove(ukcp);

                selector.get(conversation).shutdownGracefully();
                selector.remove(conversation);
            }

        }
    }
}
