package emu.grasscutter.server.game;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.utils.Utils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.DefaultEventLoop;
import io.netty.channel.EventLoop;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;

import java.util.HashMap;
import java.util.Map;

public class GameSessionManager {
    private static final Map<GameSession, EventLoop> selector;
    private static final Map<Ukcp, GameSession> sessions = new HashMap<>();
    private static final Map<GameSession, HandlerManager> handlerManager = new HashMap<>();
    private static final KcpListener listener = new KcpListener() {

        @Override
        public void onConnected(Ukcp ukcp) {
            int times = 0;
            GameServer server = Grasscutter.getGameServer();
            while (server == null) {//Waiting server to establish
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    ukcp.close();
                    return;
                }
                if (times++ > 5) {
                    Grasscutter.getLogger().error("Service is not available!");
                    ukcp.close();
                    return;
                }
                server = Grasscutter.getGameServer();

            }

            var allocator
                    = Grasscutter.getConfig().server.game.kcpConfig.isPoolAllocator ?
                    new PooledByteBufAllocator(!Grasscutter.getConfig().server.game.kcpConfig.isHeapAllocator) :
                    new UnpooledByteBufAllocator(!Grasscutter.getConfig().server.game.kcpConfig.isHeapAllocator);

            ukcp.setByteBufAllocator(allocator);

            GameSession conversation = new GameSession(server);

            selector
                    .put(conversation, new DefaultEventLoop());

            handlerManager
                    .put(conversation, new HandlerManager(conversation));

            conversation.onConnected(new KcpTunnel() {
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

            sessions.put(ukcp, conversation);
        }

        @Override
        public void handleReceive(ByteBuf buf, Ukcp kcp) {
            byte[] byteData = Utils.byteBufToArray(buf);

            GameSession conversation = sessions.get(kcp);

            selector.get(conversation).execute(
                    () -> {
                        if (conversation != null) {
                            GameServerPacketHandler.handlePacket(conversation, byteData, false);
                        }
                    }
            );
        }

        @Override
        public void handleException(Throwable ex, Ukcp ukcp) {
        }

        @Override
        public void handleClose(Ukcp ukcp) {
            GameSession conversation = sessions.get(ukcp);
            if (conversation != null) {
                try {
                    conversation.handleClose();
                } catch (Exception ignored) {
                    Grasscutter.getLogger().error("Error while closing conversation");
                } finally {
                    sessions.remove(ukcp);

                    selector.get(conversation).shutdownGracefully();
                    selector.remove(conversation);
                    handlerManager.remove(conversation);
                }

            }
        }

    };

    public static Map<Ukcp, GameSession> getSessions() {
        return sessions;
    }

    public static Map<GameSession, EventLoop> getLogicThreadGroup() {
        return selector;
    }

    public static Map<GameSession, HandlerManager> getHandlerManager() {
        return handlerManager;
    }

    static {
        selector = new HashMap<>();
    }


    public static KcpListener getListener() {
        return listener;
    }

    interface KcpTunnel {
        void writeData(byte[] bytes);

        void close();
    }
}
