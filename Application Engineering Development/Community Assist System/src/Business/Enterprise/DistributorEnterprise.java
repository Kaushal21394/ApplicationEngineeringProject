/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.DistributorManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author kaush
 */
public class DistributorEnterprise extends Enterprise {
    public DistributorEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Distributor);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        new DistributorManagerRole();
        return role;
        
    }
}





