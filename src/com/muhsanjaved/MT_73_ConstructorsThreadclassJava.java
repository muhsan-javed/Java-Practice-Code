package com.muhsanjaved;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a thread ");
//        }
    }
}
public class MT_73_ConstructorsThreadclassJava {
    public static void main(String[] args) {

        MyThr t = new MyThr("Muhsan Javed");
        MyThr t1 = new MyThr("Ali hyder");
        t.start();
        t1.start();
        System.out.println("The id of the tread t is  "+ t.getId());
        System.out.println("The name of the tread t is  "+ t.getName());

        System.out.println("The id of the tread t is  "+ t1.getId());
        System.out.println("The name of the tread t is  "+ t1.getName());
    }
}
