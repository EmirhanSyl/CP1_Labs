package com.blackflower.seventhlab;

public class Test {    
    public static void main(String[] args) {
          Personell per = new Personell();
          
          per.ad = "fdsşf dsfjkg";
          
          per.yas = 65;
          per.maas = 8000;
          per.MaasBelirle();
          System.out.println(per.maas);
          //8500;
          
    }
}
