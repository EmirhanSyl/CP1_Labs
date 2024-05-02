package com.blackflower.quiz;

import java.util.ArrayList;

public class Factory {
    ArrayList<Employee> employees = new ArrayList<>();
    
    int GetTotalEmployeeSalaryHavingMaterial(){
        int totalSalary = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (!employees.get(i).materials.isEmpty()) {
                totalSalary += employees.get(i).salary;
            }
        }
        return totalSalary;
    }
    
    void DisplayEmployeeMaterialCount(){
        for (Employee employee : employees) {
            System.out.println(employee.name + "'s material count is: " + employee.materials.size());
        }
    }
}
