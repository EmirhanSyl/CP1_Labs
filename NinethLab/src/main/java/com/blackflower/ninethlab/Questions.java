
package com.blackflower.ninethlab;

public class Questions {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 9, 7, 4, 5, 0, 5, 10, 2};
        
        int total = 0;
        int numCount = 0;
        
        for (int i = 1; i < numbers.length; i+=2) {
            total += numbers[i];       
            numCount++;
        }
        
        double mean = (double)total / numCount;
        System.out.println(mean);
    }
}
