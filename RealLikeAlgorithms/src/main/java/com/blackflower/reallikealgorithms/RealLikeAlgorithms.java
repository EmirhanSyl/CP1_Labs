package com.blackflower.reallikealgorithms;

public class RealLikeAlgorithms {

    public static void main(String[] args) {

        
        double d = 4.6346243534623423;
        
        boolean b = true;
        
        char c = 'A'; //character
        String s = "dfds";
        
        // ----------------------------------------------------------------------
        
        //CASTING
        System.out.println((int)c);
        
        int a = 10;
        int z = 3;
        
        double bolum = (double)a / z;        
        
        //3.333333333
        System.out.println(bolum);
        
        
        // int + int = int
        // int - int = int 
        // int * int = int 
        // int / int = double/int => int
        
        // double / int
        // int / double
        // double / double 
        
        
        // ---------------------------------------------------------------------
        
        //Execution Order
        int randomNumber = 5;
        System.out.println(randomNumber);
        randomNumber = +8;
        
        int num = randomNumber + 4;
        
        num -= 2;
        
        System.out.println(randomNumber);
        
        
        // ---------------------------------------------------------------------
        
        // Operators
        
        // && || %  ? 
        
        // % => Bir sayının bölümünden kalanı buldurur
        
        int e = 5468;
        
        // 23156489 => 1 2165463213 => 1 465212 => 0
        
        if (e % 2 == 0) {
            System.out.println("Sayı çift");
        }
        else{
            System.out.println("Tek");
        }
        
        // ? => Ternary => (koşul) ? true : false;
        boolean isEven = (e % 2 == 0) ? true : false;
        
        int num1 = 8;
        int num2 = 56;
        int max = 0;
        
        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        
        
        // --------------------------------------------------------------------
        
        // If - else
        
        // 8000 < %20 zam & 8000 > %10 zam
        // maaşı 8k'dan küçükse
        
        //
        
        
        // --------------------------------------------------------------------
        
        // LOOP's
        
        //For - While
        
        // While(koşul){...}
        
        int i = 0;
        while(i < 7){ // 0, 1 ,2 ,3 ,4 ,5,6,
            System.out.print("Yes ");
            i++;
        }
        
        for (int j = 0; j < 10; j++) {
            
        }
        
        System.out.println("");
        
        //3Q1 araştırma Abstact özet word dosyası 5 cümle çeviri
        
        
        
        // -------------------------------------------------------------------
        
        int binaryNum = 16;
        
        String binary = "";
        
        // 16 => 10000
        while(binaryNum > 0){            
            System.out.print(binaryNum % 2);
            
            binary = (binaryNum % 2) + binary;
            binaryNum /= 2;            
        }
        
        System.out.println("");
        System.out.println(binary);
        
        // 0 0 0 0 1
        //
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    
    public static void dsfsdfsdf() {
        int initNum = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
                if (i % 2 == 0) {
                    System.out.print((initNum + j) + " ");

                } else {
                    System.out.print(initNum + " ");
                    initNum += 1;
                }
            }
            System.out.println("");
        }
    }

    public static void fdfd() {
        int initNum = 10;
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else if (i == j) {
                    System.out.print("* ");
                    initNum -= 2;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }        
    }

}
