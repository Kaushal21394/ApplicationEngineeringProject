/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HumanResource.Person;
import Business.HumanResource.PersonCatalog;
import Business.SystemAdmin.User;
import Business.SystemAdmin.UserCatalog;

/**
 *
 * @author kaush
 */
public class ConfigureABusiness {
    
    public static Business Initialize(String n){
        Business b= new Business(n);
        
        PersonCatalog pd1= b.getpCatalog() ;
        UserCatalog uc1=b.getuCatalog();
        
        
        Person p1= pd1.addPerson();
        p1.setFirstName("John");
        p1.setLastName("Cena");
       // p1.setUsername("JCena");
       // p1.setPassword("sysadmin");
        
        User u1=uc1.addUser();
           u1.setPerson(p1);
           u1.setUsername("JCena");
           u1.setPassword("sysadmin");
           u1.setRole("System Admin");
           u1.setStatus("Active");
           
        
        
        
        Person p2=pd1.addPerson();
        p2.setFirstName("Randy");
        p2.setLastName("Ortan");
      //  p2.setUsername("ROrton");
       // p2.setPassword("sysadmin");
       
       
            User u2=uc1.addUser();
            u2.setPerson(p2);
            u2.setUsername("ROrton");
            u2.setRole("System Admin");
            u2.setPassword("sysadmin");
            u2.setStatus("Active");
        
        
        Person p3=pd1.addPerson();
        p3.setFirstName("Shawn");
        p3.setLastName("Micheals");
        //p3.setUsername("shaunM");
        //p3.setPassword("hradmin");
        
      
            User u3=uc1.addUser();
            u3.setUsername("ShaunM");
            u3.setPerson(p3);
            u3.setPassword("hradmin");
            u3.setStatus("Active");
            u3.setRole("HR Admin");
        
        Person p4=pd1.addPerson();
        p4.setFirstName("Triple");
        p4.setLastName("HHH");
       // p4.setUsername("THHH");
       // p4.setPassword("hradmin");
       
            User u4=uc1.addUser();
            u4.setUsername("THHH");
            u4.setPerson(p4);
            u4.setPassword("hradmin");
            u4.setStatus("Active");
            u4.setRole("HR Admin");
        
        return b;
    }
    
}


















