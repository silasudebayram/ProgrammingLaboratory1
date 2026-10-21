/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek5;

/**
 *
 * @author SILA SUDE
 */
public class OverNightPackage extends Package{
        protected double af; 

    public OverNightPackage(double af, double costPerOunce, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, double weight, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode) {
        super(costPerOunce, senderName, senderAddress, senderCity, senderState, senderZipCode, weight, recipientName, recipientAddress, recipientCity, recipientState, recipientZipCode);
        this.af = af;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (weight * af);
    }

}
