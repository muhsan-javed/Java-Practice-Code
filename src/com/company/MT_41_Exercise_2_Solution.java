package com.company;
import java.util.Random;
import java.util.Scanner;

public class MT_41_Exercise_2_Solution {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 &&
                computerInput == 0 || userInput == 2 && computerInput == 1 ){
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer win!");
        }
      //  System.out.println("Computer choice: "+ computerInput);

        if (computerInput == 0){
            System.out.println("Computer choice: Rock");
            System.out.println("Computer Number = 0 ");
        }
        else if (computerInput == 1){
            System.out.println("Computer choice: Paper");
            System.out.println("Computer Number = 1 ");
        }
        else if (computerInput == 2){
            System.out.println("Computer choice: Scissor");
            System.out.println("Computer Number = 2 ");

        }

    }
}
