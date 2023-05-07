package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;

import emu.protoshift.net.packet.BasePacket;
import emu.protoshift.net.packet.PacketOpcodesUtil;

import emu.protoshift.utils.ConfigContainer;
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

    @Getter @Setter
    private int uid;

    @Getter @Setter
    private long clientSeed;

    @Getter @Setter
    boolean isOnHandleConsoleCmd;

    @Getter @Setter
    boolean isOnHandlePullConsoleChat;

    private GameSessionManager.KcpTunnel tunnel;

    @Getter @Setter
    private SessionState state;

    @Getter @Setter
    private byte[] encryptKey;

    private final KCP KCP_client = new KCP();

    private class KCP implements KcpListener {
        private Ukcp ukcp;

        @Override
        public void onConnected(Ukcp ukcp) {
            this.ukcp = ukcp;
        }

        @Override
        public void handleReceive(ByteBuf buf, Ukcp kcp) {
            byte[] byteData = Utils.byteBufToArray(buf);
            GameServerPacketHandler.handlePacket(GameSession.this, byteData, true);
        }

        @Override
        public void handleException(Throwable ex, Ukcp ukcp) {
        }

        @Override
        public void handleClose(Ukcp ukcp) {
        }

        public void send(byte[] data) {

            for (int retry = 1; retry <= 3; retry++) {
                if (ukcp != null) {
                    ByteBuf buf = Unpooled.wrappedBuffer(data);
                    ukcp.write(buf);
                    buf.release();
                    return;
                } else {
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        ProtoShift.getLogger().error("server not connected");
                        return;
                    }
                }
            }
            ProtoShift.getLogger().error("server not connected");
        }

        public void close() {
            ukcp.close();
        }

        public KCP() {
            ChannelConfig channelConfig = new ChannelConfig();
            channelConfig.nodelay(true, ProtoShift.getConfig().server.game.kcpInterval, 2, true);
            channelConfig.setMtu(1400);
            channelConfig.setSndwnd(256);
            channelConfig.setRcvwnd(256);
            channelConfig.setTimeoutMillis(30 * 1000);//30s
            channelConfig.setUseConvChannel(true);
            channelConfig.setAckNoDelay(false);

            KcpClient kcpClient = new KcpClient();
            kcpClient.init(channelConfig, this);

            try {
                kcpClient.connect(new InetSocketAddress(ProtoShift.getConfig().remote.gateserver.ip, ProtoShift.getConfig().remote.gateserver.port), channelConfig);
            } catch (Throwable var2) {
                ProtoShift.getLogger().error("unable to connect to server");
            }

        }

    }

    public GameSession() {
        this.state = SessionState.WAITING_FOR_TOKEN;
    }

    public boolean tunnelIsEstablished() {
        return tunnel != null;
    }

    public void send(BasePacket packet) {
        // Test
        if (packet.getOpcode().value <= 0) {
            ProtoShift.getLogger().warn("Tried to send packet with missing cmd id!");
            return;
        }

        if (ProtoShift.getConfig().server.debugLevel == ConfigContainer.ServerDebugMode.ALL) {
            ProtoShift.getLogger().info("Send packet (" + packet.getOpcode().value + ", " + packet.getOpcode().type + "): " + PacketOpcodesUtil.getOpcodeName(packet.getOpcode()) + "\n"
                    + Utils.bytesToHex(packet.getData()));
        }

        if (tunnelIsEstablished()) {
            var data = packet.build();
            Crypto.xor(data, packet.isUseDispatchKey ? Crypto.DISPATCH_KEY : encryptKey, false);

            switch (packet.getOpcode().type) {
                case 1 -> tunnel.writeData(data);
                case 2 -> KCP_client.send(data);
            }
        }

    }

    public void onConnected(GameSessionManager.KcpTunnel tunnel) {
        this.tunnel = tunnel;
    }

    public void handleClose() {
        setState(SessionState.INACTIVE);

        KCP_client.close();
        tunnel = null;
    }

    public void close() {
        if (tunnel != null) {
            tunnel.close();
            KCP_client.close();
        }
    }

    public enum SessionState {
        INACTIVE,
        WAITING_FOR_TOKEN,
        ACTIVE
    }
}
