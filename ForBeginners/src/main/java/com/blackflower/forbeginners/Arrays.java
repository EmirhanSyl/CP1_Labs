package com.blackflower.forbeginners;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] number2 = {3, 4, 5, 8};
        
        numbers[0] = 1;
        numbers[1] = 5;
        //System.out.println(numbers[0]);
        
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        
        
    }
}
