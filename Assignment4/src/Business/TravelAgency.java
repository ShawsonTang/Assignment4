/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Customer.TicketHistory;
import Business.Schedule.MasterFlightSchedule;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class TravelAgency {
    private static TravelAgency travelAgency;
    private AirlinerDirectory airlinerDirectory;
    private MasterFlightSchedule masterFlightSchedule;
   // private TicketHistory ticketHistory;

    public static TravelAgency getInstance(){
        if (travelAgency == null){
            travelAgency = new TravelAgency();
        }
        return travelAgency;
    }
    
    public TravelAgency(){
         airlinerDirectory = new  AirlinerDirectory();
         //ticketHistory = new TicketHistory();
         travelOffice = new TravelOffice();
         masterFlightSchedule = new MasterFlightSchedule();
         for(Airliner a : airlinerDirectory.getAirlinerDirectory()){
                masterFlightSchedule.getFlightScheduleList().add(a.getFlightSchedule());
          }
         travelOffice.setMasterFlightSchedule(masterFlightSchedule);

    }
    
    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public MasterFlightSchedule getMasterFlightSchedule() {
        return masterFlightSchedule;
    }

    public void setMasterFlightSchedule(MasterFlightSchedule masterFlightSchedule) {
        this.masterFlightSchedule = masterFlightSchedule;
    }

    /*public TicketHistory getTicketHistory() {
        return ticketHistory;
    }

    public void setTicketHistory(TicketHistory ticketHistory) {
        this.ticketHistory = ticketHistory;
    }**/
    
       private TravelOffice travelOffice;

    public TravelOffice getTravelOffice() {
        return travelOffice;
    }

    public void setTravelOffice(TravelOffice travelOffice) {
        this.travelOffice = travelOffice;
    }
       
       

    
       
       
} 
