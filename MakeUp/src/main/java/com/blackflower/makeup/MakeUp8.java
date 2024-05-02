package com.blackflower.makeup;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class MakeUp8 {
    
}

package malzemePaketi;
//2.a malzemeAdi shoud has default accsess
public abstract class Malzeme{
    String malzemeAdi; // 2.a - default
    public abstract int getHediyeliTutar();
}

//---------------------------------------------

package islemPaketi;
import musteriPaketi.Kisi;
import malzemePaketi.Malzeme;

public interface IIslem{
    int GetAdet();
    int getTutar();
}
public  abstract class Islem implements IIslem{
    final int a = 4;
    
    public abstract int GetAdet();
    @Override
    public int getTutar(){
        
    }
    
    
    abstract int getTutar(); //2.b -> abstract keyword required
}

public class Alis extends Islem{
    Ambar ambar;
    @Override //2.b -> abstract methods MUST BE implemented
    int getTutar() {}
    
    public void setAmbar(Ambar ambar){this.ambar = ambar;}
}
public class Satis extends Islem{
    @Override //2.b -> abstract methods MUST BE implemented
    int getTutar() {}
}

public class Ambar{
    static String firma; // 3.d
    public String adres;
}

public class Kalem extends Malzeme{
    @Override
    public int getHediyeliTutar(){
        
    }
}

public class Musteri extends Kisi{
    public Musteri(String adi, String soyadi, ArrayList<Islem> islemler){
        super(adi, soyadi, islemler);
    }
    super.getKazanc(); // 2.e
}

//---------------------------------------------

import islemPaketi.Ambar;
package musteriPaketi;
public class Kisi{
    private String adi; 
    private String soyadi;
    static ArrayList<Islem> islemler;
    // 2.c
    public Kisi(String adi, String soyadi, 
            ArrayList<Islem> islemler){
        this.adi = adi;
        this.soyadi = soyadi;
        this.islemler = islemler;
    }
    public String getAdi(){return adi;}
    protected void getKazanc(){} // 2.e -> Method should be protected
}



