package com.muhsanjaved;

class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone..... ");
    }
//    public void music(){ 
//        System.out.println("Playing music....");
//    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music....");
    }

    public void on() {
        System.out.println("Turning on SmartPhone..... ");
    }

}

public class MT_49_Dynamic_Method_Dispatch_in_Java {
    public static void main(String[] args) {

        //Phone obj = new Phone(); // Allowed
        //SmartPhone smobj = new SmartPhone();  // Allowed
        //obj.name();

        Phone obj = new SmartPhone(); // Yes it is Allowed
        // SmartPhone obj2 = new Phone(); // Not Allowed Error

        obj.showTime();
        obj.on();
//        obj.music();
//        obj.music(); // not Allowed
    }
}
