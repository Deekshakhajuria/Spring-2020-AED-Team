/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class Ticket {
    String seat;
    Person person;
    String reservationNum;
    Flight flight;

    public Ticket( Person person, String reservationNum,Flight flight,String seat)
    {
        this.person=person;
        this.reservationNum=reservationNum;
        this.flight=flight;
        this.seat=seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
  

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getReservationNum() {
        return reservationNum;
    }

    public void setReservationNum(String reservationNum) {
        this.reservationNum = reservationNum;
    }
     @Override
    public String toString() {
        return getReservationNum();
    }
}
