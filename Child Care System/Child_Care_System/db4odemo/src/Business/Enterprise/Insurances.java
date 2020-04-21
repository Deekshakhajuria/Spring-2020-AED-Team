/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author moury
 */
public class Insurances {
    String insuranceID;
    String price;

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
      @Override
        public String toString(){
        return insuranceID;
    }
    
}
