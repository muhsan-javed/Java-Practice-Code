package com.muhsanjaved;

import java.util.Scanner;

public class MT_81_Handling_Specific_Exceptions_in_Java {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = scanner.nextInt();

        System.out.println("Enter the number you want to divide the value with ");
        int number = scanner.nextInt();
        try {
            System.out.println("The value at array index entered is: "+ marks[ind]);
            System.out.println("The value at array value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception ");
            System.out.println(e);
        }




    }
}
