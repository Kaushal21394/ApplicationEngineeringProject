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
public class Supplier {
    private String sName;
    private static int sCount=0;
    private String supplierId;
    private WorkQueue workQueue;
    private SupplyDirectory supplyDirectory;
    private Supply supply;

    public Supplier() {
        
        supplierId = "SUP"+(++sCount);
        workQueue= new WorkQueue();
        supplyDirectory = new SupplyDirectory();
        supply = new Supply();
    }

    public SupplyDirectory getSupplyDirectory() {
        return supplyDirectory;
    }

    public void setSupplyDirectory(SupplyDirectory supplyDirectory) {
        this.supplyDirectory = supplyDirectory;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }


    

    
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return sName;
    }
}








