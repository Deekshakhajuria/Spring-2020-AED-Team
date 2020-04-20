/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author niramaykelkar
 */
public class Donor extends Employee{
    
    private String donorId;
    private static int count = 1;
    
    public Donor()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("DONOR");
        sb.append(count);
        donorId = sb.toString();
        count++;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }
    
     @Override
    public String toString() {
        return this.getName();
    }
}
