
package com.blackflower.quiz;

public class Quiz {

    public static void main(String[] args) {
        Material material1 = new Material();
        Material material2 = new Material();
        
        Employee emp0 = new Employee();
        emp0.salary = 1000;
        emp0.name = "X";
        emp0.materials.add(material1);
        emp0.materials.add(material2);
        
        Employee emp1 = new Employee();
        emp1.salary = 2000;
        emp1.materials.add(material2);
        
        Employee emp2 = new Employee();
        emp2.salary = 3000;
        
        Factory f = new Factory();
        f.employees.add(emp0);
        f.employees.add(emp1);
        f.employees.add(emp2);
        
        System.out.println(f.GetTotalEmployeeSalaryHavingMaterial());
        f.DisplayEmployeeMaterialCount();
    }
}
