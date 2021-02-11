package com.company;

class MyMainEmployee{
    private int id;
    private int mySalary;
    private String name ;

    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
public MyMainEmployee(String myName, int myId,int Salary){
    id = myId;
    name = myName;
    mySalary = Salary;
}
    public MyMainEmployee(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id =i;
    }
    public int getId(){
        return id;
    }
    public void setMySalary(int n){
        this.mySalary= n;
    }
    public int getMySalary(){
        return mySalary;
    }
}
public class MT_42_Constructors {
    public static void main(String[] args) {

        MyMainEmployee ali = new MyMainEmployee("Ali",5050,10000);
        System.out.println("Name "+ali.getName());
        System.out.println("ID "+ali.getId());
        System.out.println("Salary "+ali.getMySalary());

        System.out.println("");

        MyMainEmployee Muhsan = new MyMainEmployee("Muhsan Javed",103,5000);
        System.out.println("Name "+Muhsan.getName());
        System.out.println("ID "+Muhsan.getId());
        System.out.println("Salary "+Muhsan.getMySalary());

    }
}
