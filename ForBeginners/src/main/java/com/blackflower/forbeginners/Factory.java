package com.blackflower.forbeginners;

public class Factory {
    static Employee[] employees = new Employee[5];
    
    public static void main(String[] args) {
        employees[0] = new Employee();
        employees[0].id = 1;
        
        //System.out.println(employees[2].name);
        
        for(int i = 0; i < employees.length; i++) { //0,1,2,3,4
            employees[i] = new Employee();
            employees[i].id = i;
      
        }
        System.out.println(employees[0].id);
    }
    
}
