package com.muhsanjaved;

public class MT_28_Array_Multidimension {
    public static void main(String[] args) {

        int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int[2][3];
        flats[0][0] = 2004;
        flats[0][1] = 2005;
        flats[0][2] = 2006;

        flats[1][0] = 2007;
        flats[1][1] = 2008;
        flats[1][2] = 2008;




//        System.out.println(flats[0][2]);

        // Displaying the Array (for loop)
        System.out.println("Printing a 2-D array used for loop ");

        for (int i=0; i<flats.length; i++){

            for (int j=0; j<flats[i].length; j++){

                System.out.print(flats[i][j]);
                System.out.print(" ");
            }

            System.out.println(" ");
        }

        System.out.println("Hi");

    }
}
