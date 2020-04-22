/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private String firstName;
    private String lastname;
    private Date dob;
    private String address1;
    private String address2;
    private String phoneNumber;
    private String emailId;
    private String occupation;
    private String city;
    private String zipCode;
    private String gender;
    private String country;
    private String state;
    private int id;
    private static int count = 1;
    private ArrayList<Donation> donationList ;
    
public Employee( Employee e){
    this.name=e.name;
    this.firstName=e.firstName;
    this.lastname=e.lastname;
     this.dob=e.dob;
     this.address2=e.address2;
     this.address1=e.address1;
     this.phoneNumber=e.phoneNumber;
    this.emailId=e.emailId;
     this.occupation=e.occupation;
     this.city=e.city;
    this.zipCode=e.zipCode;
     this.gender=e.gender;
    this.country=e.country;
    this.state=e.state;
    this.id=e.id;
}
    public Employee() {
        StringBuffer sb = new StringBuffer();
        sb.append("PER");
        sb.append(count);
       // id = sb.toString();
        count++;   
        donationList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    public void setDonationList(ArrayList<Donation> donationList) {
        this.donationList = donationList;
    }
    
    public Donation addDonation()
    {
        Donation vs=new Donation();
        donationList.add(vs);
        return vs;
    }
    
}
