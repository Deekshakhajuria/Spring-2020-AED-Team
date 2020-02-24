/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author niramaykelkar
 */
public class FlightSchedule {
    
    private Airliner airliner;
    public ArrayList<Flight> flightSchedDir;
    private AirlinerDirectory airlinerDirectory;
    private SeatDirectory seatDir=new SeatDirectory();
    
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
        Flight flight1=new Flight("UA11",11,17,"Boston","Austin",seatDir1,airliner.getFleetList().getAirplaneList().get(0),airliner.getAirlinerName());
        flight1.setSeatDir(seatDir1);
        airliner=airlinerDirectory.getAirLinerList().get(0);
        Flight flight2=new Flight("UA12",1,15,"Dallas","Charlotte",seatDir2,airliner.getFleetList().getAirplaneList().get(1),airliner.getAirlinerName());  
        flight2.setSeatDir(seatDir2);
        airliner=airlinerDirectory.getAirLinerList().get(1);
        Flight flight3=new Flight("JB13",2,18,"San Francisco","New Jersey",seatDir3,airliner.getFleetList().getAirplaneList().get(0),airliner.getAirlinerName());  
        flight3.setSeatDir(seatDir3);
        airliner=airlinerDirectory.getAirLinerList().get(1);
        Flight flight4=new Flight("JB14",3,22,"San Jose","Miami",seatDir4,airliner.getFleetList().getAirplaneList().get(1),airliner.getAirlinerName());  
         flight4.setSeatDir(seatDir4);
        airliner=airlinerDirectory.getAirLinerList().get(2);
        Flight flight5=new Flight("US13",10,24,"Philadelphia","New York",seatDir5,airliner.getFleetList().getAirplaneList().get(0),airliner.getAirlinerName());  
        flight5.setSeatDir(seatDir5);
        airliner=airlinerDirectory.getAirLinerList().get(2);
        Flight flight6=new Flight("US14",5,23,"PVD","New Orleans",seatDir6,airliner.getFleetList().getAirplaneList().get(1),airliner.getAirlinerName());  
       flight6.setSeatDir(seatDir6);
        flightSchedDir.add(flight1);
        flightSchedDir.add(flight2);
        flightSchedDir.add(flight3);
        flightSchedDir.add(flight4);
         flightSchedDir.add(flight5);
        flightSchedDir.add(flight6);
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

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public SeatDirectory getSeatDir() {
        return seatDir;
    }

    public void setSeatDir(SeatDirectory seatDir) {
        this.seatDir = seatDir;
    }
    
    
}
