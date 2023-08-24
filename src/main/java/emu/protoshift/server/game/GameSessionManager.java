package emu.protoshift.server.game;

import emu.protoshift.ProtoShift;
import emu.protoshift.server.packet.PacketHandler;
import emu.protoshift.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.DefaultEventLoop;
import io.netty.channel.EventLoop;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;

import java.util.HashMap;
import java.util.Map;

public class GameSessionManager {
    private static final Map<GameSession, EventLoop> selector = new HashMap<>();
    private static final Map<Ukcp, GameSession> sessions = new HashMap<>();
    private static final KcpListener listener = new KcpListener() {
        @Override
        public void onConnected(Ukcp ukcp) {
            ProtoShift.getLogger().info("new connection from: " + ukcp.user().getRemoteAddress());
            ukcp.setByteBufAllocator(new UnpooledByteBufAllocator(true));

            GameSession conversation = new GameSession(new KcpTunnel() {
                @Override
                public void writeData(byte[] bytes) {
                    ByteBuf buf = Unpooled.wrappedBuffer(bytes);
                    ukcp.write(buf);
                    buf.release();
                }

                @Override
                public void close() {
                    ukcp.close();
                }
            });

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

    };

    public static Map<Ukcp, GameSession> getSessions() {
        return sessions;
    }

    public static KcpListener getListener() {
        return listener;
    }

    interface KcpTunnel {
        void writeData(byte[] bytes);

        void close();
    }
}
