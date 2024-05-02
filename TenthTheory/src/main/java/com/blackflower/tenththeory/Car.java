package com.blackflower.tenththeory;

public class Car {
    int speed;
    int price;
    String model;
    
    public Car(int speed, String model){
        this.speed = speed;
        this.model = model;
    }
    
    public int SumSmth(int a, int b){
        return a+b;
    }
    
    public int SumSmth(char a, char b){
        return a+b;
    }
   
    
    //Overloading
}
