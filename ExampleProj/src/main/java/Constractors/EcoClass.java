package Constractors;


public class EcoClass extends Tickets{

    void Func(){
        super.PrintPrice();
    }
    
    public EcoClass(){
        super("fdsf");
        super.GetID();
    }
    
    @Override
    public void PrintPrice(){
        System.out.println("My price is 250");
    }
    
    public void ThisIsEcoClass(){
        
    }
}
