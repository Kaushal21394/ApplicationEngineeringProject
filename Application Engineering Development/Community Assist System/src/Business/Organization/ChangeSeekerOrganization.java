/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.ChangeSeeker.ChangeSeekerDirectory;
import Business.Role.ChangeSeekerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author kaush
 */
public class ChangeSeekerOrganization extends Organization{
   ChangeSeekerDirectory changeseekerlist;
    public ChangeSeekerOrganization()
    {
        super(Organization.Type.ChangeSeeker.getValue());
        changeseekerlist=new ChangeSeekerDirectory();
    }

    public ChangeSeekerDirectory getChangeseekerlist() {
        return changeseekerlist;
    }

    public void setChangeseekerlist(ChangeSeekerDirectory changeseekerlist) {
        this.changeseekerlist = changeseekerlist;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ChangeSeekerRole());
        return role;
        
    }
    
}





