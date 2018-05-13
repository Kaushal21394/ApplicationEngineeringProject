/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaush
 */
public class PopulateData {
    private ArrayList<Airplane> fleetcatalog= new ArrayList<Airplane>();
    private PersonalDirectory_catalog cd= new PersonalDirectory_catalog();
    private ArrayList<Person> catalogDirectory =new ArrayList<Person>();
    private ArrayList<Flight> flightSchedule = new ArrayList<Flight>();
    private TravelAgency travelagency;

     public void addPersonCsv(){
          
        String fileCSV= "D:/Java Documents/Homework3/Person.csv";
        BufferedReader br=null;
        String line=",";
        String cvsSB=",";
        
        try{
            br = new BufferedReader(new FileReader(fileCSV));
            while((line=br.readLine())!= null){
                String[] personData= line.split(cvsSB);
                Person person=new Person();
                person.setPerson_Fname(personData[0]);
                person.setPerson_Lname(personData[1]);
                person.setPerson_age(personData[3]);
                person.setPerson_gender(personData[2]);
                person.setPerson_passport_no(personData[5]);
                person.setEmailId(personData[4]);
                catalogDirectory.add(person);
                
                cd.setCatalogDirectory(catalogDirectory);   
           
            }
            
        }catch(FileNotFoundException e)
        {
                e.printStackTrace();
        
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        
    }
     

     
     public void seatsAssign(){
         
        // for(Airplane c:a.getFg().getFleetcatalog()){
        //    System.out.println(a.getAirline_name()+c.getFlight_num());
        //}
        
        //Assigning seats
        ArrayList<Seat> seatList1= new ArrayList<Seat>();
         Seat s1= new Seat();
         s1.setPrice(300);
         s1.setSeats_available(16);
         s1.setSeats_sold(4);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2020265")){
                 s1.setP(per);
                 //seatList.add(s1);
             }
         }
         seatList1.add(s1);
         
