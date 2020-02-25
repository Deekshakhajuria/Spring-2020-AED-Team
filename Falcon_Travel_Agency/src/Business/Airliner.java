/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class Airliner {
    
    private String airlinerName;
    private String Address;
    private Fleet FleetList;
    private FlightSchedule fsched;
    Airliner(String airlinerName,String Address, Fleet FleetList)
    {
        this.airlinerName=airlinerName;
        this.Address=Address;
        this.FleetList=FleetList;
    }
    public Fleet getFleetList() {
        return FleetList;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setFleetList(Fleet FleetList) {
        this.FleetList = FleetList;
    }

    public FlightSchedule getFsched() {
        return fsched;
    }

    public void setFsched(FlightSchedule fsched) {
        this.fsched = fsched;
    }

   
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    @Override
     public String toString() {
        return airlinerName;
    }
    
}
