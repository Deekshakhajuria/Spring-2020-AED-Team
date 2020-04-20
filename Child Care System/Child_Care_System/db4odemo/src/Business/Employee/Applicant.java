/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author niramaykelkar
 */
public class Applicant extends Employee{
    
    private String helpSeekerId;
    private static int count = 001;
    private ArrayList<VitalSign> vitalSignList =new ArrayList<VitalSign>();
    public Applicant()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("APP");
        sb.append(count);
        helpSeekerId = sb.toString();
        count++;
        //vitalSignList = new ArrayList<VitalSign>();
    }

    public String getHelpSeekerId() {
        return helpSeekerId;
    }

    public void setHelpSeekerId(String helpSeekerId) {
        this.helpSeekerId = helpSeekerId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Applicant.count = count;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    public Applicant(Employee e){
        super(e);
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
    
    public ArrayList<VitalSign> getAbnormalList(double maxbp , double minbp){
        ArrayList<VitalSign> abnList = new ArrayList<VitalSign>();
        for(VitalSign vs : vitalSignList)
        {
            if(vs.getBloodPressure() > maxbp || vs.getBloodPressure() < minbp)
            {
                abnList.add(vs);
            }
        }
        return abnList;
    }
    
    public String patientCondition( VitalSign patientVitalSign)
    {
      double heartRate;
     double bloodPressure;
     int pulse;
     double weightInPounds;
     String patientCondition = null;
     
     heartRate = patientVitalSign.getHeartRate();
     bloodPressure=patientVitalSign.getBloodPressure();
     pulse=patientVitalSign.getPulse();
     weightInPounds=patientVitalSign.getWeightInPounds();
     
     if(pulse >= 20 && pulse <=30&&
                   heartRate >= 80 && heartRate <= 130 &&
                   bloodPressure >= 80 && bloodPressure <= 110 &&
                   weightInPounds >= 22 && weightInPounds <= 31)
     {
              patientCondition = "NORMAL";
     }
     else{
            
               patientCondition = "ABNORMAL";
     }
     return patientCondition;
            
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}
