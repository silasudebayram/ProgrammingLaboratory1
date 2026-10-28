/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek6;

/**
 *
 * @author SILA SUDE
 */
public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.durationMin = durationMin;
        this.pricePerKm = pricePerKm;
        if(distanceKm <0 || durationMin<0 || pricePerKm<0){
            System.out.println("Must be positive");
            this.distanceKm=1;
            this.durationMin=1;
            this.pricePerKm=1;
        }
    }
    public double calculateFare(){
        double result=distanceKm*pricePerKm;
        return result;
    }

    @Override
    public String toString() {
        return  "passengerName = " + passengerName + ", pickup = " + pickup + ", destination = " + destination + ", distanceKm = " + distanceKm + ", durationMin = " + durationMin + ", pricePerKm = " + pricePerKm ;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
    
    
}
