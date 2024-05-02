package com.blackflower.ninethlab;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class NinethLab {

    public static void main(String[] args) {
        int[] numbers = {5, 8, 4, 2, 12, 7, 6, 3, 0, 15};
        
        int[][] numbersMD = {
            {5, 8},
            {4, 2},
            {12, 7},
            {6, 3},
            {0, 15}
        };
        
        ArrayList<Integer> numbersArrayList = new ArrayList<>();        
        numbersArrayList.add(5);
        numbersArrayList.add(8);
        numbersArrayList.add(4);
        numbersArrayList.add(2);
        numbersArrayList.add(12);
        numbersArrayList.add(7);
        numbersArrayList.add(6);
        numbersArrayList.add(3);
        numbersArrayList.add(0);
        numbersArrayList.add(15);
        
        
        System.out.println("Question1 with 1D array: " + Question1_1(numbers));
        System.out.println("Question1 with 2D array: " + Question1_2(numbersMD));
        System.out.println("Question1 with ArrayList: " + Question1_3(numbersArrayList)); 
        
        System.out.println();
        
        System.out.println("Question2 with 1D array: " + Question2_1(numbers));
        System.out.println("Question2 with 2D array: " + Question2_2(numbersMD));
        System.out.println("Question2 with ArrayList: " + Question2_3(numbersArrayList)); 
        
        System.out.println();
        
        System.out.println("Question3 with 1D array: " + Question3_1(numbers));
        System.out.println("Question3 with 2D array: " + Question3_2(numbersMD));
        System.out.println("Question3 with ArrayList: " + Question3_3(numbersArrayList)); 
        
        System.out.println();
        
        System.out.println("Question4 with 1D array: " + Question4_1(numbers, 6));
        System.out.println("Question4 with 2D array: " + Question4_2(numbersMD, 6));
        System.out.println("Question4 with ArrayList: " + Question4_3(numbersArrayList, 6));         
        
        System.out.println();
        
        System.out.println("Question5 with 1D array: " + Question5_1(numbers, 49));
        System.out.println("Question5 with 2D array: " + Question5_2(numbersMD, 49));
        System.out.println("Question5 with ArrayList: " + Question5_3(numbersArrayList, 49)); 
        
        System.out.println();
        
        System.out.println("Question6 with 1D array: " + Question6_1(numbers));
        System.out.println("Question6 with 2D array: " + Question6_2(numbersMD));
        System.out.println("Question6 with ArrayList: " + Question6_3(numbersArrayList)); 
        
        System.out.println();
        
        System.out.println("Question6 with 1D array: " + Question7_1(numbers, 5));
        System.out.println("Question6 with 2D array: " + Question7_2(numbersMD, 5));
        System.out.println("Question6 with ArrayList: " + Question7_3(numbersArrayList, 5)); 
        
    }
    
    public static int Question1_1(int[] numbers){
        int total = 0;
        for (int i = 1; i < numbers.length; i+=2) {
            total += numbers[i];
        }
        
        return total;
    }
    
    public static int Question1_2(int[][] numbers){
        int total = 0;
        for (int i = 1; i < numbers.length; i+=2) {
            for (int j = 1; j < numbers[i].length; j+=2) {
                total += numbers[i][j];
            }            
        }
        
        return total;
    }
    
    public static int Question1_3(ArrayList<Integer> numbers){
        int total = 0;
        for (int i = 1; i < numbers.size(); i+=2) {
            total += numbers.get(i);
        }
        
        return total;
    }
    
    //-----------------------------------------------------------------
    
    public static int Question2_1(int[] numbers){
        int biggestElement = 0;
        
        for (int i = 0; i < numbers.length; i+=2) {
            if (biggestElement < numbers[i]) {
                biggestElement = numbers[i];
            }
        }
        
        return  biggestElement;
    } 
    
    public static int Question2_2(int[][] numbers){
        int biggestElement = 0;
        
        for (int i = 0; i < numbers.length; i+=2) {            
            for (int j = 0; j < numbers[i].length; j+=2) {
                if (biggestElement < numbers[i][j]) {
                biggestElement = numbers[i][j];
                }
            }
        }
        
        return  biggestElement;
    } 
    
     public static int Question2_3(ArrayList<Integer> numbers){
        int biggestElement = 0;
        for (int i = 0; i < numbers.size(); i+=2) {
            if (biggestElement < numbers.get(i)) {
                biggestElement = numbers.get(i);
            }
        }
        
        return biggestElement;
    }
     
     
    //-----------------------------------------------------------------
     
     public static int Question3_1(int[] numbers){
         int biggestEven = 0;
         
         for (int number : numbers) {
             if (number % 2 == 0 && biggestEven < number) {
                 biggestEven = number;
             }
         }
         
         return biggestEven;
     }
     
     public static int Question3_2(int[][] numbers){
         int biggestEven = 0;
         
         for (int[] numbersArray : numbers) {
             for (int number : numbersArray) {
                 if (biggestEven < number && number % 2 == 0) {
                     biggestEven = number;
                 }
             }
         }
         
         return biggestEven;
     }
     
     public static int Question3_3(ArrayList<Integer> numbers){
         int biggestEven = 0;
         
         for (int number : numbers) {
             if (number % 2 == 0 && biggestEven < number) {
                 biggestEven = number;
             }
         }
         
         return biggestEven;
     }
     
     
     //-----------------------------------------------------------------
     
     public static int Question4_1(int[] numbers, int limit){
         int minOdd = Integer.MAX_VALUE;
         
         for (int number : numbers) {
             if (number > limit && number % 2 == 1 && number < minOdd) {
                 minOdd = number;
             }
         }
         
         return minOdd;
     }
     
     public static int Question4_2(int[][] numbers, int limit){
         int minOdd = Integer.MAX_VALUE;
         
         for (int[] numbersArray : numbers) {
             for (int number : numbersArray) {
                if (number > limit && number % 2 == 1 && number < minOdd) {
                    minOdd = number;
                }
             }
         }
         
         return minOdd;
     }
     
     public static int Question4_3(ArrayList<Integer> numbers, int limit){
         int minOdd = Integer.MAX_VALUE;
         
         for (int number : numbers) {
             if (number > limit && number % 2 == 1 && number < minOdd) {
                 minOdd = number;
             }
         }
         
         return minOdd;
     }
     
     
    //-----------------------------------------------------------------
     
     public static int Question5_1(int[] numbers, int limit){
         int maxNum = 0;
         
         for (int number : numbers) {
             if (number < limit && number > maxNum) {
                 maxNum = number;
             }
         }
         
         return maxNum;
     }
     
     public static int Question5_2(int[][] numbers, int limit){
         int maxNum = 0;
         
         for (int[] numbersArray : numbers) {
             for (int number : numbersArray) {
                if (number < limit && number > maxNum) {
                    maxNum = number;
                }
             }
         }
         
         return maxNum;
     }
     
     public static int Question5_3(ArrayList<Integer> numbers, int limit){
         int maxNum = 0;
         
         for (int number : numbers) {
             if (number < limit && number > maxNum) {
                 maxNum = number;
             }
         }
         
         return maxNum;
     }
     
     
     //-----------------------------------------------------------------
     
     public static int Question6_1(int[] numbers){
         int total = 0;
         
         for (int number : numbers) {
             total += number;
         }
         
         return total;
     }
     
     public static int Question6_2(int[][] numbers){
         int total = 0;
         
         for (int[] numbersArray : numbers) {
             for (int number : numbersArray) {
                total += number;
             }
         }
         
         return total;
     }
     
     public static int Question6_3(ArrayList<Integer> numbers){
         int total = 0;
         
         for (int number : numbers) {
             total += number;
         }
         
         return total;
     }
     
     
     //-----------------------------------------------------------------
     
     public static int Question7_1(int[] numbers, int element){
         int elementCount = 0;
         
         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] == element) {
                 elementCount++;
             }
         }
         
         return elementCount;
     }
     
     public static int Question7_2(int[][] numbers, int element){
         int elementCount = 0;
         
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == element) {
                    elementCount++;
                }
             }             
         }
         
         return elementCount;
     }
     
     public static int Question7_3(ArrayList<Integer> numbers, int element){
         int elementCount = 0;
         
         for (int i = 0; i < numbers.size(); i++) {
             if (numbers.get(i) == element) {
                 elementCount++;
             }
         }
         
         return elementCount;
     }
     
     
     public static int Question8(int [] numbers){
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers.length; j++) {
//                 if (numbers[i != numbers[j] && i != j]) {
//                     
//                 }
             }
         }
         return  0;
     }
     
     
     
     
}
