 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Insurances;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ArrayList<Insurances> insurancesList;
    private Network network;
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public Iterable<Insurances> getInsurancesList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),ChildHelp("ChildHelp"),Pharmacy("Pharmacy"),Insurance("Insurance");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    
    public Insurances createMenuInsurance(){
        Insurances insurance = new Insurances(); 
        this.insurancesList.add(insurance);
        return insurance;
    } 
      
    
     public void deleteInsurance(Insurances insurance){
        insurancesList.remove(insurance); 
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
