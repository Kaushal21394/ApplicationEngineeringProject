/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import Interface.ProviderEnterprise.ProviderAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author kaush
 */
public class DistributorAdminRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new ProviderAdminWorkArea(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise,system);
    }   
        @Override
        public String toString()
{
   return RoleType.DistributorAdminRole.getValue();
}
}


