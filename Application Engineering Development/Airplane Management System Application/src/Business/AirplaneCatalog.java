/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class AirplaneCatalog {
    
    private ArrayList<Airplane> airlineCatalog;
    //private Airliner air ;
   // private ArrayList<Airliner> airliner=new ArrayList<Airliner>();
    public AirplaneCatalog() {
        this.airlineCatalog = new ArrayList<Airplane>();
       // this.air=new Airliner();
        addCsv();
    }



    public ArrayList<Airplane> getAirlineCatalog() {
        return airlineCatalog;
    }

    public void setAirlineCatalog(ArrayList<Airplane> airlineCatalog) {
        this.airlineCatalog = airlineCatalog;
    }

     
    
    
   public Airplane addAirplane(){
       Airplane airplane=new Airplane();
       airlineCatalog.add(airplane);
       return airplane;
   }
    
    public Airplane searchAirplane(String ap){
        for(Airplane airplane:airlineCatalog){
            if(airplane.getFlightNumber()==Integer.parseInt(ap))
            {
                return airplane;
            }
            
        }
        return null;
    }
    
    
    public void addCsv(){
        String fileCSV= "D:/Java Documents/Homework4/Airplanes.csv";
        BufferedReader br=null;
        String line=",";
        String cvsSB=",";
        
        try{
            br = new BufferedReader(new FileReader(fileCSV));
            while((line=br.readLine())!= null){
                String[] airplaneData= line.split(cvsSB);
                Airplane ap=new Airplane();
               
                ap.setAirlinerName(airplaneData[0]);
                ap.setAirlineID(airplaneData[1]);
                ap.setFlightNumber(Integer.parseInt(airplaneData[2]));
                ap.setModelNumber(airplaneData[3]);
                ap.setManufactureName(airplaneData[4]);
                ap.setFromLocation(airplaneData[5]);
                ap.setToLocation(airplaneData[6]);
                ap.setArrival(airplaneData[7]);
                ap.setDeparture(airplaneData[8]);
                ap.setSeatPrice(Integer.parseInt(airplaneData[9]));
                
                airlineCatalog.add(ap);
                
            
        }
            
        }catch(FileNotFoundException e)
        {
                e.printStackTrace();
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}






























