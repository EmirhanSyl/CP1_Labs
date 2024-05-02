package com.blackflower.elevenththeory;

/**
 *
 * @author emirs
 */
public class EleventhTheory {

    public static void main(String[] args) {
//        Employee emp0 = new Employee();
//        emp0.firstName = "Emirhan";
//        emp0.lastName = "Soylu";
//        emp0.id = 1;

        Employee emp = new Employee("Emirhan", "Soylu", 10);
        
        Employee secEmp = new Employee(15);
        
        
        System.out.println(Employee.employeeCount);
        
        
    }

    @Override
    protected void finalize() throws Throwable {
     // Garbage coll, Statics, constractor, constrctor builder pattern
     
    }
}
