/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ChangeMakerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Giver.ChangeMaker.ChangeMakerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author kaush
 */
public class ChangeMakerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new ChangeMakerWorkArea(userProcessContainer,account,(ChangeMakerOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return RoleType.ChangeMaker.getValue();
}
}





