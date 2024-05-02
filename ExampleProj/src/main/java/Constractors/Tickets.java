package Constractors;


/**
 *
 * @author emirs
 */
public class Tickets{
    
    private String ID = "3";
    String passName;
    String destination;
    final String airport = "İstanbul";
    String airline;
    
    public Tickets(){}
    
    public Tickets(String passName){
        this.passName = passName;
    }
    

    
    public void PrintPrice(){
        System.out.println("My price is 300");
    }
    
    public String GetID(){
        return ID;
    }
    public void setID(String id){
        if (id.length() != 11) {
            return;
        }
        ID = id;
        
    }
    
    public void ThisIsTicketsClass(){
        
    }
}
