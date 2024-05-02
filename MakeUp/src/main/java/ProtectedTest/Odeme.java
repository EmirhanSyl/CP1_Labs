package ProtectedTest;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Odeme {
    static int odemeID;
    public Odeme(int odemeID){
        this.odemeID = odemeID;
    }
    
    public static void main(String[] args) {
        String a = "aaaa";
        String ab = b() + a;
        System.out.println(ab);
    }
    
    public static String b(){
        return "bbbb";
    }
    
    class InnerClass implements A{
        
    }
    
    public void Method(){
        class LocalClass implements A{
        
        }
        
//        ArrayList array = new ArrayList();
//        array.forEach((object) -> {int a; a++;});
        
    }
}

interface A{
    
}
