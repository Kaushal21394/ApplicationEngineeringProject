/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.NGO.NGODirectory;
import Business.Role.NGOAdminRole;
import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author kaush
 */
public class NGOOrganization extends Organization {
   
    NGODirectory ngolist;
    
    public NGOOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngolist=new NGODirectory();
    }

    public NGODirectory getNgolist() {
        return ngolist;
    }

    public void setNgolist(NGODirectory ngolist) {
        this.ngolist = ngolist;
    }

   
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new NGOManagerRole());
       return role;
       
    }   
}



