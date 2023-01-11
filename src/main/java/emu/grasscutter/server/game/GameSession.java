package emu.grasscutter.server.game;

import emu.grasscutter.ProtoShift;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodesUtil;

import emu.grasscutter.utils.ConfigContainer;
import emu.grasscutter.utils.Crypto;
import emu.grasscutter.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import kcp.highway.ChannelConfig;
import kcp.highway.KcpClient;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;

import java.net.InetSocketAddress;

public class GameSession {
    private final GameServer server;
    private GameSessionManager.KcpTunnel tunnel;

    private SessionState state;

    private long ClientSeed;

    private byte[] encrypt_key;

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
                kcpClient.connect(new InetSocketAddress(ProtoShift.getConfig().server.game.remoteAddress, ProtoShift.getConfig().server.game.remotePort), channelConfig);
            } catch (Throwable var2) {
                ProtoShift.getLogger().error("unable to connect to server");
            }

        }

    }

    public GameSession(GameServer server) {
        this.server = server;
        this.state = SessionState.WAITING_FOR_TOKEN;
    }

    public GameSession getSession() {
        return this;
    }

    public GameServer getServer() {
        return server;
    }

    public boolean tunnelIsEstablished() {
        return tunnel != null;
    }

    public SessionState getState() {
        return state;
    }

    public void setState(SessionState state) {
        this.state = state;
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
            Crypto.xor(data, packet.isUseDispatchKey ? Crypto.DISPATCH_KEY : encrypt_key, false);

            switch (packet.getOpcode().type) {
                case 1:
                    tunnel.writeData(data);
                case 2:
                    KCP_client.send(data);
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

    public void setClientSeed(long ClientSeed) {
        this.ClientSeed = ClientSeed;
    }

    public long getClientSeed() {
        return this.ClientSeed;
    }

    public void setEncryptKey(byte[] encrypt_key) {
        this.encrypt_key = encrypt_key;
    }

    public byte[] getEncryptKey() {
        return this.encrypt_key;
    }

    public void close() {
        if (tunnel == null)
            return;

        tunnel.close();
        KCP_client.close();
    }

    public boolean isActive() {
        return getState() == SessionState.ACTIVE;
    }

    public enum SessionState {
        INACTIVE,
        WAITING_FOR_TOKEN,
        ACTIVE
    }
}
