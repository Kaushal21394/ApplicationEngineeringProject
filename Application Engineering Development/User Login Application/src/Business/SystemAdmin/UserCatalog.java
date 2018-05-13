/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemAdmin;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class UserCatalog {
    private ArrayList<User> userCatalog;

    public UserCatalog() {
        userCatalog=new ArrayList<User>();
    }

    public ArrayList<User> getUserCatalog() {
        return userCatalog;
    }

    public void setUserCatalog(ArrayList<User> userCatalog) {
        this.userCatalog = userCatalog;
    }
    
    
    
    public User addUser(){
        User user= new User();
        userCatalog.add(user);
        return user;
    }
    
    public User searchUser(String un){
        
        for(User user:userCatalog)
        {
            if(user.getUsername().equals(un)){
                return user;
            }
        }
        return null;
    }
    
    public void deletePerson(User u){
        userCatalog.remove(u);
    }
            
    
}






