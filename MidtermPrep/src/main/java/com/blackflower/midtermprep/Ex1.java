package com.blackflower.midtermprep;

public class Ex1 {

    public static void main(String[] args) {
        int init = 1;
        for (int i = 1; i < 6; i++) {
            int avarage = 0;
            for (int j = 1; j < 6; j++) {
                if (i >= j) {
                    System.out.print(init);
                    avarage = avarage + init;
                    init = init + 2;
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(avarage / i);

        }
    }

}
