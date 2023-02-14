package com.muhsanjaved;


interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake ");
    }
    public  void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po po ");
    }

}
public class MT_55_Abstract_Classes_Vs_Interfaces {
    public static void main(String[] args) {

        AvonCycle cycleMuhsan = new AvonCycle();
        cycleMuhsan.applyBrake(1);
        // You can create properties in Interface
        System.out.println(cycleMuhsan.a);

        // You cannot modify the properties in Interface as they are final
//        cycleMuhsan.a = 456;  //Error
//        System.out.println(cycleMuhsan.a);

        cycleMuhsan.blowHornmhn();
        cycleMuhsan.blowHornk3g();
    }
}
