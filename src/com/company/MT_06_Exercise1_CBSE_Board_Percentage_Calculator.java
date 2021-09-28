package com.company;

import java.util.Scanner;

public class MT_06_Exercise1_CBSE_Board_Percentage_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your subjects marks");

        System.out.println("Enter your physics marks");
        float physics  = scanner.nextFloat();
        System.out.println("Enter your English marks");
        float English  = scanner.nextFloat();
        System.out.println("Enter your chemistry marks");
        float chemistry  = scanner.nextFloat();
        System.out.println("Enter your mathematics marks");
        float mathematics  = scanner.nextFloat();
        System.out.println("Enter your computer marks");
        float computer  = scanner.nextFloat();

        float percentage = ((physics + English + chemistry + computer + mathematics)/500.0f)*100;


        System.out.println("percentage : ");
        System.out.println(percentage);


       /* //	public class Percentage{
        // Storing total mark of cbse board in int i.e 100 * 5 = 500
        int totalMarks = 500;

        // Making object of Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Taking student marks in double because marks can be in point also for calculating percentage
        System.out.println("Enter your marks of  ");
        double firstSubject = sc.nextDouble();

        System.out.println("Enter your marks of subject 2");
        double secondSubject = sc.nextDouble();

        System.out.println("Enter your marks of subject 3");
        double thirdSubject = sc.nextDouble();

        System.out.println("Enter your marks of subject 4");
        double fourthSubject = sc.nextDouble();

        System.out.println("Enter your marks of subject 5");
        double fifthSubject = sc.nextDouble();

        // Creating logic that if user give input less than 0 aur more than zero than don't perform any tasks

        if(firstSubject < 0 || firstSubject > 100 ||
                secondSubject < 0 || secondSubject > 100 ||
                thirdSubject < 0 || thirdSubject > 100 ||
                fourthSubject < 0 || fourthSubject > 100 ||
                fifthSubject < 0 || fifthSubject > 100)
        {
            System.out.println("Please enter valid marks");
        }
        else{
            // Storing total marks of all subject in double i.e allMarks
            double allMarks = firstSubject+secondSubject+thirdSubject+
                    fourthSubject+firstSubject;

            // calculating percentage and Storing it in double variable i.e percentage
            double percentage = allMarks/totalMarks*100;

            // printing actual percentage after calculating
            System.out.println("Your total marks is: "+percentage+"%");
        }*/


    }
}
