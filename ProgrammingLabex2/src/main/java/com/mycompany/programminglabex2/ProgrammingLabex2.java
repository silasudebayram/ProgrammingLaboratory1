/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programminglabex2;

import java.util.Scanner;

/**
 *
 * @author SILA SUDE
 */
public class ProgrammingLabex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stops on the route: ");
        int numStops = scanner.nextInt();

        System.out.print("Enter the bus's seating capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); 

        String[] stopNames = new String[numStops];
        int[] boarding = new int[numStops];
        int[] alighting = new int[numStops];
        int[] occupancy = new int[numStops];

        for (int i = 0; i < numStops; i++) {
            System.out.println("\n--- Stop " + (i + 1) + " Information ---");
            System.out.print("Stop name: ");
            stopNames[i] = scanner.nextLine();

            System.out.print("Passengers boarding: ");
            boarding[i] = scanner.nextInt();

            System.out.print("Passengers alighting: ");
            alighting[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        int currentOccupancy = 0;
        int overCapacityCount = 0;

        System.out.println("\n==============================================");
        System.out.println("PROCESSING STOPS & WARNINGS");
        System.out.println("==============================================");

        for (int i = 0; i < numStops; i++) {
            int tempOccupancy = currentOccupancy + boarding[i] - alighting[i];

            if (tempOccupancy < 0) {
                System.out.println("Data error at [" + stopNames[i] + "]: cannot have more passengers alighting than are currently on the bus. Occupancy set to 0.");
                currentOccupancy = 0;
            } else {
                currentOccupancy = tempOccupancy;
            }

            occupancy[i] = currentOccupancy;

            if (currentOccupancy > capacity) {
                System.out.println("Warning: Bus is over capacity at [" + stopNames[i] + "]!");
                overCapacityCount++;
            }
        }

        System.out.println("\n==============================================");
        System.out.println("ROUTE SUMMARY");
        System.out.println("==============================================");
        System.out.printf("%-20s %-10s %-10s %-15s\n", "Stop Name", "Boarding", "Alighting", "Current Occupancy");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < numStops; i++) {
            System.out.printf("%-20s %-10d %-10d %-15d\n", stopNames[i], boarding[i], alighting[i], occupancy[i]);
        }

        System.out.println("\n==============================================");
        System.out.println("STATISTICS");
        System.out.println("==============================================");

        int maxBoarding = -1;
        String busiestStop = "";
        int totalOccupancy = 0;

        for (int i = 0; i < numStops; i++) {
            if (boarding[i] > maxBoarding) {
                maxBoarding = boarding[i];
                busiestStop = stopNames[i];
            }
            totalOccupancy += occupancy[i];
        }

        double averageOccupancy = (double) totalOccupancy / numStops;

        System.out.println("Busiest stop (highest boarding): " + busiestStop + " (" + maxBoarding + " passengers)");
        System.out.printf("Average occupancy across all stops: %.2f passengers\n", averageOccupancy);
        System.out.println("Number of stops exceeding bus capacity: " + overCapacityCount);

        if (currentOccupancy != 0) {
            System.out.println("Warning: " + currentOccupancy + " passengers still on the bus after the final stop — please check your data.");
        } else {
            System.out.println("Route completed successfully. The bus is empty.");
        }

        scanner.close();
    }
}
    

