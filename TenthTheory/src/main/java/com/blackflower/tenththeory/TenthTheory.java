package com.blackflower.tenththeory;

import java.util.ArrayList;
import java.util.Random;

public class TenthTheory {

    static Random random = new Random();

    public static void main(String[] args) {
        Car c = new Car(50000, "");
        c.price = 50000;

        ArrayList newList = new ArrayList();
        newList.add(50);
        newList.add("sdsds");
        newList.add('c');
        newList.add(c);
        System.out.println(newList);

        Car[] cars = new Car[3];

        cars[0] = new Car();
        cars[0].price = 30000;
        cars[1] = c;
        cars[2] = c;

        cars[2].price = 10000;

        int totalPrice = 0;

        for (int i = 0; i < cars.length; i++) {
            totalPrice += cars[i].price;

        }
        System.out.println(totalPrice);

        int[][] vectors = new int[2000][3500];

        // { { 2, 3, 5} , { , , } }
        for (int i = 0; i < vectors.length; i++) {
            for (int j = 0; j < vectors[i].length; j++) {
                vectors[i][j] = random.nextInt(20);
                // System.out.println(calculate(vectors[i]));
            }
        }

        System.out.println(SumOfArrayElements(vectors));

    }

    static int SumOfArrayElements(int[][] list) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                total += list[i][j];
            }
        }
        return total;
    }

    static int calculate(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }
}
