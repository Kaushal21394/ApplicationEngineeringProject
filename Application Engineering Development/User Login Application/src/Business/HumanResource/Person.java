/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResource;

import Business.SystemAdmin.User;
import Business.SystemAdmin.UserCatalog;
import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class Person {
    
    private ArrayList<User> userCatalog=new ArrayList<User>();
   // private UserCatalog usercat=new UserCatalog();
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<User> getUserCatalog() {
        return userCatalog;
    }

    public void setUserCatalog(ArrayList<User> userCatalog) {
        this.userCatalog = userCatalog;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return firstName ;
    }
    
    
    
}



















