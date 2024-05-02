package com.blackflower.makeup;

/**
 *
 * @author emirs
 */
public class Matris {
    private int a;
    public static void main(String[] args) {
        int[] array = {5, 8, 56, 67, 54};
        
        int min = 10000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        
    }
    
}
