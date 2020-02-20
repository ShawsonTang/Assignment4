/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Schedule.Flight;
import Business.Schedule.FlightSchedule;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author apple
 */
public class AirlinerDirectory {
       private ArrayList<Airliner> airlinerDirectory;
       
       public AirlinerDirectory(){
            airlinerDirectory = new ArrayList<>();

            Airliner air1 = new Airliner("Delta");
            Airliner air2 = new Airliner("Jetblue");

            FlightSchedule fs1 = new FlightSchedule(air1);
            FlightSchedule fs2 = new FlightSchedule(air2);
            
            Calendar calDeparture1 = Calendar.getInstance();
            Calendar calArrival1 = Calendar.getInstance();
            calDeparture1.set(2020, 01, 01, 8, 0);
            calArrival1.set(2020, 01, 01, 11, 0);
            Date dateDeparture1 = calDeparture1.getTime();
            Date dateArrival1 = calArrival1.getTime();
            
            Calendar calDeparture2 = Calendar.getInstance();
            Calendar calArrival2 = Calendar.getInstance();
            calDeparture2.set(2020, 02, 01, 12, 0);
            calArrival2.set(2020, 02, 01, 15, 0);
            Date dateDeparture2 = calDeparture2.getTime();
            Date dateArrival2 = calArrival2.getTime();
            
            Calendar calDeparture3 = Calendar.getInstance();
            Calendar calArrival3 = Calendar.getInstance();
            calDeparture3.set(2020, 03, 01, 18, 0);
            calArrival3.set(2020, 03, 01, 20, 0);
            Date dateDeparture3 = calDeparture3.getTime();
            Date dateArrival3 = calArrival3.getTime();
            
            Calendar calDeparture4 = Calendar.getInstance();
            Calendar calArrival4 = Calendar.getInstance();
            calDeparture4.set(2020, 03, 01, 17, 0);
            calArrival4.set(2020, 03, 01, 19, 0);
            Date dateDeparture4 = calDeparture4.getTime();
            Date dateArrival4 = calArrival4.getTime();
             
            Flight f1 = new Flight("Delta101",air1,"Boeing787","BOS","SFO", dateDeparture1, dateArrival1, "Morning");
            Flight f2 = new Flight("Delta121",air1,"Boeing787","BOS","SFO", dateDeparture2, dateArrival2, "Day");
            Flight f3 = new Flight("Jetblue101",air2,"Boeing747","BOS","LAX", dateDeparture3, dateArrival3, "Evening");
            Flight f4 = new Flight("Jetblue110", air2, "Boeing777", "BOS", "LAX", dateDeparture4, dateArrival4, "Evening");

            fs1.getFlightList().add(f1);
            fs1.getFlightList().add(f2);
            fs2.getFlightList().add(f3);
            fs2.getFlightList().add(f4);
            air1.setFlightSchedule(fs1);
            air2.setFlightSchedule(fs2);


            airlinerDirectory.add(air2);
            airlinerDirectory.add(air1);
       }

    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
       

    public Airliner searchName(String name){
        for(Airliner airliner : this.airlinerDirectory){
            if(airliner.getName().equalsIgnoreCase(name)){
                 return airliner;
          }
        }
         return null;
    }
    

    public Airliner addAirliner() {
        Airliner airliner = new Airliner();
        airlinerDirectory.add(airliner);
        return airliner;
    }
      
    public void deleteAirliner(Airliner a){
          airlinerDirectory.remove(a);
    }

       
}
