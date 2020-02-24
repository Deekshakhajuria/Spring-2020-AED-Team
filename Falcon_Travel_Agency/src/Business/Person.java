/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author deekshakhajuria
 */

public class Person {
    
    private String FullName;
    private int PhoneNo;
    private String EmailId;
    private int Age;
    String DOB;
    //private Seat seat;

    public Person(String FullName, int PhoneNo, String EmailId, int Age, String DOB) {
        this.FullName = FullName;
        this.PhoneNo = PhoneNo;
        this.EmailId = EmailId;
        this.Age = Age;
        this.DOB = DOB;
        
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

//    public Seat getSeat() {
//        return seat;
//    }
//
//    public void setSeat(Seat seat) {
//        this.seat = seat;
//    }
    
    
    
}


