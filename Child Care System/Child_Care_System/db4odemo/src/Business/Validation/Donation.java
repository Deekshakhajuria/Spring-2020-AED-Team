/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

/**
 *
 * @author Team SPY
 */
public class Donation {
    
    private String donationAmount;
    private String donationDate;
    private String donorsAccountNumber;
    private String donorsAccountName;
    public static String receiversAccountNumber = "8577865926";
    
    private static int count = 0;
    private int donationId;
    
    public Donation()
    {
        count++;
        donationId = count;
    }

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public String getDonorsAccountNumber() {
        return donorsAccountNumber;
    }

    public void setDonorsAccountNumber(String donorsAccountNumber) {
        this.donorsAccountNumber = donorsAccountNumber;
    }

    public String getDonorsAccountName() {
        return donorsAccountName;
    }

    public void setDonorsAccountName(String donorsAccountName) {
        this.donorsAccountName = donorsAccountName;
    }

    public static String getReceiversAccountNumber() {
        return receiversAccountNumber;
    }

    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }
    
    @Override
    public String toString()  {
        return String.valueOf(donationId);
    }
    
}
