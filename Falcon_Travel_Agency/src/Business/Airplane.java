/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author niramaykelkar
 */
public class Airplane {

    private String serialNum;
    private String modelNum;
    private String manufacture;
    private int seatCapacity;

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public Airplane(String serialNum, String modelNum, String manufacture, int seatCapacity) {
        this.serialNum=serialNum;
        this.modelNum=modelNum;
        this.manufacture=manufacture;
        this.seatCapacity=seatCapacity;
    }
    
}
