/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ChangeMaker.ChangeMakerDirectory;
import Business.Role.ChangeMakerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author kaush
 */
public class ChangeMakerOrganization extends Organization  {
    
    ChangeMakerDirectory changemakerlist;
    
    public ChangeMakerOrganization()
    {
        super(Organization.Type.ChangeMaker.getValue());
        changemakerlist= new ChangeMakerDirectory();
    }

    public ChangeMakerDirectory getChangemakerlist() {
        return changemakerlist;
    }

    public void setChangemakerlist(ChangeMakerDirectory changemakerlist) {
        this.changemakerlist = changemakerlist;
    }
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new ChangeMakerRole());
       return role;
       
    }
    
    
}







