package com.blackflower.examplesfortenthweek;

public class ExampleSubClass {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        numbers2[3] = 8;
        char[] chars = {'a', 'b', 'c'};
        chars[0] = 'q';
        
        
        Employee emp = new Employee();
        emp.id = 1;
        
        Employee emp1 = emp;
        System.out.println(emp1.id);
        
        Employee[] emps = new Employee[4];
        emps[0] = emp;
        emps[1] = new Employee();
        emps[2] = emps[1];
        emps[2].name = "Ali";
        
        
        
        System.out.println(emps[0].id);
        System.out.println(emps[1].name);
    }
}
