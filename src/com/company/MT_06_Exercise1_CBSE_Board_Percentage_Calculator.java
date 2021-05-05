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

    }
}
