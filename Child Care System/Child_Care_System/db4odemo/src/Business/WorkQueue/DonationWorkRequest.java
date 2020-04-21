/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Donation;
import java.util.ArrayList;

/**
 *
 * @author niramaykelkar
 */
public class DonationWorkRequest extends WorkRequest{
    
    private String donatedBy;
    private String reqId;
    private static int count = 0;
    private Donation donation;
    private ArrayList<Donation> donationList;

    public DonationWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Donation");
        sb.append(count);
        reqId.toString();
        count++;
    }
    
    public String getDonatedBy() {
        return donatedBy;
    }

    public void setDonatedBy(String donatedBy) {
        this.donatedBy = donatedBy;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DonationWorkRequest.count = count;
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    public void setDonationList(ArrayList<Donation> donationList) {
        this.donationList = donationList;
    }
    
    @Override
    public String toString()
    {
        return this.reqId;
    }
}
