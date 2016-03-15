package com.bloodyerror.paths.gamestate;


import com.bloodyerror.gop.SheetWorks.SpriteSheet;
import com.bloodyerror.gop.Main.loadingImageFrom;
import com.bloodyerror.paths.Main.Game;

import java.awt.*;

public class PathsLevelLoader extends GameState{

     SpriteSheet test = new SpriteSheet();

    public PathsLevelLoader(GameStateManager gsm) {
        super(gsm);
    }

    @Override
    public void init() {
        test.setSpriteSheet(loadingImageFrom.loadingImageFrom(Game.class,"sheet.png"));
    }

    @Override
    public void render(Graphics2D graphics2D) {
        graphics2D.drawString("Hello world!",200,200);
        graphics2D.drawString("Hello!!",200,215);
        graphics2D.drawImage(test.getTile(0,0,16,16),0,0,64,64,null);
        graphics2D.drawImage(test.getTile(16,0,16,16),64,0,64,64,null);
    }

    @Override
    public void tick(double deltaTime) {

    }

}
