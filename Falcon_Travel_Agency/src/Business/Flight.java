/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author moury
 */
public class Flight {
    
    String airline;
    String flightNumber;
    String from;
    String departureDate;
    String departureTime;
    String to;
    String arrivalDate;
    String arrivalTime;
    int duration;
    int capacity;
    int seatPrice;

    public Flight(String airline, String flightNumber, String from, String departureDate, String departureTime, String to, String arrivalDate, String arrivalTime, int duration, int capacity, int seatPrice) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.from = from;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.to = to;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.capacity = capacity;
        this.seatPrice = seatPrice;
    }
    
    
    

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }
    
    @Override
    public String toString() {
        return flightNumber;
    }
    
    
}
