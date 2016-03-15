package com.bloodyerror.paths.Main;


import com.bloodyerror.gop.Main.GameWindow;
import com.bloodyerror.gop.SheetWorks.SpriteSheet;
import com.bloodyerror.paths.gameloop.GameLoop;

import java.awt.*;


public class Game {

    public static GraphicsDevice   graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    public static  int width = graphicsDevice.getDisplayMode().getWidth();
    public static  int hegiht = graphicsDevice.getDisplayMode().getHeight();
    public static SpriteSheet blocks = new SpriteSheet();

    public static void main(String[] args){
        GameWindow frame = new GameWindow("Paths_v.1_alpha",1280,720);
       // frame.setFullScreen(1);
        frame.setVisible(true);
        frame.add(new GameLoop(width,hegiht));
        //blocks.getTile(0,0,8,8);
    }
}
