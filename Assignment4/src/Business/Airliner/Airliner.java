/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Schedule.FlightSchedule;

/**
 *
 * @author apple
 */
public class Airliner {

    private String name;
    
    private FlightSchedule flightSchedule;

    public Airliner(){
          
  
    }
    
    public Airliner(String name){
         this.name = name;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
          return this.getName() + "";
    }   


       
}
