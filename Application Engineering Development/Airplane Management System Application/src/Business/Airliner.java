/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kaush
 */
public class Airliner {
    
    private Airplane airplane;
    private String AirlinerName;
    private String airlineID;
    private int fleetSize;
    private String headquarters;
    private String company;
    

    public String getAirlinerName() {
        return AirlinerName;
    }

    public void setAirlinerName(String AirlinerName) {
        this.AirlinerName = AirlinerName;
    }

    public String getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(String airlineID) {
        this.airlineID = airlineID;
    }
    
        public String toString(){
        return airlineID;
    } 

    public int getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(int fleetSize) {
        this.fleetSize = fleetSize;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    
    
}



