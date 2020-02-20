/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Schedule;

import Business.Airliner.Airliner;
import Business.Customer.Seat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author apple
 */
public class Flight {
      private String flightNum;
      private Airliner airliner;
      private String airplane;
      private String from;
      private String to;
      private Date departureTime;
      private Date arrivalTime;
      private String timeSlot;
      private ArrayList<Seat> seatList;
      
      
      public Flight(String flightNum,Airliner airliner,String airplane,String from,String to,
              Date departureTime, Date arrivalTime, String timeSlot){
           this.flightNum = flightNum;
           this.airliner = airliner;
           this.airplane = airplane;
           this.from = from;
           this.to = to;
           this.departureTime = departureTime;
           this.arrivalTime  = arrivalTime;
           this.timeSlot = timeSlot;
           seatList = new ArrayList<>();
           addSeat();
      }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public Flight(){
        seatList = new ArrayList<>();
        addSeat();
    }

    public String getFlightNum() {
        return flightNum;
       
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    

    
    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }
    
    @Override
    public String toString(){
        return this.getFlightNum()+"";
    }
    
    private void addSeat(){
           for(int i = 0; i < 150; i++){
               
               if(i >= 0 && i <= 24){
                    Seat seat  = new Seat("A", (i+1), false);
                    seatList.add(seat);
                    
               }else if(i>= 25 && i <= 49){
                    Seat seat  = new Seat("B", (i-24), false);
                    seatList.add(seat);
               
               }else if(i>= 50 && i <= 74){
                    Seat seat  = new Seat("C", (i-49), false);
                    seatList.add(seat);
               
               }else if(i>= 75 && i <= 99){
                    Seat seat  = new Seat("D", (i-74), false);
                    seatList.add(seat);
               
               }else if(i>= 100 && i <= 124){
                    Seat seat  = new Seat("E", (i-99), false);
                    seatList.add(seat);
                    
               }else {
                    Seat seat  = new Seat("F", (i-124), false);
                    seatList.add(seat);
               }
          }
      }
}
