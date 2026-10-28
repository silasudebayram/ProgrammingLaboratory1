/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labweek6;

import java.util.ArrayList;

/**
 *
 * @author SILA SUDE
 */
public class LabWeek6 {

    public static void main(String[] args) {
        ArrayList<Ride> list = new ArrayList<>();

        EconomyRide obj1 = new EconomyRide(5, "Ahmet", "Kizilay", "Esenyurt", 25, 15, 8);
        PremiumRide obj2 = new PremiumRide(10, 2, "Ayse", "Kizilay", "Esenyurt", 25, 15, 8);
        SharedRide obj3 = new SharedRide(3, 21, "Mehmet", "Kizilay", "Esenyurt", 25, 15, 9);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        for (Ride r : list) {
            System.out.println(r);
            System.out.println(r.calculateFare());
        }

        System.out.println("Passenger Count : " + list.size());    }
}
