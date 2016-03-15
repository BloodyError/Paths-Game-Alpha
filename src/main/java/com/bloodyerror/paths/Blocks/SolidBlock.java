package com.bloodyerror.paths.Blocks;


import java.awt.*;

public class SolidBlock extends Block{

    public SolidBlock(Point location){
        super(location);
        setCanBeMoved(false);
        setSoild(true);
        setSize(2,2);
    }
}
