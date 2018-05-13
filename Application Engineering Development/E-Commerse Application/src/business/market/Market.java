/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class Market {
    
    private String marketName;
    private String marketId;
    private static int rid = 0;
    private ArrayList<Customer> customerDirectory;
    
    public Market(){
        
        rid++;
        this.marketId= "MAR"+ rid;
        customerDirectory= new ArrayList<>();
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer() {
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer customer) {
        customerDirectory.remove(customer);
    }
    
    public Customer searchCustomer(String customerId) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Customer customer : customerDirectory) {
            if(customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
    
//    public int marketSalesRevenue(){
//        int marketSalesRevenue= 0;
//        for(Customer customer: customerDirectory){
//         marketSalesRevenue =+ customer.totalRevenueCustomer();
//        } 
//        return marketSalesRevenue;
//    }
    
    
    
    @Override
    public String toString() {
        return marketName;
    } 
    
}
