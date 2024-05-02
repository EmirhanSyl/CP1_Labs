/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.blackflower.firstjava;

import java.util.Scanner;

/**
 *
 * @author emirs
 */
public class FirstJava 
{

    public static void main(String[] args) 
    {
        int firstNumber;
        int secondNumber;
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Please Input First Number: ");
        firstNumber = myObj.nextInt();
        System.out.println("Please Input Second Number: ");
        secondNumber = myObj.nextInt();
        
        System.out.println( SumProc(firstNumber, secondNumber));
    }
    
    public static int SumProc(int a, int b)
    {
        int result = a + b;
        
        for (int i = 0; i < b; i++) {
            result = a * (b + i);
        }
        return result;
    }
}
