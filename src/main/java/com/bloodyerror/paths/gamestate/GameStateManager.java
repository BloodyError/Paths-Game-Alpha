package com.bloodyerror.paths.gamestate;


import java.awt.*;
import java.util.Stack;

public class GameStateManager {

    public static Stack<GameState> states;

    public GameStateManager(){
        states = new Stack<GameState>();
        states.push(new PathsLevelLoader(this));
    }

    public void tick(double deltaTime){
        states.peek().tick(deltaTime);
    }
    public void render(Graphics2D graphics2D){
        states.peek().render(graphics2D);
    }

    public void init() {
        states.peek().init();
    }
}
