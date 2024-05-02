package com.blackflower.makeup;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class MakeUp6 {
    public static int a;
    
}

package MisafirPaketi;
import OtelPaketi.*;
import RezervasyonPaketi.*;

// all classes must be public
// all classes must be imported


//----------------------------------------


package RezervasyonPaketi;

public class Rezervasyon{
    static ArrayList<Rezervasyon> TumRezervasyon;
}


//----------------------------------------


package OtelPaketi;

public class Otel{
    public String adres; //2.c
    ArrayList<IOda> odeListesi;
    
    public Otel(ArrayList<IOda> odaListesi){
        this.odeListesi = odaListesi;
    }
    
}

public interface IOda{
    int odaNo = 1;
    boolean bosMu = false;
    Kisi misafir = null;
} 

public class Orta implements IOda{
    
}

public class Luks implements IOda{
    
}