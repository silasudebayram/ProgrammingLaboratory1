/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labweek4;

import java.util.Scanner;

public class LabWeek4 {

    public static void main(String[] args) {
    Scanner kyb = new Scanner(System.in);

        System.out.println("How many courses? At least 3:");
        int courseNumber = kyb.nextInt();
        kyb.nextLine();

        while (courseNumber < 3) {
            System.out.println("Enter at least 3 courses:");
            courseNumber = kyb.nextInt();
            kyb.nextLine();
        }

        Course[] courses = new Course[courseNumber];

        for (int i = 0; i < courseNumber; i++) {

            System.out.println("Course Name:");
            String courseName = kyb.nextLine();

            System.out.println("Capacity:");
            int cp = kyb.nextInt();
            kyb.nextLine();

            courses[i] = new Course(courseName, cp);
        }

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n1 - Register a student");
            System.out.println("2 - Display all courses");
            System.out.println("3 - Exit");
            System.out.println("Enter your choice:");

            choice = kyb.nextInt();
            kyb.nextLine();

            if (choice == 1) {

                System.out.println("Student ID:");
                String studentID = kyb.nextLine();

                System.out.println("Student Name:");
                String name = kyb.nextLine();

                System.out.println("Course Name:");
                String requestedCourse = kyb.nextLine();

                Course foundCourse = null;

                for (int i = 0; i < courses.length; i++) {

                    if (courses[i].courseName.equals(requestedCourse)) {
                        foundCourse = courses[i];
                        break;
                    }
                }

                if (foundCourse == null) {

                    System.out.println("Course not found!");

                } else {

                    boolean duplicate = false;

                    for (int i = 0; i < foundCourse.count; i++) {

                        if (foundCourse.enrolledStudents[i]
                                .studentID.equals(studentID)) {

                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {

                        System.out.println(
                                "Student is already registered!"
                        );

                    } else if (
                            foundCourse.count >= foundCourse.capacity) {

                        System.out.println("Course is full!");

                    } else {

                        Student student =
                                new Student(studentID, name);

                        foundCourse.enrolledStudents[
                                foundCourse.count] = student;

                        foundCourse.count++;

                        System.out.println(
                                "Registration successful!"
                        );
                    }
                }
            }


            else if (choice == 2) {

                for (int i = 0; i < courses.length; i++) {

                    courses[i].display();
                    System.out.println("----------------");
                }
            }

            else if (choice == 3) {

                System.out.println("Program ended.");

            }

            else {

                System.out.println("Invalid choice!");
            }
        }

        kyb.close();
    }    }

