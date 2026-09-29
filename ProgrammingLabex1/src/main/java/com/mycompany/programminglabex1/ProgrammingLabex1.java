/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programminglabex1;

import java.util.Scanner;

/**
 *
 * @author SILA SUDE
 */
public class ProgrammingLabex1 {

    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0;
        int winA = 0, drawA = 0, lossA = 0;
        int winB = 0, drawB = 0, lossB = 0;
        int winC = 0, drawC = 0, lossC = 0;
        int winD = 0, drawD = 0, lossD = 0;

        System.out.println("Match 1 : Team A vs Team B");
        System.out.println("Match 2 : Team A vs Team C");
        System.out.println("Match 3 : Team A vs Team D");
        System.out.println("Match 4 : Team B vs Team C");
        System.out.println("Match 5 : Team B vs Team D");
        System.out.println("Match 6 : Team C vs Team D");

        Scanner kyb = new Scanner(System.in);

        System.out.print("Match 1 - Team A goals: ");
        int score1 = kyb.nextInt();
        System.out.print("Match 1 - Team B goals: ");
        int score2 = kyb.nextInt();

        System.out.print("Match 2 - Team A goals: ");
        int score3 = kyb.nextInt();
        System.out.print("Match 2 - Team C goals: ");
        int score4 = kyb.nextInt();

        System.out.print("Match 3 - Team A goals: ");
        int score5 = kyb.nextInt();
        System.out.print("Match 3 - Team D goals: ");
        int score6 = kyb.nextInt();

        System.out.print("Match 4 - Team B goals: ");
        int score7 = kyb.nextInt();
        System.out.print("Match 4 - Team C goals: ");
        int score8 = kyb.nextInt();

        System.out.print("Match 5 - Team B goals: ");
        int score9 = kyb.nextInt();
        System.out.print("Match 5 - Team D goals: ");
        int score10 = kyb.nextInt();

        System.out.print("Match 6 - Team C goals: ");
        int score11 = kyb.nextInt();
        System.out.print("Match 6 - Team D goals: ");
        int score12 = kyb.nextInt();


        System.out.println("Match 1: Team A " + score1 + " - " + score2 + " Team B");
        System.out.println("Match 2: Team A " + score3 + " - " + score4 + " Team C");
        System.out.println("Match 3: Team A " + score5 + " - " + score6 + " Team D");
        System.out.println("Match 4: Team B " + score7 + " - " + score8 + " Team C");
        System.out.println("Match 5: Team B " + score9 + " - " + score10 + " Team D");
        System.out.println("Match 6: Team C " + score11 + " - " + score12 + " Team D");


        if (score1 > score2) {
            a += 3; winA++; lossB++;
        } else if (score1 == score2) {
            a += 1; b += 1; drawA++; drawB++;
        } else {
            b += 3; winB++; lossA++;
        }

        if (score3 > score4) {
            a += 3; winA++; lossC++;
        } else if (score3 == score4) {
            a += 1; c += 1; drawA++; drawC++;
        } else {
            c += 3; winC++; lossA++;
        }

        if (score5 > score6) {
            a += 3; winA++; lossD++;
        } else if (score5 == score6) {
            a += 1; d += 1; drawA++; drawD++;
        } else {
            d += 3; winD++; lossA++;
        }

        if (score7 > score8) {
            b += 3; winB++; lossC++;
        } else if (score7 == score8) {
            b += 1; c += 1; drawB++; drawC++;
        } else {
            c += 3; winC++; lossB++;
        }

        if (score9 > score10) {
            b += 3; winB++; lossD++;
        } else if (score9 == score10) {
            b += 1; d += 1; drawB++; drawD++;
        } else {
            d += 3; winD++; lossB++;
        }

        if (score11 > score12) {
            c += 3; winC++; lossD++;
        } else if (score11 == score12) {
            c += 1; d += 1; drawC++; drawD++;
        } else {
            d += 3; winD++; lossC++;
        }

        // 3. Goal Difference Calculation
        int goalA = score1 + score3 + score5;
        int goalB = score2 + score7 + score9;
        int goalC = score4 + score8 + score11;
        int goalD = score6 + score10 + score12;

        int againstA = score2 + score4 + score6;
        int againstB = score1 + score8 + score10;
        int againstC = score3 + score7 + score12;
        int againstD = score5 + score9 + score11;

        int gdA = goalA - againstA;
        int gdB = goalB - againstB;
        int gdC = goalC - againstC;
        int gdD = goalD - againstD;

        System.out.println("Team A:");
        System.out.println("  Matches played : 3");
        System.out.println("  Wins: " + winA + ", Draws: " + drawA + ", Losses: " + lossA);
        System.out.println("  Total points   : " + a);
        System.out.println("  Goal difference: " + gdA);

        System.out.println("\nTeam B:");
        System.out.println("  Matches played : 3");
        System.out.println("  Wins: " + winB + ", Draws: " + drawB + ", Losses: " + lossB);
        System.out.println("  Total points   : " + b);
        System.out.println("  Goal difference: " + gdB);

        System.out.println("\nTeam C:");
        System.out.println("  Matches played : 3");
        System.out.println("  Wins: " + winC + ", Draws: " + drawC + ", Losses: " + lossC);
        System.out.println("  Total points   : " + c);
        System.out.println("  Goal difference: " + gdC);

        System.out.println("\nTeam D:");
        System.out.println("  Matches played : 3");
        System.out.println("  Wins: " + winD + ", Draws: " + drawD + ", Losses: " + lossD);
        System.out.println("  Total points   : " + d);
        System.out.println("  Goal difference: " + gdD);

        String champion = "Team A";
        int maxPoints = a;
        int maxGD = gdA;

        if (b > maxPoints || (b == maxPoints && gdB > maxGD)) {
            champion = "Team B";
            maxPoints = b;
            maxGD = gdB;
        }

        if (c > maxPoints || (c == maxPoints && gdC > maxGD)) {
            champion = "Team C";
            maxPoints = c;
            maxGD = gdC;
        }

        if (d > maxPoints || (d == maxPoints && gdD > maxGD)) {
            champion = "Team D";
            maxPoints = d;
            maxGD = gdD;
        }
        System.out.println("Tournament Champion: " + champion);

    }
    }

