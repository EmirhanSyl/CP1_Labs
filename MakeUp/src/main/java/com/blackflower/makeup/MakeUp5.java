package com.blackflower.makeup;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class MakeUp5 {
    
}

public class Kisi{
    
}

public class Hizmetli extends Kisi{
    private String gorev;
}

public class Doctor extends Kisi{
    
}

public final class Mesai{ // 2.a
    
}

public class IHastane{
    String hastaneAdi = "FSM";
    final String adres = "";
    ArrayList<Doctor> doktorListesi = new ArrayList<>();
}

public class Kamu extends IHastane{
    int kamuNo;
    
    public Kamu(int kamuNo){
        this.kamuNo = kamuNo;
    }
}

public class Ozel extends IHastane{
    
}

// class keyword is replace with interface
// fields are initilized. Bcs final
// extends keyword is replaced with implements
