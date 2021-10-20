package com.company;
import java.util.Scanner;

public class MT_02_Basic_Structure_Understanding {
    public static void main(String[] args) {

      /*  add two number
                AddTwoNumber ---> pascal naming convention
                addTwoNumber --->  camel case naming convention
        */
        System.out.println("Add Two Numbers");

        System.out.println("Enter the first Numbers");
        Scanner firstInput = new Scanner(System.in);
        int first = firstInput.nextInt();

        System.out.println("Enter the second Numbers");
        Scanner secondInput = new Scanner(System.in);
        int second= secondInput.nextInt();

        int result = first + second;

        System.out.println("Your Sum is: "+result);

        System.out.printf("Hello world");

    }
}
