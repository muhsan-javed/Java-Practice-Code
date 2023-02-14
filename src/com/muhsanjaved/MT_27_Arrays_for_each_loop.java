package com.muhsanjaved;

public class MT_27_Arrays_for_each_loop {
    public static void main(String[] args) {
      /* // int[] marks={98,56,76,87,67,80};
        float[] marks={98.4f, 56.43f, 7.6f, 84.0f, 67.43f, 8.0f};
        String [] students = {"Ali","Javed","Muhsan", "Hyder", "Muskan", "Classes","Juniad" };
        System.out.println(marks.length);
        System.out.println(marks[2]);*/

       int [] marks= {98,56,76,87,67,80};
        System.out.println(marks.length);
        System.out.println("Printing used Naive way ");
//         Displaying the Array (Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        // Displaying the Array (for loop)
        System.out.println("Printing used for loop ");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Quick Displaying the Array in Reverse order (for loop)
        System.out.println("Printing used for loop in reverse order ");
        for (int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }


        // Quick Quiz: Displaying the Array  (for-each loop)
        System.out.println("Printing used for-each loop ");
        for (int element:marks){
            System.out.println(element);
        }



    }
}
