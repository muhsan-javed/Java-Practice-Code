package com.muhsanjaved;

import java.util.Scanner;

public class MT_05_Getting_User_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter first Number");
//        int first = scanner.nextInt();
//        System.out.println("Enter second Number");
//        int second = scanner.nextInt();
//        int sum = first+second;
//        System.out.println("Sum is: "+sum);

//        boolean b1 = scanner.hasNextInt();
//        System.out.println(b1);

        String str = scanner.next();
        System.out.println(str);

    }
}
