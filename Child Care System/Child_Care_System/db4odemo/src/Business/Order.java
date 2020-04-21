/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Enterprise.Insurances;
import java.util.ArrayList;

/**
 *
 * @author moury
 */
public class Order {
    
    
    private static int counter=1;
    private int orderId;
    private String status;
    private String applicantName;
    private String price;
    private int applicantId;
    private String insuranceID;
    private String insAgency;
    private ArrayList<Insurances> insurancesList;
    
    
    public Order() {
        orderId = counter;
        ++counter;
        insurancesList=new ArrayList<Insurances>();
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getInsAgency() {
        return insAgency;
    }

    public void setInsAgency(String insAgency) {
        this.insAgency = insAgency;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    

    
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }


    public ArrayList<Insurances> getInsurancesList() {
        return insurancesList;
    }

    public void setItemsList(ArrayList<Insurances> insurancesList) {
        this.insurancesList = insurancesList;
    }
    
    public Insurances addItem(){
        Insurances insurance = new Insurances(); 
        insurancesList.add(insurance);
        return insurance;
    } 
      
      public void deleteItem(Insurances insurance){
        insurancesList.remove(insurance); 
    }
    @Override
    public String toString() {
        return Integer.toString(this.orderId);
    }

    
    
    
    
}
