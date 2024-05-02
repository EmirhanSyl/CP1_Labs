package com.blackflower.examplesfortenthweek;

import java.util.ArrayList;
import java.util.Arrays;

public class ExamplesForTenthWeek extends ExampleSubClass{

    public static void main(String[] args) {
//        int[] array = {5, 10, 15};
//        int num = 60;
//        array[1] = num;
        
//        //System.out.println(array.length);
//        
//        //System.out.println(findAvarage(array));
//        
//        
//        ExampleSubClass[] employees = new ExampleSubClass[5];
//        employees[0] = new ExampleSubClass();
//        System.out.println(employees[0].name);
//        
//        ExampleSubClass emp = new ExampleSubClass();
//        System.out.println(emp.empID);
//        emp.name = "Asım";
//        emp.empID = 497;
//        
//        employees[1] = emp;
//        employees[4] = emp;
//        
//        System.out.println(employees[4].empID);
//        employees[4].empID = 336;
//        employees[0].empID = 202;
//        emp = employees[0];
//        System.out.println(employees[4].empID);
//        System.out.println(employees[1].empID);
//        System.out.println(emp.empID);
//        System.out.println(employees[0].empID);
//                
//        for (int i = 0; i < employees.length; i++) {
//            employees[i] = new ExampleSubClass();
//        }
//        System.out.println(employees[2].name);
        
//        
//        int[][] numbersMD = new int[3][2];
//        
//        numbersMD[0][0] = 0;
//        numbersMD[0][1] = 1;
//        
//        numbersMD[0][0] = 1;
//        numbersMD[0][1] = 0;
//        
//        numbersMD[0][0] = 1;
//        numbersMD[0][1] = 1;
        
//        int[][] numbersMD = {{0, 1}, {1, 0}, {1, 1} };
//        
//        int totalHD = 0;
//        for (int i = 0; i < numbersMD.length; i++) {
//            if (numbersMD[i][0] == 0) {
//                totalHD++;
//            }
//        }
//        System.out.println(totalHD);
//
//
//        int[][] numbersMD = {{10, 2}, {12, 12}, {21, 1} };
//        
//        int[] newArray = MaxMeanArray(numbersMD);
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//        int[] numbers = {5, 10, 15};
//        int num1 = 50;
//        int num2 = 40;
//        int num3 = 30;
//        int num4 = 10;
//        
//        PrintSmth("smth", num1, num2, num3 >> 5, num4 % 10);
//
//        ArrayList arrayList = new ArrayList();
//        
//        arrayList.add(10);
//        arrayList.add(8);
//        arrayList.add(05);
//        arrayList.add(6);
//        // {10, 8, 5, 6}
//        
//        arrayList.add(2, 7);
//        // {10, 8, 7, 5, 6}
//        
//        arrayList.remove(2);
//        System.out.println(arrayList);
//        
//        arrayList.set(0, 12);
//        System.out.println(arrayList);
//        
//        
//        int total = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            total += (int)arrayList.get(i);
//        }
//        for (Object item : arrayList) {
//            total += (int)item;
//        }
//        
//        ArrayList<Integer> intArrayList = new ArrayList<>();
//        for (int item : intArrayList) {
//            total += item;
//        }
//        
//        int[][] numbersMD = {{3, 6, 2, 3, 6, 2}, {1, 5, 6, 1, 5, 6}, {2, 1, 5, 2, 1, 5}};
//        
//        int biggerColumnsCount = 0;
//        
//        for (int i = 0; i < numbersMD.length; i++){
//            total = 0;
//            for (int j = 0; j < numbersMD.length; j++) {
//                total += numbersMD[j][i];
//            }
//            if (total > 10) {
//                biggerColumnsCount++;
//            }
//        }
//        
//        biggerColumnsCount *= 2;
//        
//        System.out.println(biggerColumnsCount);
        
        ExampleSubClass newClass = new ExampleSubClass();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        
        System.out.println(arrayList);
        
        int total = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            total += (int)arrayList.get(i);
        }
        
        int[] numbers = new int[10];
        




        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    static void PrintSmth(String name, int... smth){
        int total = 0;
        for (int i = 0; i < smth.length; i++) {
            total += smth[i];
        }
        System.out.println(total);
    }
    
    
    
    static int[] MaxMeanArray(int[][] arrayMD){
        int maxMean = 0;
        int maxMeanIndex = 0;
        for (int i = 0; i < arrayMD.length; i++) {
            int mean = 0;
            for (int j = 0; j < arrayMD[i].length; j++) {
                mean += arrayMD[i][j];
            }
            mean /= arrayMD[i].length;
            if (mean > maxMean) {
                maxMean = mean;
                maxMeanIndex = i;
            }
        }
        return arrayMD[maxMeanIndex];
    }
    
    
    public static int findAvarage(int[] array){
        int total = 0;
        
        for (int i = 0; i < array.length; i++) {
            total += array[i];            
        }
        total /= array.length;
        return total;
    }
    
    static int Sum(int[] array){
        int total = 0;
        
        for (int item : array) {
            total += item;
            //item = array[i] 
        }
        return total;
    }
    
    static double Sum(double[] array){
        double total = 0;
        
        for (double item : array) {
            total += item;
            //item = array[i] 
        }
        return total;
    }
    
    static int Sum(ArrayList<Integer> parameters){
         int total = 0;
        
        for (int item : parameters) {
            total += item;
            //item = array[i] 
        }
        return total;
    }
    
    
}