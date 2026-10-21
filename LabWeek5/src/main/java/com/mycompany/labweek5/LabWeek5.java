/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labweek5;

/**
 *
 * @author SILA SUDE
 */
public class LabWeek5 {

   public static void main(String[] args) {
        TwoDayPackage package1 = new TwoDayPackage(2.0, 0.5, "John", "Main St", "Boston", "MA", "02101", 10.0, "Alice", "123 High St", "New York", "NY", "10001");
        OverNightPackage package2 = new OverNightPackage(0.25, 0.5, "Frank", "123 Main St", "Boston", "MA", "02101", 10.0, "Alice", "123 High St", "New York", "NY", "10001");

        System.out.println("----------------------------------");
        System.out.println("Sender Name : " + package1.senderName);
        System.out.println("Sender Address : " + package1.senderAddress);
        System.out.println("Sender City : " + package1.senderCity);
        System.out.println("Sender State : " + package1.senderState);
        System.out.println("Sender Zip Code : " + package1.senderZipCode);
        System.out.println("Recipient Name : " + package1.recipientName);
        System.out.println("Recipient Address : " + package1.recipientAddress);
        System.out.println("Recipient City : " + package1.recipientCity);
        System.out.println("Recipient State : " + package1.recipientState);
        System.out.println("Recipient Zip Code : " + package1.recipientZipCode);
        System.out.println("Weight : " + package1.weight);
        System.out.println("Cost Per Ounce : " + package1.costPerOunce);
        System.out.println("Flat Fee : " + package1.flatFee);

        System.out.println("----------------------------------");
        System.out.println("Sender Name : " + package2.senderName);
        System.out.println("Sender Address : " + package2.senderAddress);
        System.out.println("Sender City : " + package2.senderCity);
        System.out.println("Sender State : " + package2.senderState);
        System.out.println("Sender Zip Code : " + package2.senderZipCode);
        System.out.println("Recipient Name : " + package2.recipientName);
        System.out.println("Recipient Address : " + package2.recipientAddress);
        System.out.println("Recipient City : " + package2.recipientCity);
        System.out.println("Recipient State : " + package2.recipientState);
        System.out.println("Recipient Zip Code : " + package2.recipientZipCode);
        System.out.println("Weight : " + package2.weight);
        System.out.println("Cost Per Ounce : " + package2.costPerOunce);
        System.out.println("Additional Fee : " + package2.af);
        System.out.println("----------------------------------");

        System.out.println("Total package1 = " + package1.calculateCost());
        System.out.println("Total package2 = " + package2.calculateCost());
    }
}
