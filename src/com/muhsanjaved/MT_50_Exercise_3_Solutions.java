package com.muhsanjaved;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputnumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(200);
    }

    void takeUserInput() {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputnumber == number) {
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts ", number, noOfGuesses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Too low....");
        } else if (inputnumber > number) {
            System.out.println("Too high....");
        }
        return false;
    }
}

public class MT_50_Exercise_3_Solutions {
    public static void main(String[] args) {

            /*
        Create a class Game, which allows a user to play "Guess the Number"
        game once. Game should have the following method:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!

        * */

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }

    }
}
