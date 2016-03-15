package com.bloodyerror.paths.Blocks;

import java.awt.*;

public class CrackedBlock extends Block{
    public CrackedBlock(Point location){
        super(location);
        setCanBeMoved(true);
        setSoild(true);
        setCracked(true);
        setSize(2,2);
    }

}
