package JavaTutorialLearnJavain2HoursForBeginners_appa_collage;

import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args) {
        // MINI PROJECT

        Scanner scanner = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;

        do {
            System.out.println("Guess my number : ");
            userNumber = scanner.nextInt();

            if (userNumber == myNumber){
                System.out.println("!!!!!   WOOHOO ... CORRECT NUMBER  !!!!!!");
            }
            else if (userNumber > myNumber){
                System.out.println("Your number is to large ");
            }
            else {
                System.out.println("Your number is too small");
            }
        }while (userNumber >= 0);

        System.out.println("My Number was : ");
        System.out.print(myNumber);
    }
}
