package com.muhsanjaved;
import java.util.Scanner;
public class MT_19_Practice_Set_CH4 {
    public static void main(String[] args) {
       //Question 1
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("Iam not 11");
//        }
        // Question 2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Overall percentage is: " + avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted!");
//        }
//        else {
//            System.out.println("sorry, You have not been promoted! Please try agin");
//        }


        // Question 3
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annun");
//        float tax = 0;
//        float income = sc.nextFloat();
//
//        if (income<=2.5){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income <= 5f){
//            tax =tax + 0.05f * (income - 2.5f);
//        }
//        else if (income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if (income>10.0f){
//            tax =tax + 0.05f * (5.0f - 2.5f);
//            tax=tax + 0.2f * (10.0f -5f);
//            tax=tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: "+ tax);
//
            // Question 4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Firday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        // Question 5

        // Question 6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }
        else if (website.endsWith(".pk")){
            System.out.println("This is an Pakistan website");
        }



    }

}
