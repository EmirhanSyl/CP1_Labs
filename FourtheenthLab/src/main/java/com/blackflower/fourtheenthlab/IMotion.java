package com.blackflower.fourtheenthlab;

/**
 *
 * @author emirs
 */
public interface IMotion {
    
    void move(int pos);
    void setXY(int x1, int x2, int y1, int y2);
    
    int getX1();
    int getX2();
    int getY1();
    int getY2();
    
    int getArea();
    
}
