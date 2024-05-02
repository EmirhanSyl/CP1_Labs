package com.blackflower.nineththeory;

public class Employee {

    String name;
    double salary;

    int LoW;

    public double LowToSalary(String name, double salary, int LoW) {

        if (LoW > 5500) {
            salary = (salary * 105.5) / 100;
        }

        return salary;
    }
    
    public double IncrementSalary(double x){
        
        return x + 100;
    }
    
    public double TakePercentage(double value, int percentage){
        value = (value * percentage) / 100;
        return value;
    }

}
