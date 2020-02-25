/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class FlightSchedule {
    
    private Airliner airliner;
    public ArrayList<Flight> flightSchedDir;
    private AirlinerDirectory airlinerDirectory;
    private SeatDirectory seatDir=new SeatDirectory();
    //MasterTravelSchedule mSchedDir;
    //private ArrayList<FlightSchedule> mTravelSched;
    public FlightSchedule() {
       //for(Airplane airplane:airliner.getFleetList().getAirplaneList())
       //{
       airlinerDirectory=new AirlinerDirectory();
       airliner=airlinerDirectory.getAirLinerList().get(0);
        flightSchedDir=new ArrayList<Flight>();
        SeatDirectory seatDir1=new SeatDirectory();
        SeatDirectory seatDir2=new SeatDirectory();
        SeatDirectory seatDir3=new SeatDirectory();
        SeatDirectory seatDir4=new SeatDirectory();
        SeatDirectory seatDir5=new SeatDirectory();
        SeatDirectory seatDir6=new SeatDirectory();
        Flight flight1=new Flight("Qatar", "QA11", "Boston", "1/1/2001", "9:00", "NYC", "1/1/2001", "11:00", 2, 20, 200); //,airliner.getFleetList().getAirplaneList().get(0),airliner.getAirlinerName());
        flight1.setSeatDir(seatDir1);
        airliner=airlinerDirectory.getAirLinerList().get(0);
        Flight flight2=new Flight("Qatar", "QA21", "Boston", "1/1/2001", "7:00", "DC", "1/1/2001", "19:00", 12, 15, 400);  
        flight2.setSeatDir(seatDir2);
//        airliner=airlinerDirectory.getAirLinerList().get(1);
//        Flight flight3=new Flight("JB13",2,18,"San Francisco","New Jersey",seatDir3,airliner.getFleetList().getAirplaneList().get(0),airliner.getAirlinerName());  
//        flight3.setSeatDir(seatDir3);
//        airliner=airlinerDirectory.getAirLinerList().get(1);
//        Flight flight4=new Flight("JB14",3,22,"San Jose","Miami",seatDir4,airliner.getFleetList().getAirplaneList().get(1),airliner.getAirlinerName());  
//         flight4.setSeatDir(seatDir4);
//        airliner=airlinerDirectory.getAirLinerList().get(2);
//        Flight flight5=new Flight("US13",10,24,"Philadelphia","New York",seatDir5,airliner.getFleetList().getAirplaneList().get(0),airliner.getAirlinerName());  
//        flight5.setSeatDir(seatDir5);
//        airliner=airlinerDirectory.getAirLinerList().get(2);
//        Flight flight6=new Flight("US14",5,23,"PVD","New Orleans",seatDir6,airliner.getFleetList().getAirplaneList().get(1),airliner.getAirlinerName());  
//       flight6.setSeatDir(seatDir6);
        flightSchedDir.add(flight1);
        flightSchedDir.add(flight2);
//        flightSchedDir.add(flight3);
//        flightSchedDir.add(flight4);
//         flightSchedDir.add(flight5);
//        flightSchedDir.add(flight6);
      // }
                
       
        
        //mSchedDir.setmTravelSched(mTravelSched);
       
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

     public ArrayList<Flight> getFlightSchedDir() {
        return flightSchedDir;
    }

    public void setFlightSchedDir(ArrayList<Flight> flightSchedDir) {
        this.flightSchedDir = flightSchedDir;
    }
    
       public Flight addFlight(String airline, String flightNumber, String from, String departureDate, String departureTime, String to, String arrivalDate, String arrivalTime, int duration, int capacity, int seatPrice)
    {
        Flight flight = new Flight(airline, flightNumber, from, departureDate, departureTime, to, arrivalDate, arrivalTime, duration, capacity, seatPrice);
        flightSchedDir.add(flight);
        return flight;
    }

    public void removeFlight(Flight flight)
        {

            flightSchedDir.remove(flight);

        } 
    
}
