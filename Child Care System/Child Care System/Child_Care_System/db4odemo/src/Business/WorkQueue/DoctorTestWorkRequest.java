/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class DoctorTestWorkRequest extends WorkRequest{
    private String sendDataRequestId;
    private static int count = 000;
    private String medication;
    private String newMedication;
    private String testResult;
    private ArrayList<VitalSign> vitalSignList;

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getSendDataRequestId() {
        return sendDataRequestId;
    }

    public void setSendDataRequestId(String sendDataRequestId) {
        this.sendDataRequestId = sendDataRequestId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DoctorTestWorkRequest.count = count;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getNewMedication() {
        return newMedication;
    }

    public void setNewMedication(String newMedication) {
        this.newMedication = newMedication;
    }
     public VitalSign addVital()
    {
        VitalSign vs=new VitalSign();
        vitalSignList.add(vs);
        return vs;
    }
    public void removeVital(VitalSign v)
    {
        vitalSignList.remove(v);
        
    }
    
    
}