/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sales;


import java.util.ArrayList;
import utility.Validator;

/**
 *
 * @author chava
 */
public class EmployeeDirectory {
    
    private ArrayList<Person> personList;
    
    public EmployeeDirectory(){
        
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    //Adding a new Employee to the Directory
    public Person addPerson() {
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    //Removing an Employee from the Directory
    public void removePerson(Person person) {
        personList.remove(person);
    }
    
    //Searching the person from directory based on personId
    public Person searchPerson(String personId) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Person person : personList) {
            if(person.getEmployeeId().equals(personId)) {
                return person;
            }
        }
        return null;
    }
     public Person validateUser(String userName,String password){
        String pwd= Validator.generateHash(password);
        for(Person person : personList) {
            if(person.getUserName().equalsIgnoreCase(userName) && person.getPassword().equals(pwd)){
               
                if(person.getEmployeeId()!= null){
                
                    
                    return person;
                }
                
                else {
                    return person;
                }
            }
        }
        return null;
    }
}
