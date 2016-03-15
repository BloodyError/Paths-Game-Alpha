package com.bloodyerror.paths.gameloop;

import com.bloodyerror.gop.GameLoop.IDGameLoop;
import com.bloodyerror.paths.gamestate.GameStateManager;


public class GameLoop extends IDGameLoop {

    GameStateManager gameStateManager;

    public GameLoop(int width, int height) {
        super(width, height);
    }

    @Override
    public void init() {
        gameStateManager = new GameStateManager();
        gameStateManager.init();
        super.init();
    }

    @Override
    public void tick(double deltaTime) {
        gameStateManager.tick(deltaTime);
    }

    @Override
    public void render() {
        super.render();
        gameStateManager.render(graphics2D);
        clear();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
