package com.blackflower.nineththeory;

public class Factory {
    Employee lead;
    
    Employee[] employees = new Employee[4];
    
    double WC;
    
    
    void HireLead(Employee lead){
        this.lead = lead;
    }
    
    Employee CreateNewEmp(String name, double salary, int LoW){
        Employee employee = new Employee();
        employee.name = name;
        employee.salary = salary;
        employee.LoW = LoW;
        
        employee.LowToSalary(name, salary, LoW);
        return employee;
    }
    
    double WorkerCount(){
        WC = employees.length;
        return WC;
    }
    
    void FireEmployee(String name){
        for (int i = 0; i < employees.length; i++) {
            if (name == employees[i].name) {
                employees[i] = new Employee();
                break;
            }            
        }
    }
}
