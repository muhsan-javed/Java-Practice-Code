package JavaTutorialLearnJavain2HoursForBeginners_appa_collage;

public class Main<vo> {
    public static void main(String[] args) {
    // our first program
//        System.out.println("Hello world");
//        System.out.println("Hello Java \n");

        // variables
//        String name = "Muhsan";
//        int age = 18;
//        System.out.println("Name :" + name);
//        System.out.println("Age  :" + age);

        // variable typers
        // 1 Primitive
        // 2 Non-Primitive / Reference

        // 1 Primitive
        // byte - 1 [-128 to 127]
        // short  -2
        // int - 4
        //log - 8
        // float - 4
        // double -8
        // char - 2
        // boolean - 1 true /false

        //

        byte age1  = 30;
        int phone1 = 1234567890;
        long phone2 = 315485424564L;
        float pi = 3.41f;
        char letter = 'A';
//        boolean isAdult = false;

        // 2 Non-primitive types
        String friend = "Sahid";
//        String name = new String("Muhsan");
//        System.out.println(name.length());
        String friend1 = "Uzair";
        String friend2 = "Majid";
        String friend3 = "Ali hyder";
//        System.out.println(friend3.charAt(1));
//        String f = friend2.replace('M','S'); // not used
//        System.out.println(friend2.replace('M','S'));

        // Substring
//        String fulName = "Muhsan Javed Brohi";
//        System.out.println(fulName.substring(5,9));

        // Arrays
        int math = 30;
        int physics = 98;
        int chem = 93;
        int eng = 88;

        int[] marks = new int [4];
        marks[0] = 93;
        marks[1] = 91;
        marks[2] = 88;
        marks[3] = 95;

//        System.out.println(marks[2]);
//        System.out.println(marks.length);

        // Sort
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

        int [] paperMarks = {45,98,74};

        int [][] finalMarks = {{92,63,78},{56,89,78},
                                {65,99,77},{44,88,22}};

//        System.out.println(finalMarks[1][2]);

        // Casting
        double Price  = 100.00;
        double finalP = Price + 15;

//        System.out.println(finalP);

        // Explicit Casting
        int price = 100;
        int finalPrice = price + (int) 20.90;
//        System.out.println(finalPrice);

        // Constants
//        int ages  = 20;
//        age = 21;
//        age = 22;
        final float PI = 3.14F;
//        PI = 1.3F; Error

        //  Operators
        //  operand,    operator,   operand    = Result
        //  6           +           4          = 10
        /*
        Types of operators in java
        --->  1 : Arithmetic operators
        --->  2 : Assignment operators
        --->  3 : Logical Operators
        --->  4 : Comparison Operators
        */

//        double  a = 5;
//        double  b = 3;
//        double  modulo = a % b;
//        System.out.println(modulo);

        int numb = 1;
//        System.out.println(numb++); // 1
//        System.out.println(++numb); // 2
//        System.out.println(numb);   // 2
//        System.out.println(numb--); // 2
//        System.out.println(numb);   // 1

        // Maths
        // 5, 6
//        System.out.println(Math.min(5,6));
//        random
//        System.out.println((int)(Math.random()*100));


        // Input in Java How to take Input?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input Your Age : ");
//        System.out.println("Input Your Name : ");
//        int ag = scanner.nextInt();
//        System.out.println("Your Age is : "+ ag);
//        String name = scanner.nextLine();
//        System.out.println(name);

        // Comparison Operators
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

       /* boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("night");

        int age = 3;
        if (age > 18)
            System.out.println("can vote");
        else
            System.out.println("can't vote");*/

        // Logical Operators
        // &&
        //
//        int a = 60, b = 40;
//        if (a < 50 && b < 50)
//            System.out.println("both less than 50");

        //  ||
//        if (a < 50 || b <50 )
//            System.out.println("at least one less than 50");

        //  !
//        boolean isAdult = false;
//        if (!isAdult)
//            System.out.println("is adult");
//        else
//            System.out.println("not adult");


        // Conditional statements
       /* Scanner sc = new Scanner(System.in);
        // pen  = 10 ; notebook = 40

        int cash = sc.nextInt();
        if (cash < 10){
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }else if (cash > 10 && cash <40 ){
            System.out.println("can get 1 thing");
        }else {
            System.out.println("can get both");
        }*/

        // Conditional statements SWITCH
        int day = 2; // 1 - monday; 2 tuesday

        switch (day){
            case 1:
//                System.out.println("Sunday");
                break;
            case 2:
//                System.out.println("Monday");
                break;
            case 3:
//                System.out.println("Tuesday");
        }

        // LOOPS
        // 1 - 100 print numbers

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5"); ///// Problem
        // 1 - 99
//        for (int i = 0; i<100; i++){
//            System.out.println("Hello " + i);
//        }
        // 100 - 1
//        for (int i = 100; i >= 1; i--){
//            System.out.println(i);
//        }

        // While Loop
//        int j = 100;
//        while (j >= 1){
//            System.out.println(j);
//            j--;
//        }

        // Do While
//        int k = 100;
//        do {
//            System.out.println(k);
//            k = k -1;
//        }while (k >= 1);

      /*  // Exe
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("input a number");
            number = scanner.nextInt();
            System.out.println("here is your number : ");
            System.out.println(number);
        }while (number >= 10);

        System.out.println("The EnD");*/


       /* // BREAK &&&& CONTINUE
        int i  = 0;
        while (true){
            if ( i== 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i > 6 ){
                break;
            }
        }*/


       /* // TRY - CATCH in Exception Handling
        int[] SubMarks = {89,65,99};
        try {
            System.out.println(SubMarks[6]);
        }catch (Exception exception){
            // do something after catching
            System.out.println(exception);
        }

        System.out.println("The name is Ali");*/

        // METHODS
//        System.out.println("Hello Programmer");
//        System.out.println("Hello Programmer");
//        System.out.println("Hello Programmer");
//        System.out.println("Hello Programmer");
        printJava(); // Calling
        printName("Muhsan");
        printSum(88,12);


    }
    public static void printJava(){
        System.out.println("Hello Programmer");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}