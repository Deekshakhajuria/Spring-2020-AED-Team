/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class TravelOffice {
 
    CustomerDirectory custDir;
    MasterTravelSchedule mtSched;

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }

    public MasterTravelSchedule getMtSched() {
        return mtSched;
    }

    public void setMtSched(MasterTravelSchedule mtSched) {
        this.mtSched = mtSched;
    }
    
}
