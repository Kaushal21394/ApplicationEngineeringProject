/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,String name)
    {
    Organization organization = null;
        if (type.getValue().equals(Type.ChangeMaker.getValue())){
            
            organization = new ChangeMakerOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ChangeSeeker.getValue())){
            organization = new ChangeSeekerOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Distributor.getValue())){
            organization = new DistributorOrganization(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        
        return organization;
    }

    
}








