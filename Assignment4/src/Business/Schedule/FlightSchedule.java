/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Schedule;

import Business.Airliner.Airliner;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class FlightSchedule {
    private ArrayList<Flight> flightList;
    
    private Airliner airliner;
    
    public FlightSchedule(){
        flightList = new ArrayList<>();
    }
    
    public FlightSchedule(Airliner a){
        flightList = new ArrayList<>();
        this.airliner = a;
        
        
        
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
    
    
    
    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    public Flight addFlight(){
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
    
        public void deleteFlight(Flight flight){
        flightList.remove(flight);
    }
   
   
  
}
