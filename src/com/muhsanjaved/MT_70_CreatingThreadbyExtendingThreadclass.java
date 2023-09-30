package com.muhsanjaved;

//void sum(int a, int b)
//sum(5,7); arguments are actual

class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("My Thread is Running");
            System.out.println("I am happy!");
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("My Thread 2 for chatting with her");
            System.out.println("I am say!");
            i++;
        }
    }
}

public class MT_70_CreatingThreadbyExtendingThreadclass {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();


    }
}
