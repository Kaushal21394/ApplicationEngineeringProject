/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Distributor.Supplier;
import Business.Distributor.SupplierDirectory;
import Business.Role.DistributorManagerRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.HashSet;

/**
 *
 * @author kaush
 */
public class DistributorOrganization extends Organization {
    SupplierDirectory supplierList;

    //Supplier supplier;
    public DistributorOrganization(String name) {
        super(Organization.Type.Distributor.getValue());
        supplierList= new SupplierDirectory();
      //  supplier = new Supplier();
    }

    public SupplierDirectory getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(SupplierDirectory supplierList) {
        this.supplierList = supplierList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        //role.add(new DistributorManagerRole());
        role.add(new SupplierRole());
        return role;
    }
    
    
    
}








