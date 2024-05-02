package com.blackflower.fourtheenthlab;

/**
 *
 * @author emirs
 */
public class Test {

    static IMotion button = new Button();
    static IMotion textBox = new TextBox();

    public static void main(String[] args) {
        System.out.println("x1: " + button.getX1() + " x2: " + button.getX2() + "y1: " + button.getY1() + " x2: " + button.getY2());
        System.out.println("x1: " + textBox.getX1() + " x2: " + textBox.getX2() + "y1: " + textBox.getY1() + " x2: " + textBox.getY2());
    }
}
