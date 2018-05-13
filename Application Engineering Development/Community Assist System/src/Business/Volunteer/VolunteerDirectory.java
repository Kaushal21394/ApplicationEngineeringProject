/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerList;

    public VolunteerDirectory() {
        volunteerList= new ArrayList<>();
        
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    public Volunteer addVolunteer(){
    
        Volunteer v = new Volunteer();
        volunteerList.add(v);
        return v;
    }
    
    public void removeVolunteer(Volunteer v){
        volunteerList.remove(v);
    }
}


