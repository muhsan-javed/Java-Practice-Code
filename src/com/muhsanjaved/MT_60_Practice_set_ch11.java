package com.muhsanjaved;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void ChangeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping ");
    }
}
public class MT_60_Practice_set_ch11 {
    public static void main(String[] args) {
        //Problem 1 _ 2
    FountainPen pen = new FountainPen();
    pen.ChangeNib();
    pen.write();

        // Problem 3
    Human muhsan = new Human();
    muhsan.sleep();

        // Problem 3
        Monkey m1 = new Human();
//        m1.speak(); --> Not Cannot speak method because the reference is monkey which does not have speak method
        BasicAnimal muh = new Human();
        muh.eat();
        muh.sleep();
//         muh.speak();

    }
}
