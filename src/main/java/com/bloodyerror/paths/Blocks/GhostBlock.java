package com.bloodyerror.paths.Blocks;


import java.awt.*;

public class GhostBlock extends Block{
    public GhostBlock(Point location){
        setCracked(false);
        setCanBeMoved(false);
        setSoild(false);
        setSize(2,2);
    }
}
