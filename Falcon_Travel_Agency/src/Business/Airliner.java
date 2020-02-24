/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author niramaykelkar
 */
public class Airliner {

    private String airlinerName;
    private String base;
    private Fleet FleetList;
    private FlightSchedule fsched;
    public Airliner(String airlinerName, String base, Fleet FleetList) {
        this.airlinerName = airlinerName;
        this.base = base;
        this.FleetList = FleetList;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Fleet getFleetList() {
        return FleetList;
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

    @Override
     public String toString() {
        return airlinerName;
    }        
}
