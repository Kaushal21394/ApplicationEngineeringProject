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
public class AirlinerCatalog {
    private ArrayList<Airliner> airliner;

    public AirlinerCatalog() {
        this.airliner=new ArrayList<Airliner>();
        addCsv();
    }
    
    

    public ArrayList<Airliner> getAirliner() {
        return airliner;
    }

    public void setAirliner(ArrayList<Airliner> airliner) {
        this.airliner = airliner;
    }
    
    
    
     public Airliner addAirliner(){
        Airliner air=new  Airliner();
        airliner.add(air);
        return air;
    }
     
     
     public Airliner searchAirliner(String air)
     {
       for(Airliner a: airliner){
           if(a.getAirlineID().equals(air))
           {
               return a;
           }
       } 
       return null;
     }
     
    
     
     public void addCsv(){
        String fileCSV= "D:/Java Documents/Homework4/Airliner.csv";
        BufferedReader br=null;
        String line=",";
        String cvsSB=",";
        
        try{
            br = new BufferedReader(new FileReader(fileCSV));
            while((line=br.readLine())!= null){
                String[] airlinerData= line.split(cvsSB);
                Airliner ap=new Airliner();
               
                ap.setAirlinerName(airlinerData[0]);
                ap.setAirlineID(airlinerData[1]);
                ap.setCompany(airlinerData[2]);
                ap.setFleetSize(Integer.parseInt(airlinerData[4]));
                ap.setHeadquarters(airlinerData[3]);
                
                
                airliner.add(ap);
                
            
        }
            
        }catch(FileNotFoundException e)
        {
                e.printStackTrace();
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}











