/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author kaush
 */
public class Supply {
    
   
    private String supplyId;
    private static int sCount=0;
    private int quantity;
    private String requirementType;
    private String requirement;
   
    public Supply(){
        supplyId="Suplly"+(+sCount);
     
        
    }



    public String getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    
    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    
    @Override
    public String toString(){
        return getRequirementType();
    }
    
}








