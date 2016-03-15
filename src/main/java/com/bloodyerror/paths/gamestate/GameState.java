package com.bloodyerror.paths.gamestate;


import java.awt.*;

public abstract class GameState {

    GameStateManager gameStateManager;


    public GameState(GameStateManager gsm){
        this.gameStateManager=gsm;
    }
    public abstract void init();
    public abstract void tick(double deltaTime);
    public abstract void render(Graphics2D graphics2D);
}
