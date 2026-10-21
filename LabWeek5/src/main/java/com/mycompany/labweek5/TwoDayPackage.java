/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek5;

/**
 *
 * @author SILA SUDE
 */
public class TwoDayPackage extends Package{
      protected double flatFee;

    public TwoDayPackage(double flatFee, double costPerOunce, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, double weight, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode) {
        super(costPerOunce, senderName, senderAddress, senderCity, senderState, senderZipCode, weight, recipientName, recipientAddress, recipientCity, recipientState, recipientZipCode);
        this.flatFee = flatFee;
    }

    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}
