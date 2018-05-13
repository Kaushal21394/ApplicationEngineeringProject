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
public class Airplane {
    private String flight_num;
    private String model_num;
    private String manufacture_name;
    private int manufacturer_year;
    private ArrayList<Flight> flights;
    

   
    
    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    
    
    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num;
    }

    public String getModel_num() {
        return model_num;
    }

    public void setModel_num(String model_num) {
        this.model_num = model_num;
    }

    public String getManufacture_name() {
        return manufacture_name;
    }

    public void setManufacture_name(String manufacture_name) {
        this.manufacture_name = manufacture_name;
    }

    public int getManufacturer_year() {
        return manufacturer_year;
    }

    public void setManufacturer_year(int manufacturer_year) {
        this.manufacturer_year = manufacturer_year;
    }


    
    
    
}






