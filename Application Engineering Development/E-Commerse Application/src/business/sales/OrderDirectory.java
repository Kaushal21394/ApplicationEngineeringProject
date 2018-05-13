/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sales;

import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class OrderDirectory {
 
    private ArrayList<Order> orderList;
    
    public OrderDirectory(){
        
        orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addOrder() {
        Order order = new Order();
        orderList.add(order);
        return order;
    }
    
    public void removeOrder(Order order) {
        orderList.remove(order);
    }
    
    public Order searchOrder(String orderId) {
        for(Order order : orderList) {
            if(order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }
    
    
    public int totalRevenue(){
        
        int totalRevenueXerox = 0;
        for(Order order: orderList){
            
          totalRevenueXerox +=  order.orderTotal();
        }
        return totalRevenueXerox;
    }
}
