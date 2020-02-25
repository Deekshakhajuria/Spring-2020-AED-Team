/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class TicketDirectory {
    private ArrayList<Ticket> ticketDir;
    public TicketDirectory()
    {
        ticketDir=new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getTicketDir() {
        return ticketDir;
    }

    public void setTicketDir(ArrayList<Ticket> ticketDir) {
        this.ticketDir = ticketDir;
    }

   public void addTicket(Person person, String reservationNum,Flight flight,String seat)
   {
       Ticket ticket=new Ticket(person,reservationNum,flight,seat);
       ticketDir.add(ticket);
      
   }
   
    
}
