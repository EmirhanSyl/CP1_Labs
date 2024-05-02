package Constractors;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
//        Tickets ticket = new Tickets("Turkish Airlanes", "İstanbul Airport", "İstanbul");
//        Tickets ticket2 = new Tickets();
//        ticket2.num = 2;
//        ticket2.airline = "Turkish";
//        ticket2.airport = "Ankara";
//        ticket2.destinationPoint = "Ank";
//        
//        ticket.TicketsCount = 5;
//        System.out.println(ticket.TicketsCount);
//        ticket2.TicketsCount = 8;
//        System.out.println(ticket2.TicketsCount);
//        System.out.println(ticket.TicketsCount);
//        
//        Tickets.TicketsCount = 7;
//        System.out.println(ticket2.TicketsCount);
//        
//        System.out.println(MyMath.CircleArea(8));
//        
//        FirstClass fc = new FirstClass();
//        
//        System.out.println(fc.PrintPrice("faf"));
//        ticket.PrintPrice();

//        int[][] array = {
//            {1, 2, 3, 4, 5},
//            {4, 3, 7, 8, 9},
//            {11, 10, 6, 5, 3},
//            {1, 2, 3, 4, 5},
//            {6, 7, 4, 3, 10}
//        };
//
//        int prev = array[0][0];
//        int curr;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                curr = prev;
//                prev = array[i][j];
//                if (curr > prev) {
//                    System.out.println("(" + i + ", " + j + ")");
//                }
//            }
//        }
//
//        Tickets ticket = new Tickets();
//        EcoClass ecoClass = new EcoClass();
//        
//        Tickets ticket2 = new EcoClass();
//        
//        ticket.PrintPrice();
//        ecoClass.PrintPrice();
//        ticket2.PrintPrice();

//
//        ArrayList<Tickets> soldTickets = new ArrayList<>();
//        
//        BusinessClass bc = new BusinessClass();
//        EcoClass ec = new EcoClass();
//        Kobi kobi = new Kobi();
//        
//        soldTickets.add(bc);
//        soldTickets.add(ec);
//        soldTickets.add(kobi);
        
        
        ArrayList<Tickets> soldTickets = new ArrayList<>();
        
        Kobi kobiTicket = new Kobi();
        kobiTicket.ThisIsTicketsClass();
        soldTickets.add(kobiTicket);
                
//        for (Tickets soldTicket : soldTickets) {
//            Holding holdingTicket = (Holding)soldTicket;
//        }
        
        Tickets ticket = kobiTicket;
        ticket.ThisIsTicketsClass();
        
        BusinessClass businessTicket = (BusinessClass)ticket;
        businessTicket.ThisIsTicketsClass();
        
        
        if (businessTicket instanceof Startup) {
            Holding holdingTicket = (Holding)businessTicket;
        }
        
    }
}
