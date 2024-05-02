package com.blackflower.makeup;

/**
 *
 * @author emirs
 */
public class MakeUp7 {
    
}

package sirketPaketi;
import iletisim.Telefon; // 2.a

public class Calisan{
    
}

class Maas{
    
}

//-------------------------------------------

package iletisim;

public abstract class Telefon{
    public final String model = "Meryem";
    final String adi = "zehra";
    abstract int getFiyat();
}

public class Samsung extends Telefon{
    @Override
    int getFiyat() {}
}

public class LG extends Telefon{
    @Override
    int getFiyat() {}
}