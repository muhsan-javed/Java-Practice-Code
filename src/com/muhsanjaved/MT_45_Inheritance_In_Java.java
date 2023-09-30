package com.muhsanjaved;

class Base {
    int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting X now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a Constructor");
    }
}

class Derives extends Base {
    int Y;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}

public class MT_45_Inheritance_In_Java {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        // Creating an object of derived class
        Derives d = new Derives();
        d.setX(45);
        System.out.println(d.getX());
        d.setY(50);
        System.out.println(d.getY());

    }
}
