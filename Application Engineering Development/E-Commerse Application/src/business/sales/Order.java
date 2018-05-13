/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sales;

import business.market.Customer;
import business.market.MarketOffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author chava
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private String orderId;
    private String Status;
    private Date orderDate;
    private Date expectedDeliveryDate;
    private static int oid = 0;
    private Person person;
    private Customer customer;
    private double salesCommission;
    
    public Order(){
        
        oid++;
        orderId = "ORD"+oid;
        
        person = new Person();
        customer = new Customer();
        orderItemList= new ArrayList<OrderItem>();
        orderDate= new Date();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getOrderDate() {
        populateStatus();
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }
    
    
    public OrderItem addOrderItem() {
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public void removeOrderItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }
    
    public OrderItem searchOrderItem(int orderItemName) {
        for(OrderItem orderItem : orderItemList) {
            if(orderItem.getMarketOffer().getProduct().getProdName().equals(orderItemName)) {
                return orderItem;
            }
        }
        return null;
    }
    
    public double orderTotal(){
        double totalPriceOrder = 0;
        for(OrderItem orderItem:orderItemList){
            
         totalPriceOrder = totalPriceOrder+ orderItem.orderItemTotal();
        }
        return totalPriceOrder;
    }
    
    public double orderTargetTotal(){
     double targetTotal=0;
            for (OrderItem orderItem : orderItemList) {
                MarketOffer offer= orderItem.getMarketOffer();
                    targetTotal = targetTotal + (offer.getProduct().getPrice()* offer.getTargetRatio()* orderItem.getQuantity());       
            }
            
        return targetTotal;
    }
 
   public String populateStatus(){
       
                
                Date date = new Date();  
                Calendar curdate=Calendar.getInstance();
                curdate.set(Calendar.DATE, orderDate.getDate()+1);
                curdate.set(Calendar.MILLISECOND, 0);
                curdate.set(Calendar.SECOND, 0);
                curdate.set(Calendar.MINUTE, 0);
                curdate.set(Calendar.HOUR, 0);
                //curdate.add(Calendar.DATE,1);  
                System.out.println("TodaysDate+1"+curdate.getTime());
          if(date.after(curdate.getTime()))
                {
                    
           setStatus("Shipped");
           return Status;
                }        
       
     
       else if (getExpectedDeliveryDate().before(date)){
                 
                    setStatus("Delivered");
                    return Status;
                } 
   return null;}
   
    @Override
    public String toString() {
        return orderId;
    }
    
//    public static void main(String args[]){
//        
//        Order order = new Order();
//        Date date = new Date();
//        order.setExpectedDeliveryDate(date);
//        order.setOrderDate(date);
//        order.populateStatus();
//    }
}
