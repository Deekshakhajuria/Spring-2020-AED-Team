/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author moury
 */
public class Airliner {

    private ArrayList<Airplane> airplaneDirectory;
    private String airlinerName;
    private int noOfAirplanes;
    private String headquarters;

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Airliner(String airLinerName, int noOfAirplanes, String headquarters) {
        airplaneDirectory = new ArrayList<Airplane>();
        this.airlinerName = airLinerName;
        this.noOfAirplanes = noOfAirplanes;
        this.headquarters = headquarters;
        InitializeData initializeData = new InitializeData();
        initializeData.initializeAirplaneDirectory(airlinerName, airplaneDirectory);
//        initializeAirplaneDirectory(airLinerName);
    }

    public ArrayList<Airplane> getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(ArrayList<Airplane> airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public int getNoOfAirplanes() {
        return noOfAirplanes;
    }

    public void setNoOfAirplanes(int noOfAirplanes) {
        this.noOfAirplanes = noOfAirplanes;
    }

    public void deleteAirplane(Airplane airplane) {
        airplaneDirectory.remove(airplane);
    }

    public Airplane addAirplane() {
        Airplane airplane = new Airplane();
        airplaneDirectory.add(airplane);
        return airplane;
    }

    @Override
    public String toString() {
        return airlinerName;
    }

//    public void initializeAirplaneDirectory(String airlinerName) {
//
//        switch (airlinerName) {
//            case "Delta Airlines":
//                Airplane a1 = new Airplane(100, "Airbus", "A380", true, true);
//                Airplane a2 = new Airplane(101, "Airbus", "A330", true, true);
//                Airplane a3 = new Airplane(102, "Airbus", "A310", true, false);
//                Airplane a4 = new Airplane(103, "Boeing", "787", true, true);
//                Airplane a5 = new Airplane(104, "Airbus", "737", false, false);
//
//                airplaneDirectory.add(a1);
//                airplaneDirectory.add(a2);
//                airplaneDirectory.add(a3);
//                airplaneDirectory.add(a4);
//                airplaneDirectory.add(a5);
//
//                break;
//
//            case "Southwest Airlines":
//                Airplane a6 = new Airplane(001, "Airbus", "A220", false, false);
//                Airplane a7 = new Airplane(002, "Airbus", "A300", false, false);
//                Airplane a8 = new Airplane(003, "Airbus", "A310", true, false);
//                Airplane a9 = new Airplane(004, "Boeing", "777", true, true);
//                Airplane a10 = new Airplane(005, "Airbus", "767", true, true);
//                airplaneDirectory.add(a6);
//                airplaneDirectory.add(a7);
//                airplaneDirectory.add(a8);
//                airplaneDirectory.add(a9);
//                airplaneDirectory.add(a10);
//
//                break;
//
//            case "American Airlines":
//                Airplane a11 = new Airplane(1120, "Bombardier", "7500", true, true);
//                Airplane a12 = new Airplane(1121, "Bombardier", "3500", true, true);
//                Airplane a13 = new Airplane(1122, "Airbus", "A330", true, false);
//                Airplane a14 = new Airplane(1123, "Boeing", "777", true, true);
//                Airplane a15 = new Airplane(1124, "Airbus", "787", false, false);
//                airplaneDirectory.add(a11);
//                airplaneDirectory.add(a12);
//                airplaneDirectory.add(a13);
//                airplaneDirectory.add(a14);
//                airplaneDirectory.add(a15);
//
//                break;
//
//            case "United Airlines":
//                Airplane a16 = new Airplane(2001, "Tupolev", "ANT-1", false, false);
//                Airplane a17 = new Airplane(2002, "Tupolev", "ANT-45", true, false);
//                Airplane a18 = new Airplane(2003, "Airbus", "A310", true, false);
//                Airplane a19 = new Airplane(2004, "Bombardier", "7500", true, true);
//                Airplane a20 = new Airplane(2005, "Airbus", "737", false, false);
//                airplaneDirectory.add(a16);
//                airplaneDirectory.add(a17);
//                airplaneDirectory.add(a18);
//                airplaneDirectory.add(a19);
//                airplaneDirectory.add(a20);
//
//                break;
//
//            case "Alaska Airlines":
//                Airplane a21 = new Airplane(301, "Embrarer", "450", true, true);
//                Airplane a22 = new Airplane(302, "Airbus", "A330", true, true);
//                Airplane a23 = new Airplane(303, "Embrarer", "300", true, false);
//                Airplane a24 = new Airplane(304, "Boeing", "787", true, true);
//                Airplane a25 = new Airplane(305, "Embrarer", "195", false, false);
//                airplaneDirectory.add(a21);
//                airplaneDirectory.add(a22);
//                airplaneDirectory.add(a23);
//                airplaneDirectory.add(a24);
//                airplaneDirectory.add(a25);
//
//                break;
//
//        }
//    }
    public ArrayList<Airplane> searchAirplane(String searchTerm) {
        int flag = 0;
        ArrayList<Airplane> temp = new ArrayList<>();
        for (Airplane e : airplaneDirectory) {
            if (e.getName().equalsIgnoreCase(searchTerm)) {
                temp.add(e);
                flag = 1;
            }
        }
        if (flag == 0) {
            return null;
        }
        return temp;
    }
}
