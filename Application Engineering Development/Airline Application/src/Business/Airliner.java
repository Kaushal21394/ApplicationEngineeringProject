/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */

public class Airliner {
    private String airline_name;
    private Fleet_catalog fg;
    private ArrayList<Fleet_catalog> air;
     

    public Fleet_catalog getFg() {
        return fg;
    }

    public void setFg(Fleet_catalog fg) {
        this.fg = fg;
    }

    public ArrayList<Fleet_catalog> getAir() {
        return air;
    }

    public void setAir(ArrayList<Fleet_catalog> air) {
        this.air = air;
    }



    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }
    
}










