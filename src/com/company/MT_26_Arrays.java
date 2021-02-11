package com.company;

public class MT_26_Arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students  - you have to store marks of these 500 students
        you have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5]; ----> Declaration + Memory Allocation

        // 2.
//        int [] marks;  //----> Declaration
//        marks = new int[5]; //----> Memory Allocation
        // Initialization
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
        //  marks[5] = 96; --> throws an error
        //  System.out.println(marks[5]);
//        System.out.println(marks[2]);

        // 3.  Declaration, memory allocation and initialization together
        int[] marks={98,56,76,87,67,74};
        for (int i=0; i<6; i++){
            System.out.println(marks[i]);
        }


    }
}
