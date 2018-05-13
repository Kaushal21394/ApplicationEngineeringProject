/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResource;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class PersonCatalog {
    private ArrayList<Person> personCatalog;

    public PersonCatalog() {
        personCatalog=new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonCatalog() {
        return personCatalog;
    }

    public void setPersonCatalog(ArrayList<Person> personCatalog) {
        this.personCatalog = personCatalog;
    }
    
    public Person addPerson(){
        Person person=new Person();
        personCatalog.add(person);
        return person;
    }
    
    public Person searchPerson(String un){
        for(Person p: personCatalog){
            if(p.getUsername().equals(un))
                return p;
        }
        return null;
    }
      public void deletePerson(Person u){
        personCatalog.remove(u);
    }
    
}






