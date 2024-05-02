package com.blackflower.exampleproj;

public class Animals {
    int id;
    protected int age;
    public String gender;
    String name;
    int paidAmount;
    
    public Animals(){}
    
    public Animals(int age, String gender){
        
    }
    
    public Animals(int id, int age, String gender, String name){
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
}
