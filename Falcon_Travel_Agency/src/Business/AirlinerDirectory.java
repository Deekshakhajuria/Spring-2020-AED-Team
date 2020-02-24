/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author niramaykelkar
 */
public class AirlinerDirectory {

    private ArrayList<Airliner> airLinerList;
    public ArrayList<Airliner> getAirLinerList() {
        return airLinerList;
    }

    public void setAirLinerList(ArrayList<Airliner> airLinerList) {
        this.airLinerList = airLinerList;
    }
    public AirlinerDirectory() {
       airLinerList = new ArrayList<Airliner>();
       Fleet fleetlist1=new Fleet();
       ArrayList<Airplane> airplaneList1=new ArrayList<Airplane>();
       Airplane airplane1=new Airplane("1","737","Boeing",100);
       Airplane airplane2=new Airplane("2","A380","Airbus",100);
       airplaneList1.add(airplane1);
       airplaneList1.add(airplane2);
       fleetlist1.setAirplaneList(airplaneList1);
       Airliner airLine1=new Airliner("United AirLines","SS-11 NY",fleetlist1); 
       Fleet fleetlist2=new Fleet();
       ArrayList<Airplane> airplaneList2=new ArrayList<Airplane>();
       Airplane airplane3=new Airplane("3","YY","BeeachCraft",100);
       Airplane airplane4=new Airplane("4","A320","Airbus",100);
       airplaneList2.add(airplane3);
       airplaneList2.add(airplane4);
       fleetlist2.setAirplaneList(airplaneList2);
        Airliner airLine2=new Airliner("JetBlue","AA/22 KA",fleetlist2);
        
       Fleet fleetlist3=new Fleet();
       ArrayList<Airplane> airplaneList3=new ArrayList<Airplane>();
       Airplane airplane5=new Airplane("5","XX","BeeachCraft",100);
       Airplane airplane6=new Airplane("6","A320","Airbus",100);
       airplaneList3.add(airplane5);
       airplaneList3.add(airplane6);
       fleetlist3.setAirplaneList(airplaneList3);
        Airliner airLine3=new Airliner("US Airways","B12 PA",fleetlist3);
       
        airLinerList.add(airLine1);
        airLinerList.add(airLine2);
        airLinerList.add(airLine3);
   
       
    }
    
    public Airliner addAirLiner(String AirlinerName,String Address,Fleet FleetList)
    {
        Airliner airliner=new Airliner(AirlinerName,Address,FleetList);
        airLinerList.add(airliner);
        return airliner;
    }
   
    public void removeAirLiner(Airliner airliner)
    { 
        airLinerList.remove(airliner);
    } 
}
