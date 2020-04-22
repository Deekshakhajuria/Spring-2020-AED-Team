/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author moury
 */
public class Donor extends Employee{
    
    private String donorId;
    private static int count = 1;
    //private ArrayList<Donation> donationList ;

    public Donor()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("DONOR");
        sb.append(count);
        donorId = sb.toString();
        count++;
        //donationList = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    public String getDonorId() {
        return donorId;
    }
    
    /*public Donation addDonation()
    {
        Donation vs=new Donation();
        donationList.add(vs);
        return vs;
    }*/
}

    
