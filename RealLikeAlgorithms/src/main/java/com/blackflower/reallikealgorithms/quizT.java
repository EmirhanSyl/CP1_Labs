
package com.blackflower.reallikealgorithms;

public class quizT {
    public static void main(String[] args) {
        
        int num = 50;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num = num - i;
            }
            
            System.out.println(num + " ");
        }
        
        // 50 45 40 35 30
        // 30 26 22 18
        // 18 15 12
        // 12 10
        // 10
        
        // 50 45 40 35 30
        // 30 26 22 18
        // 18 15 12
        // 12 10
        // 10
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Question2(){
        int x = 1, y = 5, z = 0;
        
        while (x < y && z < 6) {
            System.out.println("x: " + x + " y: " + y);
            
            x = x << 1;            
            z = y++;
        }
        
        System.out.println("x: " + x + " y: " + y);
    }
}
