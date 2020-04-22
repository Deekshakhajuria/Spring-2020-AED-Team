/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ApplicantOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.DonorOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author hp
 */
public class MainValidation {
    
    public static boolean validateString(String name)
    {
        return true;
    }
    
    public static DoctorOrganization getDoctorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DoctorOrganization doctorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(network))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(("Hospital").equals("Hospital"))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DoctorOrganization)
             {
              doctorOrganization = (DoctorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return doctorOrganization;
    }   
    
    public static DonorOrganization getDonorOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        DonorOrganization donorOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(network))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if("NonProfit".equals("NonProfit"))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DonorOrganization)
             {
              donorOrganization = (DonorOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return donorOrganization;
    }
    
    public static ManagerOrganization getManagerOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        ManagerOrganization managerOrganization = null;
        try
        {
            for(Network network : ecoSystem.getNetworkList())
                {
                    if(network.equals(network))
                        {
                            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
                                {
                                    if("ChildHelp".equals("ChildHelp"))
                                        {
                                            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                                                {
                                                    if(organization instanceof ManagerOrganization)
                                                        {
                                                            managerOrganization = (ManagerOrganization)organization; 
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
            return null;
        }
        return managerOrganization;
    }
    
    
    
    public static ApplicantOrganization getApplicantOrganization(EcoSystem ecoSystem, UserAccount userAccount)
    {
        ApplicantOrganization applicantOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(("ChildHelp").equals("ChildHelp"))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof ApplicantOrganization)
             {
              applicantOrganization = (ApplicantOrganization)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return applicantOrganization;
    }   
    
}
