package com.muhsanjaved;

import java.util.Scanner;

public class MT_07_Practice_Set_CH1 {
    public static void main(String[] args) {

        // Problem 1
//        int num1  = 3;
//        int num3  = 3;
//        int num2  = 3;
//        int sum = num1 + num3 + num2;
//        System.out.printf("Your Sum is: "+ sum);

        // Problem 2
//        float sub1 = 45;
//        float sub2 = 95;
//        float sub3 = 48;
//        float cga = (sub1+ sub2 + sub3)/30;
//        System.out.println(cga);

        // Problem 3
//        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("Hello " + name +" have a good day @!");

        // Problem 4

//        float kilometer = scanner.nextFloat();
//        float miles = 0.621371f;
//        float sum = kilometer + miles;
//        System.out.println(sum);

        // Declaring the variables
        double kiloMeters,miles;
        // 1 mile = 1.609344 kilometers => 1 kilometer = 1/1.609344 miles.
        double conversionFactor = 1.609344;

        // Getting user input using Scanner class
        System.out.println("Enter distance value in Kilometers : ");
        Scanner input = new Scanner(System.in);
        kiloMeters = input.nextDouble();

        // To convert kilometers to miles, dividing the kilometers by 1.609344
        miles = kiloMeters / conversionFactor;

        //printing the output
        System.out.println("The distance in Miles : " + miles);



        // Problem 5
//        System.out.println("Enter your number");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.hasNextInt());

    }
}
