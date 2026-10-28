/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek6;

/**
 *
 * @author SILA SUDE
 */
public class PremiumRide extends Ride {
    protected double comfortFee;
    protected double surgeMultiplier;

    public PremiumRide(double comfortFee, double surgeMultiplier, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;
        this.surgeMultiplier = surgeMultiplier;
        if(surgeMultiplier>=1 && surgeMultiplier<=3){
            
        }else{
            surgeMultiplier=1.0;
            System.out.println("Warning ! Must be between 1-3");
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare()+comfortFee)*surgeMultiplier; 
    }

    @Override
    public String toString() {
        return super.toString()+  "comfortFee = " + comfortFee + ", surgeMultiplier = " + surgeMultiplier ;
    }
    
    
    
    
    
}
