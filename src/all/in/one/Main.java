package all.in.one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Programmer");

        // Variables
        // ==>> variable are containers which store data values string int, float , char, boolean
        // How to declare variable:
        // Syntax - <dataType> <variableName> = <value>;

//        String name = "Ali";
//        System.out.println(name);
//        boolean isAdult = false;
//        int a = 999999, w = 4543, q = 22345;
//        float b = 34.545f;
//        System.out.println(a+"\n"+b+"\n"+isAdult);


        // Rules for constructing name of variables in java
        // ---> 1: Can contain digits, underscores, dollar, signs, letters
        // ---> 2: Should begin with a letter, $ or _
        // ---> 3: Java is case-sensitive language which means that muhsan and Muhsan are two different variable altogether.
        // ---> 4: should not contain whitespaces
        // ---> 5: You cannot use reserved keywords from java

//        byte u = 127;
//        double d = 34.54543535345d;
//        har grade = 'A';
//        System.out.println(u);
//        System.out.println(d);
//        System.out.println(grade);

        // Operators in Java
        // operand, operator, operand    = Result
        // 6        +           4       = 10
        /*
        Types of operators in java
        --->  1 : Arithmetic operators
        --->  2 : Assignment operators
        --->  3 : Logical Operators
        --->  4 : Comparison Operators
        */

//        int num1 = 45, num2 = 78;
//        num1 += 5;
//        // Explore these operators - *=, /=, %=
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//
//        System.out.println(num1++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);
//
//        System.out.println("\n\n\n\n\n\n");
        /*
         *  Comparison Operators:
         *  1.  == : checks for equality of two values
         *  2.  != : checks if two values are not equal
         *  3.  <
         *  4.  >
         *  5.  <=
         *  6.  =>

         * Logical Operators:
         * 1. && - Logical and Operator - returns ture only if both conditions are true
         * 2. || - Logical or Operator - returns true if anyone conditions true
         * 3. ! - Logical not - Reverse the result form true to  false and vice versa


         	// Increment and Decrement Operators

		//int i = 56;
		// int b = i++; first b is assigned i (56) then i is incremented.
		//int j = 67;
		//int c = ++j; // first j is incremented j then c is assigned(68).
		//System.out.println(i++);
	//	System.out.println(i);
		//System.out.println(++i);
		//System.out.println(i);


		*/

     /*  // Precedence & Associativity
//		int a = 6*5-34/2;

		// highest Precedence goes to * and /. They are then evaluated on the basic of left to right associativity.
			=30-34/2
			=30-17
			=13


//		int b = 60/5-34*2;
			=12-34/2
			=12-68
			=-56

//		System.out.println(a);
//		System.out.println(b);

//		QuickQuiz
        int x = 6;
        int y = 1;
//		int k = x*y/2;

        int b = 1 ;
        int c = 4;
        int a = 5;
        int k = (b*b - 4*a*c)/(2*a);

        System.out.println(k);*/


        // Strings
//        String myName = "Muhsan";
//        String channel = "Muhsan Tech";
//        System.out.println(myName);
//        System.out.println("Length " + myName.length());
//        System.out.println("toUpperCase " + myName.toUpperCase());
//        System.out.println("toLowerCase " + myName.toLowerCase());
//        System.out.println(myName + "  from\" " + channel);
//        System.out.println(myName + "  from\\ " + channel);
//        System.out.println(myName + "  from\t " + channel);
//        System.out.println(myName + "  from\n " + channel);
//
//        System.out.println(myName.contains("san"));
//        System.out.println(myName.charAt(3));
//        System.out.println(myName.endsWith("an"));
//        System.out.println(myName.indexOf("n"));
//        System.out.println(myName.indexOf("aasn"));


//        int fNumber = 4, sNumber = 7;
//        System.out.println(Math.max(fNumber, sNumber));
//        System.out.println(Math.min(fNumber, sNumber));
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(6));
//        System.out.println(4 + (8 - 4) * Math.random());

        // Taking user input in java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age...........");
        // String age  = scanner.nextLine();
        int age = 19;//= scanner.nextInt();
        // System.out.println(age);


        // If-else Conditionals
        if (age > 20) {
            System.out.println("You are an adult");
        } else if (age <= 15) {
            System.out.println("Sorry");
        } else {
            System.out.println("You are not allow");
        }

        //        switch (age) {
        //            case 18 -> System.out.println("You are 23 years old ");
        //            case 15 -> System.out.println("You are 15 years old ");
        //            case 20 -> System.out.println("You are 20 years old ");
        //            case 22 -> System.out.println("You are 22 years old ");
        //            default -> System.out.println("You did not match any of the cases");
        //        }

//        switch (age) {
//            case 18:
//                System.out.println("You are 23 years old ");
//                break;
//            case 15:
//                System.out.println("You are 15 years old ");
//                break;
//            case 20:
//                System.out.println("You are 20 years old ");
//                break;
//            case 22:
//                System.out.println("You are 22 years old ");
//                break;
//            default:
//                System.out.println("You did not match any of the cases");
//        }

        // Quick Quiz: Print sunday based on numbers 1 to 7 typed by the user

        // Loops
        /*
         While loop
         while(condition){
            // This code will keep executing until the condition is true
         }
          */
//        int i = 0;
//        while (i < 100) {
//            System.out.println(i);
//            i++; // i += 1;
//        }

         /*
         Do While loop
         do(condition){
            // This code will keep executing until the condition is true
         }While(condition);
          */
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++; // i += 1;
//        } while (i > 100);

         /*
        For loop
        for (sr1;st2;st3){
            //code to be executed
         }
         */

//        for (int i=0;i<=10;i++){
//           if (i==2){
////            break;
//               continue;
//           }
//           else {
//               System.out.println(i);
//           }
//            System.out.println(i);
//        }

//        System.out.println("Out of looping");
//        System.out.println("\n\n\n\n\n\n");

        //  Java Arrays
        int[] marks = {12, 31, 465, 34, 13};
        marks[0] = 65; // this will update marks[0]
        System.out.println(marks[0]);

//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        System.out.println("This is for each loop: ");

        // For each loop
//        for (int value:marks){
//            System.out.println(value);
//        }

//        int [][] matrix = {{23,24,44,32},{34,21,86,21},
//                {34,67,83,74},{34,12,673,13}};
//        for (int i =0;i<matrix.length;i++){
//            for (int j=0;j<matrix.length;j++){
//                System.out.println(matrix[i][i]);
//
//            }
//        }

//        String [] cars = {"Muhsan","Ali","Hyder","Uzair","Shaib","Majid","Asad"}
//        for (String value: cars){
//            System.out.println(value);
//        }

        String[] names = {"Muhsan", "Ali", "Hyder", "Uzair", "Shaib", "Majid", "Asad"};

        // Try - Catch

        try {
            System.out.println(names[9]);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Message");
        // System.out.println(sum(4,6));
        // System.out.println(sums(4,6));

        float number_1, number_2;
        System.out.println("Enter first number");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number");
//        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " +
                "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);

        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid input");

        }


    }


//     private static int sum(int a, int b) {
//         return a+b;
//     }
//     static int sums(int a, int b) {
//         return a+b;
//
//     }
}
