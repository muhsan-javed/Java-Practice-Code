package all.in.one;

import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius ");
        int radius = scanner.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area is " + area);

        StringBuffer sb = new StringBuffer("Hello ");
//        sb.append("Java");    //now original string is changed
//        sb.insert(1,"Java");  //now original string is changed
//        sb.replace(1,3,"Java");
//        sb.delete(1,3);
//        sb.reverse();
//        System.out.println(sb);   //prints Hello Java
//        System.out.println(sb.capacity());    //default 16
//        sb.append("Hello");
//        System.out.println(sb.capacity());    //now 16
//        sb.append("java is my favourite language");
//        System.out.println(sb.capacity());    //now (16*2)+2=34 i.e (oldcapacity*2)+2

        System.out.println(sb.capacity());  //default 16
        sb.append("Hello");
        System.out.println(sb.capacity());      //now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());      //now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.ensureCapacity(10);    //now no change
        System.out.println(sb.capacity());      //now 34
        sb.ensureCapacity(50);      //now (34*2)+2
        System.out.println(sb.capacity());      //now 70
    }
}
