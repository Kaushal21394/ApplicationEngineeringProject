/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business.supplier;

import business.sales.Person;
import java.util.ArrayList;
import utility.Validator;

/**
 *
 * @author chava
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDict;
    
    public SupplierDirectory() {
        supplierDict = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierDict() {
        return supplierDict;
    }
    
    //Method to add new Supplier
    public Supplier addSupplier() {
        Supplier s = new Supplier();
        supplierDict.add(s);
        return s;
    }
    
    //Method to remove Supplier objet from the list
    public void removeSupplier(Supplier s) {
        supplierDict.remove(s);
    }
    
    //Method to find a supplier
    public Supplier searchSupplier(String keyWord) {
        for(Supplier s : supplierDict) {
            if(keyWord.equals(s.getSupplyName())) {
                return s;
            }
        }
        return null;
    }
    
     public Supplier validateUser(String userName,String password){
        String pwd= Validator.generateHash(password);
        for(Supplier supplier : supplierDict) {
            if(supplier.getUsername().equalsIgnoreCase(userName) && supplier.getPassword().equals(pwd)){
               
                    return supplier;
                
            }
        }
        return null;
    }
    
}
