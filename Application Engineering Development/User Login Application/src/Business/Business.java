/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HumanResource.PersonCatalog;
import Business.SystemAdmin.UserCatalog;

/**
 *
 * @author kaush
 */
public class Business {
    private String name;
    private PersonCatalog pCatalog;
    private UserCatalog uCatalog;

    public Business(String n) {
    this.name=n;
    pCatalog=new PersonCatalog();
    uCatalog=new UserCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonCatalog getpCatalog() {
        return pCatalog;
    }

    public void setpCatalog(PersonCatalog pCatalog) {
        this.pCatalog = pCatalog;
    }

    public UserCatalog getuCatalog() {
        return uCatalog;
    }

    public void setuCatalog(UserCatalog uCatalog) {
        this.uCatalog = uCatalog;
    }
    
    
    
}



