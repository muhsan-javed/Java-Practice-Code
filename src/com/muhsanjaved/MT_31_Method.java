package com.muhsanjaved;

public class MT_31_Method {

    static int logic(int a, int b){
        int c;
        if (a>b){
            c=a+b;
        }
        else {
            c=(a+b)*5;
        }
        return c;
    }
    public static void main(String[] args) {
       int a =5;
       int b=7;
       int c;
       c = logic(a,b);
       // Method invocation using object creation
        //method_31 obj = new method_31();
        //c = obj.logic(a,b);
        

       int a1 = 2;
       int b1 = 1;
       int c1;
       c1= logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
