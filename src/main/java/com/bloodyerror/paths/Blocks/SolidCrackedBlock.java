package com.bloodyerror.paths.Blocks;


import java.awt.*;

public class SolidCrackedBlock extends Block{


    public SolidCrackedBlock(Point location) {
        super(location);
        setCanBeMoved(true);
        setSoild(true);
        setCracked(true);
        setSize(2,2);
    }
}