         Seat s2= new Seat();
         s2.setPrice(250);
         s2.setSeats_available(12);
         s2.setSeats_sold(3);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("I986522")){
                 s2.setP(per);
            //seatList.add(s2);
             }
         }
         seatList1.add(s2);
        
         Seat s17= new Seat();
         s17.setPrice(225);
         s17.setSeats_available(16);
         s17.setSeats_sold(4);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2020265")){
                 s17.setP(per);
                 //seatList.add(s1);
             }
         }
         seatList1.add(s17);
          
         Seat s18= new Seat();
         s18.setPrice(300);
         s18.setSeats_available(16);
         s18.setSeats_sold(4);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2020265")){
                 s17.setP(per);
                 //seatList.add(s1);
             }
         }
         seatList1.add(s18);
         
         Flight f1 = new Flight();
         
         f1.setAirport_name("Logan");
         f1.setSeats(seatList1);
         f1.setArrival_time("9:30PM");
         f1.setDeparture_time("10:50PM");
         f1.setFlightNumber("EK203");
         
         //Flight 1
         ArrayList<Seat> seatList2= new ArrayList<Seat>(); 
         Seat s3= new Seat();
         s3.setPrice(225);
         s3.setSeats_available(12);
         s3.setSeats_sold(6);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q7654331")){
                 s3.setP(per);
                 //seatList.add(s3);
             }
         }
         seatList2.add(s3);
         
         Seat s4= new Seat();
         s4.setPrice(300);
         s4.setSeats_available(12);
         s4.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s4.setP(per);
                //seatList.add(s4);
             }
         }
         seatList2.add(s4);
         
         
         
         Seat s19= new Seat();
         s19.setPrice(250);
         s19.setSeats_available(12);
         s19.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s4.setP(per);
                //seatList.add(s4);
             }
         }
         seatList2.add(s19);
         
         
         
         Seat s20= new Seat();
         s20.setPrice(250);
         s20.setSeats_available(12);
         s20.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s4.setP(per);
                //seatList.add(s4);
             }
         }
         seatList2.add(s20);
         Flight f2 = new Flight();
         f2.setAirport_name("JFK");
         f2.setSeats(seatList2);
         f2.setArrival_time("10:20AM");
         f2.setDeparture_time("11:30AM"); 
         f2.setFlightNumber("EK345");
         
         ArrayList<Flight> flight=new ArrayList<Flight>();
         flight.add(f1);
         flight.add(f2);
         
         
         Airplane airplane=new Airplane();
         airplane.setFlights(flight);
         
         airplane.setFlight_num("EK2017");
         airplane.setManufacture_name("Airbus");
         airplane.setManufacturer_year(2012);
         airplane.setModel_num("A380");
         
       
         
         
         ArrayList<Seat> seatList3= new ArrayList<Seat>();
         Seat s5= new Seat();
         s5.setPrice(225);
         s5.setSeats_available(12);
         s5.setSeats_sold(7);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("A7658976")){
                 s5.setP(per);
                 //seatList.add(s5);
             
             
             }
         }
         seatList3.add(s5);
         
         Seat s6= new Seat();
         s6.setPrice(250);
         s6.setSeats_available(12);
         s6.setSeats_sold(10);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("M9876545")){
                 s6.setP(per);
                 //seatList.add(s6);
            
             }
         }
         seatList3.add(s6);
         
         Seat s31= new Seat();
         s31.setPrice(250);
         s31.setSeats_available(12);
         s31.setSeats_sold(10);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("M9876545")){
                 s31.setP(per);
                 //seatList.add(s6);
            
             }
         }
         seatList3.add(s31);
         
         Seat s32= new Seat();
         s32.setPrice(300);
         s32.setSeats_available(12);
         s32.setSeats_sold(10);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("M9876545")){
                 s32.setP(per);
                 //seatList.add(s6);
            
             }
         }
         seatList3.add(s32);
         
         Flight f3 = new Flight();
         f3.setAirport_name("CSIA");
         f3.setSeats(seatList3);
         f3.setArrival_time("2:10PM");
         f3.setDeparture_time("3:50PM");
         f3.setFlightNumber("EK888");
         ArrayList<Seat> seatList4= new ArrayList<Seat>();
        Seat s7= new Seat();
         s7.setPrice(225);
         s7.setSeats_available(10);
         s7.setSeats_sold(3);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2134561")){
                 s7.setP(per);
             }
         }
         seatList4.add(s7);
         
         Seat s8= new Seat();
         s8.setPrice(300);
         s8.setSeats_available(12);
         s8.setSeats_sold(1);
         
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("I9874532")){
                 s8.setP(per);
             }
         }
         seatList4.add(s8);
         
         
         Seat s21= new Seat();
         s21.setPrice(300);
         s21.setSeats_available(12);
         s21.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s4.setP(per);
                //seatList.add(s4);
             }
         }
         seatList4.add(s21);
         
          
         
         Seat s22= new Seat();
         s22.setPrice(250);
         s22.setSeats_available(12);
         s22.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s4.setP(per);
                //seatList.add(s4);
             }
         }
         seatList4.add(s22);
         
         Flight f4 = new Flight();
         f4.setAirport_name("JFK");
         f4.setSeats(seatList4);
         f4.setArrival_time("10:20AM");
         f4.setFlightNumber("EK771");
         f4.setDeparture_time("11:30AM"); 
         //System.out.println(seatList4);
         ArrayList<Flight> flight1=new ArrayList<Flight>();
         flight1.add(f3);
         flight1.add(f4);
         
         Airplane airplane1=new Airplane();
         airplane1.setFlights(flight1);
         airplane1.setFlight_num("A2018");
         airplane1.setManufacture_name("Airbus");
         airplane1.setManufacturer_year(2012);
         airplane1.setModel_num("A380");
       
        ArrayList<Airplane> ap=new ArrayList<Airplane>();
        ap.add(airplane);
        ap.add(airplane1);
         
  
         Airliner a= new Airliner();
         Fleet_catalog f= new Fleet_catalog();
         f.setFleetcatalog(ap);
         a.setAirline_name("Emirates");
         a.setFg(f);
         int rev=0;
         int rev1=0;
         int z=0;
         
         for(Airplane a1: a.getFg().getFleetcatalog()){
             for (Flight x : a1.getFlights()) {
                 for (Seat q : x.getSeats()) {
                      rev= rev+ q.getPrice();
                     //System.out.println("Airliner: "+a.getAirline_name()+"\n"+"Airplane Number: "+a1.getFlight_num()+"\n"+"Seat Price: "+q.getPrice());
                      //System.out.println("\n");                    
                     
                    
                 }
                 
                 System.out.println("Airliner: "+a.getAirline_name()+"\n"+"Airplane Number: "+a1.getFlight_num()+"\t"+"Revenue: "+rev);
                 System.out.println("\n");
                                  
                 z+=rev;
                 
                 rev=0;
                 
                
                 
             }
            
            
            System.out.println("Fleet Revenue : "+z);
            System.out.println("\n");
            
            rev1+=z;
            z=0;
            
            
         }
         //System.out.println("Airliner Revenue:"+rev1);
     
         //Airliner 2
         
         ArrayList<Seat> seatList5= new ArrayList<Seat>();
         Seat s9= new Seat();
         s9.setPrice(300);
         s9.setSeats_available(16);
         s9.setSeats_sold(4);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2020265")){
                 s9.setP(per);
                 //seatList.add(s1);
             }
         }
         seatList5.add(s9);
         
         Seat s10= new Seat();
         s10.setPrice(250);
         s10.setSeats_available(12);
         s10.setSeats_sold(3);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("I986522")){
                 s10.setP(per);
            //seatList.add(s2);
             }
         }
         seatList5.add(s10);
         
        ;
         
         Seat s23= new Seat();
         s23.setPrice(300);
         s23.setSeats_available(12);
         s23.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s23.setP(per);
                //seatList.add(s4);
             }
         }
         seatList5.add(s23);
        
        
         Seat s24= new Seat();
         s24.setPrice(250);
         s24.setSeats_available(16);
         s24.setSeats_sold(4);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2020265")){
                 s24.setP(per);
                 //seatList.add(s1);
             }
         }
         seatList5.add(s24);
         
         Flight f5 = new Flight();
         f5.setAirport_name("Heathrow");
         f5.setSeats(seatList5);
         f5.setArrival_time("4:30PM");
         f5.setDeparture_time("5:50PM");
         f5.setFlightNumber("EE2345");
         //Flight 1
         ArrayList<Seat> seatList6= new ArrayList<Seat>(); 
         Seat s11= new Seat();
         s11.setPrice(225);
         s11.setSeats_available(12);
         s11.setSeats_sold(6);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q7654331")){
                 s11.setP(per);
                 //seatList.add(s3);
             }
         }
         seatList6.add(s11);
         
         Seat s12= new Seat();
         s12.setPrice(225);
         s12.setSeats_available(12);
         s12.setSeats_sold(6);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q8762221")){
                 s12.setP(per);
                //seatList.add(s4);
             }
         }
         seatList6.add(s12);
         
         Seat s25= new Seat();
         s25.setPrice(250);
         s25.setSeats_available(12);
         s25.setSeats_sold(6);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q7654331")){
                 s25.setP(per);
                 //seatList.add(s3);
             }
         }
         seatList6.add(s25);
         
         Seat s26= new Seat();
         s26.setPrice(300);
         s26.setSeats_available(12);
         s26.setSeats_sold(6);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Q7654331")){
                 s26.setP(per);
                 //seatList.add(s3);
             }
         }
         seatList6.add(s26);
         Flight f6 = new Flight();
         f6.setAirport_name("LAX");
         f6.setSeats(seatList2);
         f6.setArrival_time("10:20AM");
         f6.setDeparture_time("11:30AM"); 
         f6.setFlightNumber("EE2501");
         
         ArrayList<Flight> flight3=new ArrayList<Flight>();
         flight3.add(f5);
         flight3.add(f6);
         
         
         Airplane airplane3=new Airplane();
         airplane3.setFlights(flight);
         
         airplane3.setFlight_num("A12017");
         airplane3.setManufacture_name("Airbus");
         airplane3.setManufacturer_year(2012);
         airplane3.setModel_num("A380");
         
       
         
         
         ArrayList<Seat> seatList7= new ArrayList<Seat>();
         Seat s13= new Seat();
         s13.setPrice(250);
         s13.setSeats_available(12);
         s13.setSeats_sold(7);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("A7658976")){
                 s13.setP(per);
                 //seatList.add(s5);
             
             
             }
         }
         seatList7.add(s13);
         
         Seat s14= new Seat();
         s14.setPrice(250);
         s14.setSeats_available(12);
         s14.setSeats_sold(10);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("M9876545")){
                 s14.setP(per);
                 //seatList.add(s6);
            
             }
         }
         seatList7.add(s14);
         
         Seat s27= new Seat();
         s27.setPrice(250);
         s27.setSeats_available(12);
         s27.setSeats_sold(7);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("A7658976")){
                 s27.setP(per);
                 //seatList.add(s5);
             
             
             }
         }
         seatList7.add(s27);
         Seat s28= new Seat();
         s28.setPrice(250);
         s28.setSeats_available(12);
         s28.setSeats_sold(7);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("A7658976")){
                 s13.setP(per);
                 //seatList.add(s5);
             
             
             }
         }
         seatList7.add(s28);
         Flight f7 = new Flight();
         f7.setAirport_name("CSIA");
         f7.setSeats(seatList3);
         f7.setArrival_time("2:10PM");
         f7.setDeparture_time("3:50PM");
         f7.setFlightNumber("EE4444");
         ArrayList<Seat> seatList8= new ArrayList<Seat>();
        Seat s15= new Seat();
         s15.setPrice(300);
         s15.setSeats_available(10);
         s15.setSeats_sold(3);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2134561")){
                 s15.setP(per);
             }
         }
         seatList8.add(s15);
         
         Seat s16= new Seat();
         s16.setPrice(250);
         s16.setSeats_available(12);
         s16.setSeats_sold(1);
         
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("I9874532")){
                 s16.setP(per);
             }
         }
         seatList8.add(s16);
         
          Seat s29= new Seat();
         s29.setPrice(225);
         s29.setSeats_available(10);
         s29.setSeats_sold(3);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("Z9876584")){
                 s29.setP(per);
             }
         }
         seatList8.add(s29);
         
         Seat s30= new Seat();
         s30.setPrice(300);
         s30.setSeats_available(10);
         s30.setSeats_sold(3);
         for (Person per : cd.getCatalogDirectory()) {
             if(per.getPerson_passport_no().equals("P2134561")){
                 s30.setP(per);
             }
         }
         seatList8.add(s30);
         
         Flight f8 = new Flight();
         f8.setAirport_name("Heathrow");
         f8.setSeats(seatList4);
         f8.setArrival_time("10:20AM");
         f8.setDeparture_time("11:30AM"); 
         f8.setFlightNumber("EE3245");
         
         ArrayList<Flight> flight4=new ArrayList<Flight>();
         flight4.add(f7);
         flight4.add(f8);
         
         Airplane airplane4=new Airplane();
         airplane4.setFlights(flight1);
         airplane4.setFlight_num("WE2018");
         airplane4.setManufacture_name("Airbus");
         airplane4.setManufacturer_year(2012);
         airplane4.setModel_num("A380");
       
        ArrayList<Airplane> ap2=new ArrayList<Airplane>();
        ap2.add(airplane3);
        ap2.add(airplane4);
         
  
         Airliner a2= new Airliner();
         Fleet_catalog fleet2= new Fleet_catalog();
         fleet2.setFleetcatalog(ap);
         a2.setAirline_name("Qatar");
         a2.setFg(f);
         int rev2=0;
         int rev3=0;
         int z2=0;
         
         for(Airplane air2: a2.getFg().getFleetcatalog()){
             for (Flight x2 : air2.getFlights()) {
                 for (Seat q2 : x2.getSeats()) {
                     rev2= rev2+ q2.getPrice();
                     //System.out.println("Airliner: "+a2.getAirline_name()+"\n"+"Airplane Number: "+air2.getFlight_num()+"\n"+"Seat Price: "+q2.getPrice());
                     //System.out.println("\n");                  
                     
                    
                 }
                 System.out.println("Airliner: "+a2.getAirline_name()+"\n"+"Airplane Number: "+air2.getFlight_num()+"\t"+"Revenue: "+rev2);
                 System.out.println("\n");
                                  
                 z2+=rev2;
                 
                 rev2=0;
                 
                
                 
             }
            
            
            System.out.println("Fleet Revenue : "+z2);
            System.out.println("\n");
            
            rev3+=z2;
            z2=0;
            
            
         }
         System.out.println("Emirates Revenue:"+rev1+"\n");
         System.out.println("Qatar Revenue:"+rev3+"\n"); 
         
         int total=rev1+rev3;
         System.out.println("Total Revenue: "+total+"\n");
         
         
         
                  
         ArrayList<PersonalDirectory_catalog> pdc=new ArrayList<PersonalDirectory_catalog>();
         ArrayList<Airliner> airliner1=new ArrayList<Airliner>();
        
         TravelAgency ta=new TravelAgency();
         ta.setAirliner(a);
         ta.setAirliner(a2);
         airliner1.add(a);
         airliner1.add(a2);
         ta.setPersond(cd);
         pdc.add(cd);
         
        
         
         
         
         
     }
       
            
            
        
    
     public static void main(String[] args) {
     
    /*File file=new File("D:/Java Documents/Homework3/Person.csv");
     try{
         Scanner sc=new Scanner(file);
         while(sc.hasNextLine()){
                 String b =sc.nextLine();
                 System.out.println(b);
     }
         }catch(FileNotFoundException e){
             e.printStackTrace();
         }
     System.out.println("\n\n");
        */
         PopulateData a= new PopulateData();
         System.out.println("*********************OUTPUT*********************");
         a.addPersonCsv();
         a.seatsAssign();
         
        
            
    }
     
     
     
     }
     
     
     
     
     





















































































































































