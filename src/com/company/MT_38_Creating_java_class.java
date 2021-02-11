package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetail(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class MT_38_Creating_java_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee muhsan = new Employee();// Instantiating a new Employee object
        Employee ali = new Employee();// Instantiating a new Employee object
        // Setting properties / Attributes for muhsan
        muhsan.id =1036;
        muhsan.salary = 20000;
        muhsan.name ="Muhsan Javed ";

        // Setting properties / Attributes for Ali
        ali.id =500;
        ali.salary = 10000;
        ali.name = "Ali baloch";
        // printing the attributes
//        System.out.println(muhsan.id);
//        System.out.println(muhsan.name);

        muhsan.printDetail();
        int salary = muhsan.getSalary();
        System.out.println("Muhsan Salary "+salary);

        System.out.println("");
        ali.printDetail();
        int Salary= ali.getSalary();
        System.out.println("Salary " + Salary);

    }
}
