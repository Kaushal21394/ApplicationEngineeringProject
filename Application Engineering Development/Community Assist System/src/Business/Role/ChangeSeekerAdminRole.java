/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ChangeSeekerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Taker.TakerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author kaush
 */
public class ChangeSeekerAdminRole extends Role{
 
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new TakerAdminWorkArea(userProcessContainer,enterprise);
    }
        @Override
        public String toString()
{
   return RoleType.ChangeSeekerAdmin.getValue();
}
}







