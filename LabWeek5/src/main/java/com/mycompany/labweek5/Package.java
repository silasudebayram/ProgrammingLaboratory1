/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek5;

/**
 *
 * @author SILA SUDE
 */
public class Package {
  
    protected String senderName;
    protected String senderAddress;
    protected String senderCity;
    protected String senderState;
    protected String senderZipCode;

    protected double weight;
    protected String recipientName;
    protected String recipientAddress;
    protected String recipientCity;
    protected String recipientState;
    protected String recipientZipCode;

    protected double costPerOunce;

    public Package(double costPerOunce, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, double weight, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode) {
        this.costPerOunce = costPerOunce;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.weight = weight;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZipCode = recipientZipCode;

        if (weight < 0 || costPerOunce < 0) {
            System.out.println("Weight and Cost per ounce must be positive");
        }
    }

    public double calculateCost() {
        double totalCost = weight * costPerOunce;
        return totalCost;
    }
}

