package all.in.one;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

//        int x; // declaring
//        int y = 10; // Initialize
//        int z = 10 ; //declaring and Initialize
//        System.out.println("Z = "+z);

//        double d = 200.54;
//        long L = (long) d;
        System.out.println();

//        int i = 200;
//        long l =i;
//        float f = l;

//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first Number");
//        String q = input.next();
//        int q = input.nextInt();
//        System.out.println("Enter second Number");
//        String w = input.next();
//        int w = input.nextInt();
//        System.out.println(q + " " + w);

//        System.out.println("Add "+ (q+w));
//        System.out.println("Sub "+ (q -w));
//        System.out.println("Mul "+ (q*w) );
//        System.out.println("Dic " +(q/w));
//        System.out.println("Remainder " +(q%w));

        int e = 10;
//        System.out.println(e++);
//        System.out.println(e);
//        System.out.println(e--);
//        System.out.println(e);

//        int x = 10, y = 20;
//        if (x<y && x>y){
//            System.out.println("X is Less than Y");
//        }
//        if (x>y){
//            System.out.println("X is Greater than Y");
//        }
//        if (x==y){
//            System.out.println("X is Equal than Y");
//        }

//        System.out.println("Enter value Number");
//        int option = input.nextInt();
//        int option = 8;
//        switch (option){
//            case 0:
//                System.out.println("Value is 0");
//                break;
//            case 1:
//                System.out.println("Value is 1");
//                break;
//            case 2:
//                System.out.println("Value is 2");
//                break;
//            case 3:
//                System.out.println("Value is 3");
//                break;
//            default:
//                System.out.println("Value is not found");
//        }


//        Loops
//        int i = 220;
//        while (i<100){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("out of loop");
//        int x = 220;
//        do {
//            System.out.println(x);
//            x++;
//        }while (x <= 100);
//
//        for (int i=0; i<100;i++){
//            System.out.println(i);
//        }
//
//        System.out.println("out of loop");

//        int [] myarray = {19,43,46,78,93,22};
//        int[] myarray2 =  new int[60];
//        myarray2[0] = 10;

//        int [] myarray3 = new int[]{1,3,46,7,8,4,3};

//        myarray2[0] = 10;
//        myarray2[1] = 20;
//        myarray2[2] = 30;
//        myarray2[3] = 40;
//        myarray2[4] = 50;
//        myarray2[5] = 60;
//        myarray2[6] = 70;


//        System.out.println(myarray2[0]=345);
//        myarray2[0] =900;
//        System.out.println(myarray2[0]);

//        for (int i =0;i<=myarray2.length;i++){
//            System.out.println(myarray2[i]);
//        }


//        int [][] myTwoArray = new int[2][4]; // Creating
//        int[][] myarray = {{10,20},{190,34},
//                            {13,46},{324,56},
//                            {111,555},{45,23}};
//
//        for (int row=0;row<=myarray.length;row++){
//            for (int col = 0;col<myarray.length;col++){
//                System.out.println(myarray[row][col]);
//            }
//            System.out.println(" ");
//        }

        Student student = new Student("Muhsan", "javed");

//        student.fname = "Muhsan";
//        student.lname = "Javed";
        student.Print();
//        Student student1 = new Student();
//        student1.fname = "Ali";
//        student1.lname = "Hyder";
//        student1.Print();
//        Student student2 = new Student();
//        student2.fname = "Tahmoor";
//        student2.lname = "Khan";
//        student2.Print();
        messsage();

        int[] myarray = {21, 15, 67, 27, 37, 92, 82, 24, 76, 42, 2, 84, 15, 89, 547, 35, 67, 23, 12, 98};
        // PrintArray(myarray);

        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            int RNumber = randomNumber.nextInt(40 - 10 + 1) + 10;
            //System.out.println(RNumber);
        }


        System.out.println(Math.max(23, 21));


        // Date and Time print
        int day, month, year;
        int second, minute, hour;

        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR_OF_DAY);

        System.out.println(day + " / " + month + " / " + year);
        System.out.println(second + " / " + minute + " / " + hour);
        // End Date and Time


    }

    static void messsage() {
        System.out.println("I ma a message");
    }

    static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
