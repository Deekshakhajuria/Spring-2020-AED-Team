/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class TravelAgency {
    
    private AirlinerDirectory airlinerDir;
    private MasterTravelSchedule mtSched;
    private TravelOffice travelOffice;
    private CustomerDirectory customerDir;
    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }
  
    public TravelOffice getTravelOffice() {
        return travelOffice;
    }

    public void setTravelOffice(TravelOffice travelOffice) {
        this.travelOffice = travelOffice;
    }

    public AirlinerDirectory getAirlinerDir() {
        return airlinerDir;
    }

    public void setAirlinerDir(AirlinerDirectory airlinerDir) {
        this.airlinerDir = airlinerDir;
    }

    public MasterTravelSchedule getMtSched() {
        return mtSched;
    }

    public void setMtSched(MasterTravelSchedule mtSched) {
        this.mtSched = mtSched;
    }

   
    
}
