/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Schedule;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class MasterFlightSchedule {
      private ArrayList<FlightSchedule> flightScheduleList;
      
      public MasterFlightSchedule(){
          flightScheduleList = new ArrayList<>();
      }

    public ArrayList<FlightSchedule> getFlightScheduleList() {
        return flightScheduleList;
    }

    public void setFlightScheduleList(ArrayList<FlightSchedule> flightScheduleList) {
        this.flightScheduleList = flightScheduleList;
    }
      
      
}
