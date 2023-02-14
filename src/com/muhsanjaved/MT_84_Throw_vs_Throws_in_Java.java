package com.muhsanjaved;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class MT_84_Throw_vs_Throws_in_Java {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw  new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        // Mode By Muhsan
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Ali - Uses divide function created by muhisn
       try {
           int c = divide(6,0);
           System.out.println(c);
       }
       catch (Exception e){
           System.out.println("Exception");
       }
       try {
           double ar = area(6);
       }
       catch (Exception e){
           System.out.println("Exception ");
       }


        System.out.println("Thank you Finish");

    }
}
