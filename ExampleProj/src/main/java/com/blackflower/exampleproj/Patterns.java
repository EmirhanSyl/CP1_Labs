package com.blackflower.exampleproj;

import java.util.ArrayList;

public class Patterns {
    public static void main(String[] args) {
//        int firstColumnNumber = 1;
//        char letterPart = 'a';
//        
//        for (int i = 0; i < 5; i++) {  
//            System.out.print(firstColumnNumber + " ");
//            firstColumnNumber++;
//            
//            for (int j = 0; j < 4; j++) {
//                System.out.print(letterPart + " ");
//                letterPart++;
//            }
//            
//            System.out.println("");
//        }
        
        
//        int a = 1;
//        
//        for (int i = 1; i < 6; i++) {
//           //int rowTotal = 0;
//            for (int j = 1; j < 6; j++) {
//                if (j <= i) {
//                    System.out.print(a + " ");
//                    //rowTotal += a; // 1| 3, 
//                    a+=2; // 5, 7
//                }
//                else{
//                    System.out.print("* ");
//                }
//            }
//            
//            System.out.println(i * i);
//        }
//        

//
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(i + j);
//            }
//            
//            System.out.println();
//        }
//
//        for (int i = 1; i < 17; i*=nmmmmmmmmmmmmmmmmm eyr470öçt6ş6) {
//            System.out.print(i + " ");
//            
//            for (int j = i+2; j <= i * 2; j+=2) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


         ArrayList<Animals> animals = new ArrayList();
         Cat cat = new Cat(0, 2, "Female", "Sarışın", 1);
         Animals a = new Animals();
         a = cat;
         animals.add(cat);
         System.out.println(animals.get(0).age);
        

    }
}
