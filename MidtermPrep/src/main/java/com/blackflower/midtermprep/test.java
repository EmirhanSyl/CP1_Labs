package com.blackflower.midtermprep;

public class test {
    public static void main(String[] args) {
        Personel personel = new Personel();
        
        personel.firstName = "Emirhan";
        personel.lastName = "Soylu";
        personel.salary = 500;
        
        personel.IncreaseSalary();
        
        System.out.println(personel.salary);
    }
    
    
}
