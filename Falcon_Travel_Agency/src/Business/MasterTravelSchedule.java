/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class MasterTravelSchedule {
    private ArrayList<FlightSchedule> mTravelSched;

    public ArrayList<FlightSchedule> getmTravelSched() {
        return mTravelSched;
    }

    public void setmTravelSched(ArrayList<FlightSchedule> mTravelSched) {
        this.mTravelSched = mTravelSched;
    }
    
//       public FlightSchedule addFlightSchedule()
//    {
//        FlightSchedule flightSched=new FlightSchedule();
//        mTravelSched.add(flightSched);
//        return flightSched;
//    }

public void removeFlightSched(FlightSchedule flightSched)
    {

        mTravelSched.remove(flightSched);

    } 
}
