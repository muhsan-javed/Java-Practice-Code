package com.company;
import java.util.Scanner;
public class MT_18_Switch {
    public static void main(String[] args) {
//        int age;
//        System.out.println("Enter Your Age");
//        Scanner sc =new Scanner(System.in);
//        age = sc.nextInt();

        String var = "Ali";

        switch (var) {
            case "Muhsan" -> {
                System.out.println("You are going to come an Adult!");
                System.out.println("You are going to come an Adult!");
                System.out.println("You are going to come an Adult!");
            }
            case "Javed" -> System.out.println("You are going to join a job!");
            case "Ali" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java course!");




        /*if (age > 56){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are semi-experienced");
        }
        else if (age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else {
            System.out.println("you are not experienced");
        }
        */


    }
}
