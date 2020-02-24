/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author moury
 */
public class SeatDirectory {
    
    private ArrayList<Seat> seatDir;
    private Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public SeatDirectory() {
        seatDir=new ArrayList<Seat>();
        String[] seatPos = {"window", "middle", "aisle"};
        for (int rowNum=1; rowNum<=Seat.maxRow; rowNum++) {
            for (int colGroup=1; colGroup<=2; colGroup++) {
                for (int seatPosNum=0; seatPosNum<seatPos.length; seatPosNum++) {
                    Seat seat = new Seat();
                    seatDir.add(seat);
                    seat.setPrice(600);
                    seat.setAvailability(true);
                    seat.setFlight(flight);
                    seat.setColGroup(colGroup);
                    seat.setRow(rowNum);
                    seat.setColPosition(seatPos[seatPosNum]);
                    seat.setSeatNo(seat.getColPosition()+"-"+seat.getRow()+"-"+seat.getColGroup());
                }
            }
        }
    }

    public ArrayList<Seat> getSeatDir() {
        return seatDir;
    }

    public void setSeatDir(ArrayList<Seat> seatDir) {
        this.seatDir = seatDir;
    }
    
    public Seat addSeat()
     {
       Seat seat = new Seat();
        seatDir.add(seat);
        return seat;
    }
   
public void removeSeat(Seat seat) {
   
    seatDir.remove(seat);
   
} 
    
}
