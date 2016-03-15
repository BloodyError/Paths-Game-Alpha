package com.bloodyerror.paths.Blocks;

import com.bloodyerror.paths.init.Reference;

import java.awt.*;

/*Defining the basic block*/
public class Block {
    private Point   location;
    private boolean isSolid;
    private boolean canBeMoved;
    private boolean isCracked;
    private int     width, height;

    public Block(){
    }

    public Block(Point location){
        this.location=location;
    }

    public boolean isCanBeMoved() {
        return canBeMoved;
    }

    public void setCanBeMoved(boolean canBeMoved) {
        this.canBeMoved = canBeMoved;
    }

    public boolean isSoild() {
        return isSolid;
    }

    public void setSoild(boolean solid) {
        isSolid = solid;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public boolean isCracked() {
        return isCracked;
    }

    public void setCracked(boolean cracked) {
        isCracked = cracked;
    }
    public void setSize(int x, int y){
        this.width = x;
        this.height = y;
    }
    /*Moving the Block*/
    public void move(int dx, int dy){
        location.x  =   location.x  +   dx;
        location.y  =   location.y  +   dy;
    }

    //TODO: Create an attach checking
    public void move(Reference.Directions directions){
        if(directions== Reference.Directions.UP)
            location.y = location.y + 2;
        else if (directions == Reference.Directions.DOWN)
            location.y = location.y - 2;
        else if (directions == Reference.Directions.LEFT)
            location.x = location.x - 2;
        else if (directions == Reference.Directions.RIGHT)
            location.x = location.x + 2;
    }


}
