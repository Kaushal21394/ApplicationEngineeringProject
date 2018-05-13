/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class SupplyDirectory {
    
    private ArrayList<Supply> supplyList;

    public SupplyDirectory() {
        supplyList=new ArrayList<>();
        
    }

    public ArrayList<Supply> getSupplyList() {
        return supplyList;
    }

    public void setSupplyList(ArrayList<Supply> supplyList) {
        this.supplyList = supplyList;
    }
    
    public Supply addSupply(){
        Supply s = new Supply();
        supplyList.add(s);
        return s;
    }
    
    public void removeSupply(Supply supply){
        supplyList.remove(supply);
    }
    
    
}


