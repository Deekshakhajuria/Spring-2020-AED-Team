/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.InsuranceAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author moury
 */
public class InsuranceOrganization extends Organization{

    public InsuranceOrganization() {
        super(Organization.Type.Insurance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAgentRole());
        return roles;
    }
    
}
