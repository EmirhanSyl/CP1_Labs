package com.blackflower.seventhlab;

public class Personell {
    String ad;
    String soyad;
    
    int yas;
    int no;
    int maas;
    
    public int MaasBelirle(){
        if (yas > 50) {
            maas += 500;
        }
        return  maas;
    }
}
