package com.bloodyerror.paths.Blocks;


import java.awt.*;

public class AirBlock extends Block{
    public AirBlock(Point location){
        super(location);
        setSoild(false);
        setSize(2,2);
    }
}
