package com.blackflower.exampleproj;

public class Cat extends Animals{
    int vacc;
    
    public Cat(){
        super();
        
    }
    
    public Cat(int id, int age, String gender, int paidAmount){
        super();
        super.paidAmount = paidAmount;
    }
    
    public Cat(int id, int age, String gender, String name, int paidAmount){
        super(age, gender);
        super.paidAmount = paidAmount;
    }
}
