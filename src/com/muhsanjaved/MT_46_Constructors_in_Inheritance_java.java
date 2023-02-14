package com.muhsanjaved;

class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded Constructor with value of X as: " + x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor ");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded Constructor of Derived with value of Y as: " + y);
    }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x,int y, int z){
        super(x, y);
        System.out.println("I am an overloaded Constructor of Derived with value of Z as: " + z);
    }
}
public class MT_46_Constructors_in_Inheritance_java {
    public static void main(String[] args) {
        //  Base1 b1 = new Base1();
        //  Derived1 d1 = new Derived1(4,9);

//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(100,200,300);


    }
}
