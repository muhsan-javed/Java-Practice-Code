package com.muhsanjaved;

public class MT_08_Operators {
    public static void main(String[] args) {
        /// Arithmetic Operators
        int a = 4;
//        int b = 6 % a; /// Modulo operator
        int b = 9;
        b += 3;
        System.out.println(b);

        //  Comparison operators
        System.out.println(6==b);
        System.out.println(64>b);
        System.out.println(64<b);

        /// Logical Operators
//        System.out.println(76>6 && 64>88);
        System.out.println(76>6 || 64>88);

//        // Bitwise Operators
        System.out.println(3&3);
        // 10
        // 11
        // ---
        // 10

    }
}
