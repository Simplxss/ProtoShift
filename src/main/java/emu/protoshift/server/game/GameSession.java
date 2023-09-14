package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketOpcodesUtil;

import emu.protoshift.config.Configuration;
import emu.protoshift.server.packet.PacketHandler;
import emu.protoshift.utils.Crypto;
import emu.protoshift.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import kcp.highway.ChannelConfig;
import kcp.highway.KcpClient;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;

import lombok.Getter;
import lombok.Setter;

import java.net.InetSocketAddress;

public class GameSession {

    @Getter
    @Setter
    private int uid;

    @Getter
    @Setter
    private long clientSeed;

    @Getter
    @Setter
    boolean isOnHandleConsoleCmd;

    @Getter
    @Setter
    boolean isOnHandlePullConsoleChat;

    @Getter
    @Setter
    boolean isOnHandleGetConsoleSocialDetail;


    @Getter
    @Setter
    private SessionState state = SessionState.WAITING_FOR_TOKEN;

    @Getter
    @Setter
    private byte[] encryptKey;

    private Ukcp KCP_server;
    private final KCP KCP_client = new KCP();

    private class KCP implements KcpListener {
        private Ukcp ukcp;

        @Override
        public void onConnected(Ukcp ukcp) {
            ProtoShift.getLogger().info("server connected: " + ukcp.user().getRemoteAddress());
            this.ukcp = ukcp;
        }

        @Override
        public void handleReceive(ByteBuf buf, Ukcp kcp) {
            byte[] byteData = Utils.byteBufToArray(buf);
            PacketHandler.handlePacket(GameSession.this, byteData, true);
        }

        @Override
        public void handleException(Throwable ex, Ukcp ukcp) {
            ProtoShift.getLogger().error("server exception: " + ukcp.user().getRemoteAddress(), ex);
        }

        @Override
        public void handleClose(Ukcp ukcp) {
            ProtoShift.getLogger().info("server disconnected: " + ukcp.user().getRemoteAddress());
            this.ukcp = null;
            if (KCP_server != null) {
                KCP_server.close();
            }
            GameSession.this.setState(SessionState.INACTIVE);
        }

        public void send(ByteBuf buf) {
            for (int retry = 1; retry <= 3; retry++) {
                if (ukcp != null) {
                    ukcp.write(buf);
                    return;
                } else {
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException ignored) {
                    }
                }
            }
            ProtoShift.getLogger().error("server not connected");
        }

        public void close() {
            if (ukcp != null)
                ukcp.close();
        }
    }

    public GameSession(Ukcp ukcp) {
        KCP_server = ukcp;

        ChannelConfig channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, Configuration.GAME.kcpInterval, 2, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(30 * 1000);//30s
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);

        KcpClient kcpClient = new KcpClient();
        kcpClient.init(channelConfig, KCP_client);

        kcpClient.connect(new InetSocketAddress(Configuration.GATE_SERVER.ip, Configuration.GATE_SERVER.port), channelConfig);
    }

    public void send(BasePacket packet) {
        // Test
        if (packet.getOpcode().value <= 0) {
            ProtoShift.getLogger().warn("Tried to send packet with missing cmd id!");
            return;
        }

        ProtoShift.getLogger().info("Send packet (" + packet.getOpcode().value + ", " + packet.getOpcode().type + "): " + PacketOpcodesUtil.getOpcodeName(packet.getOpcode()));
        if (Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL)
            ProtoShift.getLogger().debug(Utils.bytesToHex(packet.getData()));

        if (KCP_server != null) {
            var data = packet.build();
            switch (packet.getEncryptType()) {
                case NONE -> {
                }
                case DISPATCH_KEY -> Crypto.xor(data, Crypto.DISPATCH_KEY);
                case ENCRYPT_KEY -> Crypto.xor(data, encryptKey);
            }

            ByteBuf buf = Unpooled.wrappedBuffer(data);
            switch (packet.getOpcode().type) {
                case 1 -> KCP_server.write(buf);
                case 2 -> KCP_client.send(buf);
            }
            buf.release();
        }
    }

    public void handleClose() {
        setState(SessionState.INACTIVE);

        KCP_client.close();
        KCP_server = null;
    }

    public void close() {
        if (KCP_server != null) {
            KCP_server.close();
            KCP_server = null;
        }
        KCP_client.close();
    }

    public enum SessionState {
        INACTIVE,
        WAITING_FOR_TOKEN,
        ACTIVE
    }
}
