package Constractors;

public class FirstClass extends Tickets{
    int b;
    String priv;
    public FirstClass(){
        //super(1,"dgdfgd", "fsd", "fds");
    }
    
    @Override
    public void PrintPrice(){
        System.out.println("My price is 800");
    }
    
    @Override
    public void PrintPrice(int price){
        System.out.println("My price is " + (price + 200));
    }
    
    public String PrintPrice(String smth){
        return "gujls" + smth;
    }
  
}
