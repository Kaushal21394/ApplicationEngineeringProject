/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import business.sales.Order;
import java.util.ArrayList;

/**
 *
 * @author chava
 */
 public class Customer {
 
    
    private String Name;
    private String customerId;
    private String marketName;
    private static int count=0;
    
    public Customer(){
        count++;
        this.customerId= "CUS"+count;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCustomerId() {
        return customerId;
    }

    
//    public int totalRevenueCustomer(){
//        int totalRevenueByCustomer = 0;
//        for(Order order : orderList){
//            
//            totalRevenueByCustomer =+ order.orderTotal();
//        
//        }
//        return totalRevenueByCustomer;
//    }
//    
//    public void removeOrder(Order order) {
//        orderList.remove(order);
//    }
//    
//    public Order searchOrder(String orderId) {
//        for(Order order : orderList) {
//            if(order.getOrderId().equals(orderId)) {
//                return order;
//            }
//        }
//        return null;
//    }
//    

    @Override
    public String toString() {
        return Name;
    } 
    
}


