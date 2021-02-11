package com.company;

import java.util.Scanner;

public class MT_79_Syntax_Errors_Runtime_Errors_Logical_Errors_in_Java_Demo {
    public static void main(String[] args) {
        System.out.println("Error Demo Chapter 14 ");
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon
        // b= 6; // Error : b not declared!


        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR DEMO
        int k;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
