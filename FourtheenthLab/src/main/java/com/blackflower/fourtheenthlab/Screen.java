package com.blackflower.fourtheenthlab;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Screen {
    ArrayList<IMotion> obectsOnScreen = new ArrayList<>();
    
    int getTotalComponentArea(){
        int totalArea = 0;
        
        for (IMotion component : obectsOnScreen) {
            totalArea += component.getArea();
        }
        return totalArea;
    }
    
    public void addComponent(String type, int id, int x1, int x2, int y1, int y2){
        if ("textBox".equals(type)) {
            IMotion component = new TextBox();
            component.setXY(x1, x2, y1, y2);
            obectsOnScreen.add(component);
        }
        else if("button".equals(type)){
            IMotion component = new Button();
            component.setXY(x1, x2, y1, y2);
            obectsOnScreen.add(component);
        }
    }
    
    public ArrayList<IMotion> findIntersectionComponents(){
        ArrayList<IMotion> intersectedComponents = new ArrayList<>();
        
        for (IMotion intersectedComponent : intersectedComponents) {
            
            for (IMotion intersectedComponent1 : intersectedComponents) {
                
            }
        }
        
        return intersectedComponents;
    }
    
    public boolean findSameComponent(IMotion component){
        boolean isConsist = false;
        for (IMotion checkedComp : obectsOnScreen) {
            if (!component.equals(checkedComp)) {
                int x1Size = component.getX1() - checkedComp.getX1();
                int y1Size = component.getY1() - checkedComp.getY1();
                
                int x2Size = component.getX2() - checkedComp.getX2();
                int y2Size = component.getY2() - checkedComp.getY2();
                
                if (x1Size == 0 && x2Size == 0 && y1Size == 0 && y2Size == 0) {
                    if ((component instanceof Button && checkedComp instanceof Button) || (component instanceof TextBox && checkedComp instanceof TextBox) ) {
                        isConsist = true;
                        break;
                    }
                }
            }
        }
        return isConsist;
    }
}
