package com.company;

public class MT_32_Method_Overloading {
    static void tellJoke(){
        System.out.println("I invented a new word!\n"+ "Plagiarism!");
    }

    static void change(int a){
        a = 95;
    }
    static void change1(int [] arr){
        arr[0] = 95;
    }

    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){
        System.out.println("Good morning "+ a +" pro");
    }
    static void foo(int a, int b){
        System.out.println("Good morning "+ a + " pro" );
        System.out.println("Good morning "+ b + " pro" );
    }
    public static void main(String[] args) {

        //tellJoke();
       // int [] marks={54,67,98,35,90,95};
        //Case 1: Changing the Integer
//        int x = 55;
//        change(x);
//        System.out.println("The value of x after running change is: "+ x);


       // Case 1: Changing the Integer
        int [] marks={54,67,98,35,90,95};
        change1(marks);
        System.out.println("The value of x after running change is: "+ marks[0]);

        //Method Overloading
        foo();
        foo(300);
        foo(300,400);
    //  Arguments are actual!

    }
}
