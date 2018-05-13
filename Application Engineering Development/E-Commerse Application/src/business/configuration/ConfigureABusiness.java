/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.configuration;

import business.market.Customer;
import business.market.Market;
import business.market.MarketDirectory;
import business.market.MarketOffer;
import business.market.MarketOfferCatalog;
import business.sales.EmployeeDirectory;
import business.sales.Order;
import business.sales.OrderDirectory;
import business.sales.OrderItem;
import business.sales.Person;
import business.supplier.Product;
import business.supplier.Supplier;
import business.supplier.SupplierDirectory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chava
 */
public class ConfigureABusiness {

    public static Business Initialize() {
        try{
        Business business = new Business();
        MarketDirectory marketDirectory = business.getMarketDirectory();
        MarketOfferCatalog marketOfferCatalog = business.getMarketOfferCatalog();
        SupplierDirectory supplierDirectory = business.getSupplierDirectory();
        EmployeeDirectory employeeDirectory = business.getEmployeeDirectory();
        OrderDirectory orderDirectory = business.getOrderDirectory();
        
        Person p1 = employeeDirectory.addPerson();
        p1.setName("Aditya Pawar");
        p1.setUserName("aditya");
        p1.setPassword("powar");
        p1.setRole("Sales");
        p1.setSalary(15000);

        Person p2 = employeeDirectory.addPerson();
        p2.setName("Kaushal Chaudhary");
        p2.setUserName("kaushal");
        p2.setPassword("chaudhary");
        p2.setRole("Sales");
        p2.setSalary(14000);

        Person p3 = employeeDirectory.addPerson();
        p3.setName("Gauresh Chavan");
        p3.setUserName("gauresh");
        p3.setPassword("chavan");
        p3.setRole("Admin");
        p3.setSalary(10000000);
        
        Person p4 = employeeDirectory.addPerson();
        p4.setName("Mohit Ruke");
        p4.setUserName("mruke");
        p4.setPassword("ruke");
        p4.setRole("Sales");
        p4.setSalary(1700);
        
        Person p5 = employeeDirectory.addPerson();
        p5.setName("Pranav Walimbe");
        p5.setUserName("pranav");
        p5.setPassword("walimbe");
        p5.setRole("Sales");
        p5.setSalary(19000);
        
        Person p6 = employeeDirectory.addPerson();
        p6.setName("Virender Sehwag");
        p6.setUserName("virender");
        p6.setPassword("sehwag");
        p6.setRole("Sales");
        p6.setSalary(9000);
        
        Person p7 = employeeDirectory.addPerson();
        p7.setName("Omprakash");
        p7.setUserName("mishra");
        p7.setPassword("aunty");
        p7.setRole("Sales");
        p7.setSalary(9000);
        
        Person p8 = employeeDirectory.addPerson();
        p8.setName("Om");
        p8.setUserName("hariom");
        p8.setPassword("aunty");
        p8.setRole("Sales");
        p8.setSalary(12000);
        
        Person p9 = employeeDirectory.addPerson();
        p9.setName("Jai");
        p9.setUserName("mishra");
        p9.setPassword("aunty");
        p9.setRole("Sales");
        p9.setSalary(10000);
        
        Person p10 = employeeDirectory.addPerson();
        p10.setName("Jagdish");
        p10.setUserName("mishra");
        p10.setPassword("aunty");
        p10.setRole("Sales");
        p10.setSalary(9000);
        
        
        Person p11 = employeeDirectory.addPerson();
        p11.setName("Rishi");
        p11.setUserName("Rajani");
        p11.setPassword("aunty");
        p11.setRole("Sales");
        p11.setSalary(19000);
        
        
        

        Market market1 = marketDirectory.addMarket();
        market1.setMarketName("Education");
        Customer cd= new Customer();
        cd.setName("Northeastern University");
        cd.setMarketName(market1.getMarketName());
        Customer cd1= new Customer();
        cd1.setName("Wentworth University");
        cd1.setMarketName(market1.getMarketName());
        Customer cd2= new Customer();
        cd2.setName("Massachussets Institute");
        cd2.setMarketName(market1.getMarketName());
        ArrayList <Customer> c= new ArrayList<>();
        
        c.add(cd);
        c.add(cd1);
        c.add(cd2);
        market1.setCustomerDirectory(c);
        
        Market market2 = marketDirectory.addMarket();
        market2.setMarketName("Finance");
        Customer f1= new Customer();
        f1.setName("Santander Bank");
        f1.setMarketName(market2.getMarketName());
        Customer f2= new Customer();
        f2.setName("Bank of America");
        f2.setMarketName(market2.getMarketName());
        Customer f3= new Customer();
        f3.setName("Citizens Bank");
        f3.setMarketName(market2.getMarketName());
        ArrayList <Customer> f= new ArrayList<>();
        f.add(f1);
        f.add(f2);
        f.add(f3);
        market2.setCustomerDirectory(f);
        
        Market market3 = marketDirectory.addMarket();
        market3.setMarketName("Sports");
        Customer s1= new Customer();
        s1.setName("Cricket Academy");
        s1.setMarketName(market3.getMarketName());
        Customer s2= new Customer();
        s2.setName("Soccer Academy");
        s2.setMarketName(market3.getMarketName());
        Customer s3= new Customer();
        s3.setName("Table Tennis Academy");
        s3.setMarketName(market3.getMarketName());
        ArrayList <Customer> s= new ArrayList<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        market3.setCustomerDirectory(s);
        
        Supplier sup1= supplierDirectory.addSupplier();
        sup1.setSupplyName("Dell");
        sup1.setUsername("dell");
        sup1.setPassword("dell");
        
        Product p=sup1.getProductCatalog().addProduct();
        p.setPrice(120);
        p.setProdName("Printer X50");
        p.setAvailQuantity(100);
        
        Product pr1=sup1.getProductCatalog().addProduct();
        pr1.setPrice(140);
        pr1.setProdName("3D Printer");
        pr1.setAvailQuantity(100);
        
        Product pr2=sup1.getProductCatalog().addProduct();
        pr2.setPrice(1200);
        pr2.setProdName("Dell Inspiron 7000 Gaming");    
        pr2.setAvailQuantity(100);
        
        Product pr3=sup1.getProductCatalog().addProduct();
        pr3.setPrice(1200);
        pr3.setProdName("Dell XPS"); 
        pr3.setAvailQuantity(100);
        
        Supplier sup2= supplierDirectory.addSupplier();
        sup2.setSupplyName("HP");
        sup2.setUsername("hp");
        sup2.setPassword("hp");
        
        Product pr4=sup2.getProductCatalog().addProduct();
        pr4.setPrice(1000);
        pr4.setProdName("Laptop HP Pavillion");
        pr4.setAvailQuantity(100);
        
        Product pr5=sup2.getProductCatalog().addProduct();
        pr5.setPrice(640);
        pr5.setProdName("HP Printer");
        pr5.setAvailQuantity(100);
        
        Product pr6=sup2.getProductCatalog().addProduct();
        pr6.setPrice(800);
        pr6.setProdName("HP DV6 Laptop");
        pr6.setAvailQuantity(46);
        
        
        Product pr7=sup2.getProductCatalog().addProduct();
        pr7.setPrice(350);
        pr7.setProdName("HP Pendrive 16GB"); 
        pr7.setAvailQuantity(100);
        
        Product pr8=sup2.getProductCatalog().addProduct();
        pr8.setPrice(650);
        pr8.setProdName("HP Pendrive 32GB"); 
        pr8.setAvailQuantity(100); 
        
        Supplier sup4= supplierDirectory.addSupplier();
        sup4.setSupplyName("Nike");
        sup4.setUsername("nike");
        sup4.setPassword("nike");
        
        Product pr9=sup4.getProductCatalog().addProduct();
        pr9.setPrice(700);
        pr9.setProdName("Kashmir Willow Cricket Bat");
        pr9.setAvailQuantity(100);
        
        Product pr10=sup4.getProductCatalog().addProduct();
        pr10.setPrice(400);
        pr10.setProdName("TT Bat");
        pr10.setAvailQuantity(100);
        
        Product pr11=sup4.getProductCatalog().addProduct();
        pr11.setPrice(550);
        pr11.setProdName("Soccer Ball"); 
        pr11.setAvailQuantity(100);
        
        Product pr12=sup4.getProductCatalog().addProduct();
        pr12.setPrice(750);
        pr12.setProdName("Basket Ball"); 
        pr12.setAvailQuantity(100);
        
        ArrayList <Product> products= new ArrayList<>();
        products.add(p);
        products.add(pr1);
        products.add(pr2);
        products.add(pr3);
        products.add(pr4);
        products.add(pr5);
        products.add(pr7);
        products.add(pr6);
        products.add(pr8);
        products.add(pr9);
        products.add(pr10);
        products.add(pr11);
        products.add(pr12);
        MarketOffer marketOffer1= new MarketOffer();
        MarketOffer marketOffer2= new MarketOffer();
        MarketOffer marketOffer= new MarketOffer();
        for (Market market : marketDirectory.getMarketList()) {
            for (Product product : products) {
                if(market.getMarketName().equals("Education")){
            marketOffer= marketOfferCatalog.addMarketOffer();
        marketOffer.setMarket(market);
        marketOffer.setProduct(product);
        marketOffer.setTargetRatio(0.9);
        marketOffer.setFloorRatio(0.8);
        marketOffer.setCeilingRatio(1.2); 
                }
                else if(market.getMarketName().equals("Finance")){
            marketOffer1= marketOfferCatalog.addMarketOffer();
        marketOffer1.setMarket(market);
        marketOffer1.setProduct(product);
        marketOffer1.setTargetRatio(1.3);
        marketOffer1.setFloorRatio(1.1);
        marketOffer1.setCeilingRatio(1.5); 
                }
                else if(market.getMarketName().equals("Sports")){
            marketOffer2= marketOfferCatalog.addMarketOffer();
        marketOffer2.setMarket(market);
        marketOffer2.setProduct(product);
        marketOffer2.setTargetRatio(1.1);
        marketOffer2.setFloorRatio(0.9);
        marketOffer2.setCeilingRatio(1.5); 
                }
            } 
        }
        
        OrderItem item= new OrderItem();
        item.setMarketOffer(marketOffer);
        item.setQuantity(2);
        item.setPaidPrice(550);
         
        OrderItem item1= new OrderItem();
        item1.setMarketOffer(marketOffer1);
        item1.setQuantity(5);
        item1.setPaidPrice(560);
        
        OrderItem item2= new OrderItem();
        item2.setMarketOffer(marketOffer2);
        item2.setQuantity(7);
        item2.setPaidPrice(240);
        
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
        
        Order order= business.getOrderDirectory().addOrder();
        order.setCustomer(cd2);
        order.setExpectedDeliveryDate(sdf.parse("10/25/2017"));
        order.setPerson(p1);
        order.setStatus("Shipped");
        order.getOrderItemList().add(item);
        p1.getOrderList().add(order);
        
        
        Order order1= business.getOrderDirectory().addOrder();
        order1.setCustomer(f2);
        order1.setExpectedDeliveryDate(sdf.parse("10/24/2017"));
        order1.setPerson(p2);
        order1.setStatus("Shipped");
        order1.getOrderItemList().add(item1);
        p2.getOrderList().add(order1);
        
        Order order3= business.getOrderDirectory().addOrder();
        order3.setCustomer(f3);
        order3.setExpectedDeliveryDate(sdf.parse("10/27/2017"));
        order3.setPerson(p5);
        order3.setStatus("Shipped");
        order3.getOrderItemList().add(item);
        p5.getOrderList().add(order3);
        
        Order order4= business.getOrderDirectory().addOrder();
        order4.setCustomer(s2);
        order4.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order4.setPerson(p4);
        order4.setStatus("Transit");
        order4.getOrderItemList().add(item2);
        p4.getOrderList().add(order4);
        
        Order order5= business.getOrderDirectory().addOrder();
        order5.setCustomer(f1);
        order5.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order5.setPerson(p6);
        order5.setStatus("Transit");
        order5.getOrderItemList().add(item2);
        p6.getOrderList().add(order5);
       
        Order order6 = business.getOrderDirectory().addOrder();
        order6.setCustomer(f3);
        order6.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order6.setPerson(p7);
        order6.setStatus("Transit");
        order6.getOrderItemList().add(item1);
        p7.getOrderList().add(order6);
        
        Order order7= business.getOrderDirectory().addOrder();
        order7.setCustomer(s2);
        order7.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order7.setPerson(p8);
        order7.setStatus("Transit");
        order7.getOrderItemList().add(item2);
        p8.getOrderList().add(order7);
        
        Order order8= business.getOrderDirectory().addOrder();
        order8.setCustomer(s2);
        order8.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order8.setPerson(p9);
        order8.setStatus("Transit");
        order8.getOrderItemList().add(item2);
        p9.getOrderList().add(order8);
        
        Order order9= business.getOrderDirectory().addOrder();
        order9.setCustomer(cd1);
        order9.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order9.setPerson(p10);
        order9.setStatus("Transit");
        order9.getOrderItemList().add(item);
        p10.getOrderList().add(order9);
        
        Order order10= business.getOrderDirectory().addOrder();
        order10.setCustomer(s2);
        order10.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order10.setPerson(p10);
        order10.setStatus("Transit");
        order10.getOrderItemList().add(item2);
        p11.getOrderList().add(order10);
        
        Order order11= business.getOrderDirectory().addOrder();
        order11.setCustomer(s2);
        order11.setExpectedDeliveryDate(sdf.parse("10/29/2017"));
        order11.setPerson(p2);
        order11.setStatus("Transit");
        order11.getOrderItemList().add(item1);
        p2.getOrderList().add(order11);
        return business;
        }catch(ParseException p){
            JOptionPane.showMessageDialog(null, "Date parse exception");
        }
        return null;
    }
       
    
}
