/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.NGOAdminRole;
import Business.Role.NGOManagerRole;
import Business.Role.Role;
import Business.Role.VolunteerRole;
import java.util.HashSet;

/**
 *
 * @author kaush
 */
public class NGOEnterprise extends Enterprise {
    
    public NGOEnterprise(String name){
        super(name,Enterprise.EnterpriseType.NGO);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new NGOManagerRole());
        //role.add(new VolunteerRole());
        return role;
    }
}






