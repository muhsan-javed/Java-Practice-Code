package com.company;

public class MT_29_Parctice_set_Array {
    public static void main(String[] args) {

        // Practice Problem 1
        /*float [] mark= {45.6f, 34.5f, 54.76f, 78.9f, 90.88f};
        float sum =0;
        for (float element:mark){
            sum = sum+element;
        }

        System.out.println("The value of sum is: "+sum);

        // Practice Problem 2
        float [] marks= {45.6f, 34.5f, 54.76f, 78.9f, 90.88f};
        float num =45.6f;
        boolean isInArray = false;
        for(float element:marks){
                if(num==element){
                    isInArray = true;
                    break;
                }
        }
        if(isInArray){
                System.out.println("The value is present in the array");
            }
        else {
                System.out.println("The value is not present in the array");
            }

        // Practice Problem 3

        float [] markss = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sumn = 0;
        for(float element:markss){
            sumn = sumn + element;
        }
        System.out.println("The value of average marks is " + sumn/markss.length);*/



        // Practice Problem 4
        /*int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }*/

        // Practice Problem 5
       /* int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            temp = arr[i];        // Swap a[i] and a[l-1-i]
            arr[i] = arr[l-i-1]; // a   b   temp
            arr[l-i-1] = temp;  // |4| |3| ||

        }
        for(int element: arr){
            System.out.print(element + " ");
        }*/


        // Practice Problem 6
        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);*/

        // Practice Problem 7

        // Practice Problem 8
        boolean isSorted = true;
        int [] arr = {1, 2, 3, 4, 55, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }



    }
}
