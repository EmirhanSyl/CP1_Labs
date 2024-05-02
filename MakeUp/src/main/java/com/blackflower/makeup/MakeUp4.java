package com.blackflower.makeup;

/**
 *
 * @author emirs
 */
public class MakeUp4 {
    
}

import Kisi.Ogrenci;
public interface IDers{
    
}

public class OgrenciDers implements IDers{
    
}

public class Matematik extends OgrenciDers{
    protected String adi;
}


package Kisi;
public class Ogrenci{
    String adi;
    static String bolum;
    
    public Ogrenci(String adi){
        this.adi = adi;
    }
}

public class BilgisayarOgrencisi extends Ogrenci{
    public BilgisayarOgrencisi(String adi){
        super(adi);
    }
}

