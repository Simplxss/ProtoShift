package emu.grasscutter.server.game;

import java.util.ArrayList;
import java.util.List;

public class HandlerManager {
    private final GameSession session;
    private final List<Handler> handler;

    public HandlerManager(GameSession session){
        this.session = session;
        handler = new ArrayList<>();
    }

    public GameSession getSession() {
        return session;
    }

    public List<Handler> getHandler() {
        return handler;
    }

    public void addHandler(Handler handler){
        if (handler == null || this.handler.contains(handler))
            return;

        this.handler.add(handler);
    }
}
