package com.blackflower.fourtheenthlab;

/**
 *
 * @author emirs
 */
public class Button implements IMotion{
    
    int id;
    int x1;
    int x2;
    int y1;
    int y2;

    @Override
    public void move(int pos) {
        x1 = x1 + pos + 5;
        x2 = x2 + pos + 5;
        y1 = y1 + pos + 5;
        y2 = y2 + pos + 5;
    }

    @Override
    public void setXY(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        
    }

    @Override
    public int getX1() {
        return x1;
    }

    @Override
    public int getX2() {
        return x2;
    }

    @Override
    public int getY1() {
        return y1;
    }

    @Override
    public int getY2() {
        return y2;
    }

    @Override
    public int getArea() {
        int area = ((x1 - x2) * (y1 - y2));
        return Math.abs(area);
    }
    
}
