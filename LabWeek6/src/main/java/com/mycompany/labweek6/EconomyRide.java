/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek6;

/**
 *
 * @author SILA SUDE
 */
public class EconomyRide extends Ride{
    protected double pricePerMinute;

    public EconomyRide(double pricePerMinute, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare() {
        if(super.calculateFare()+getDurationMin()*pricePerMinute<50){
            return 50;
        }
        return super.calculateFare()+getDurationMin()*pricePerMinute; 
    }

    @Override
    public String toString() {
        return super.toString() + "pricePerMinute = " + pricePerMinute ;
    }
    
    
}
