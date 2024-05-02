package com.blackflower.exampleproj;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class ArrayLists {
    
    static ArrayList<Animals> animals = new ArrayList();
    
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.age = 8;
        cat1.name = "Sarışın";
        cat1.gender = "Female";
        cat1.paidAmount = 1700;
        animals.add(cat1);
        
        Animals dog1 = new Animals( 2, "Male");
        dog1.paidAmount = 3000;
        animals.add(dog1);
        
        int total = 0;
        for (Animals animal : animals) {
            if (animal.gender == "Female") {
                total += animal.paidAmount;
            }
        }
        System.out.println(total);
        
        
        
        StaticVariables sv = new StaticVariables();
        sv.number = 25;
        
        StaticVariables sv2 = new StaticVariables();
        sv2.number = 5;
        
        StaticVariables sv3 = new StaticVariables();
        sv3.number = 4;
        
        System.out.println(sv.number);
        System.out.println(sv2.number);
        
        //System.out.println(StaticVariables);
    }
}
