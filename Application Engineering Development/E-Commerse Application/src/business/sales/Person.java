/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sales;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import utility.Validator;

/**
 *
 * @author chava
 */
public class Person {
    
    private String name;
    private String employeeId;
    private int salary;
    private static int count = 0;
    ArrayList<Order> orderList; //Order
    private String userName;
    private String password;
    private String role;
    
    public Person(){
        
        count++;
        employeeId = "EMP"+count;
        orderList= new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Validator.generateHash(password);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public Order addOrder(Order order) {
        //Order order = new Order();
        
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
            
    @Override
    public String toString() {
        return name;
    }    
    
    
    
}
