/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.configuration;

import business.market.MarketDirectory;
import business.market.MarketOfferCatalog;
import business.sales.EmployeeDirectory;
import business.sales.OrderDirectory;
import business.supplier.SupplierDirectory;

/**
 *
 * @author chava
 */
public class Business {
    
    private final String businessName;
    private MarketDirectory marketDirectory;
    private MarketOfferCatalog marketOfferCatalog;
    private SupplierDirectory supplierDirectory;
    private EmployeeDirectory employeeDirectory;
    private OrderDirectory orderDirectory;
    
    
    public Business(){
        orderDirectory= new OrderDirectory();
        marketDirectory = new MarketDirectory();
        marketOfferCatalog = new MarketOfferCatalog();
        supplierDirectory = new SupplierDirectory();
        employeeDirectory = new EmployeeDirectory();
        businessName = "XEROX";
        
        
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    

    public String getBusinessName() {
        return businessName;
    }

    public MarketDirectory getMarketDirectory() {
        return marketDirectory;
    }

    public void setMarketDirectory(MarketDirectory marketDirectory) {
        this.marketDirectory = marketDirectory;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
  
    
    
    @Override
    public String toString() {
        return businessName;
    }
    
}
