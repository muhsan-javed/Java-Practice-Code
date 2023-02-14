package com.muhsanjaved;

class MyNewThr1 extends Thread{
    public void run(){
        int i  = 0;
        while (i<5666){
            System.out.println("Thank you: 1 ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thank you: 2 ");
        }
    }
}
public class MT_75_Java_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();

    }
}
