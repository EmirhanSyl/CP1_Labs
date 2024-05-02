package com.blackflower.midtermprep;

public class MidtermPrep {

    public static void main(String[] args) {
        int num = 1;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    System.out.print(num);
                    num++;
                }
                else{
                    System.out.print(num);
                    num--;
                }
            }
            
            System.out.println(num);
            num += 5;
        }
        
        //BitControl(4, 2);
        System.out.println(ZeroCount(16));
    }
    
    public static void BitControl(int num, int contBit){ // 100
        for (int i = 1; i <= contBit; i++) {
            
            if (contBit == i){
                System.out.println(num & 1);
            }
            num = num >> 1;
            
        }
    }
    
    public static int ZeroCount(int num){
        int zeroCount = 0;
        while (num > 0) {  
            if ((num & 1) == 0) {
                zeroCount++;
            }
            num = num >> 1;
            System.out.println(num);
        }
        
        return zeroCount;
    }
}
