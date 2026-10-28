/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek6;

/**
 *
 * @author SILA SUDE
 */
public class SharedRide extends EconomyRide{
    protected double passengerCount;

    public SharedRide(double passengerCount, double pricePerMinute, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(pricePerMinute, passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.passengerCount = passengerCount;
        if(passengerCount>=1 && passengerCount<=4){
            
        }else{
            passengerCount=1.0;
            System.out.println("Warning ! Must be between 1-4");
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare()/passengerCount)+(super.calculateFare()/passengerCount)*0.10; 
    }

    @Override
    public String toString() {
        return super.toString() + "passengerCount=" + passengerCount ;
    }
    
    
    
}
