package com.blackflower.makeup;

/**
 *
 * @author emirs
 */
class MakeUp3 {
    public static void main(String[] args) {
        MakeUp6.a = 5;
        
    }
}

package OdemePaketi;

public interface IOdeme{ //2.a 'public'
    int odemeID = 5; // all variables/attributes/fields must be initialized;
    public int getOdemeMiktari();
}

public class Nakit implements IOdeme{

    @Override
    public int getOdemeMiktari() {    }
    
    
}

public class Taksit implements IOdeme{
    @Override
    public int getOdemeMiktari() {    }
}


// class keyword'ü interface ile değiştirilir
// metodların gövdeleri silinir
// field'lar Final ve static'e dönüştüğü için başlatılır
// sub-class'larda abstract method'ların implementasyonu(override) yapılır

//-------------------------------------------

package MusteriPaketi;
import OdemePaketi.Odeme;
public class Musteri{
    static final String firma = "FSM";
    
}

public class Siparis{
    private int tutar;
    
    public int getTutar(){return tutar;}
    public void setTutar(int tutar){this.tutar = tutar;}
}
