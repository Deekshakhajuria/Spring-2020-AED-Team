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
public class Fleet {

    private ArrayList<Airplane> airplaneList;
    private Airliner airliner;

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
    
    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }
    
    public void setAirplaneList(ArrayList<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }
    public Airplane addAirplane(String serialNum, String modelNum,String manufacture,int seatCapacity)
    {
        Airplane airPlane=new Airplane(serialNum,modelNum,manufacture,seatCapacity);
        airplaneList.add(airPlane);
        return airPlane;
    }
    public void removeAirplane(Airplane airPlane)
    {
        airplaneList.remove(airPlane);
    }
    
}
