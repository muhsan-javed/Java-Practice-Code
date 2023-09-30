package com.muhsanjaved;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 40;
        while (true) {
            System.out.println("Thank you " + this.getName());
        }
    }

}

public class MT_74_Java_Thread_Priorities {
    public static void main(String[] args) {

        MyThr1 t1 = new MyThr1("Muhsan 1");
        MyThr1 t2 = new MyThr1("Muhsan 2");
        MyThr1 t3 = new MyThr1("Muhsan 3");
        MyThr1 t4 = new MyThr1("Muhsan 4");
        MyThr1 t5 = new MyThr1("Muhsan 5 ( most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
