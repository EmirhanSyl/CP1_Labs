package com.blackflower.elevenththeory;

public class Employee {
    String firstName;
    String lastName;
    int id;
    
    static int employeeCount;
    static{
        employeeCount = 5;
    }

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        employeeCount++;
    }
    
    //Overloading Constractor
    public Employee(int id){
        this.id = id;
        employeeCount++;
    }    
    
}
