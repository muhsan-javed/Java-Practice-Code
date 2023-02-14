package com.muhsanjaved;

import java.util.Scanner;

public class MT_82_Nested_Try_Catch_in_Java {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner scanner = new Scanner(System.in);
        boolean flag  = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = scanner.nextInt();
            try {
                System.out.println("WelCome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exit");
                    System.out.println("Exception in leve 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in leve 1");
            }
        }

    }
}
