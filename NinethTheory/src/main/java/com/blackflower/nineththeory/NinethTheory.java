package com.blackflower.nineththeory;

import java.util.List;
import java.util.*;  


public class NinethTheory {

    public static void main(String[] args) {
        Employee employee = new Employee();
        
        System.out.println(employee.LowToSalary("Asım", 185 ,5600));
        System.out.println(employee.salary);
        
        double x = 5000;
        x = employee.TakePercentage(x, 15); // x = 500;
        System.out.println(x);
        
        //System.out.println(employee.IncrementSalary(x));
        //System.out.println(x);
        
        //isim hakları "Asım©'a" aittir 
        int[] feriha = new int[3];
        feriha[0] = 50;
        feriha[1] = 40;
        feriha[2] = 30;
        
        Factory fucktory = new Factory();
        Employee lead = new Employee();
        lead.name = "Feriha";
        lead.LoW = 0;
        lead.salary = 2000000;
        
        fucktory.HireLead(lead);        
        fucktory.employees[0] = fucktory.CreateNewEmp("Asım", -200, 1000);
        fucktory.employees[1] = fucktory.CreateNewEmp("Zahid", -100, 100);
        fucktory.employees[2] = fucktory.CreateNewEmp("Beyza", 10, 100);
        fucktory.employees[3] = fucktory.CreateNewEmp("İzzettin", -100, 0);
        
        System.out.println("WorkerCount of Fucktory: " + fucktory.WorkerCount());
        
        fucktory.FireEmployee("İzzettin");
        
        for (int i = 0; i < fucktory.employees.length; i++) {
            System.out.println(fucktory.employees[i].name);
        }
    }
}
