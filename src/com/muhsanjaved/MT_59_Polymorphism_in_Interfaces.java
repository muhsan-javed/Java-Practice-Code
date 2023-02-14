package com.muhsanjaved;

interface MyCamera2{
    void tateSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWife2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWife2, MyCamera2{

    public void tateSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video....");
    }
    //    public void record4kVideo(){
//        System.out.println("Taking snap and Recording 4k video......");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Muhsan","Junaid","Uzair","Ali Hyder"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("Meth ");
    }
}


public class MT_59_Polymorphism_in_Interfaces {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2(); //  this is a smartphone but, use it as a camera
//        cam1.getNetwork(); // --> Not Allow
//        cam1.sampleMeth(); --- > Not Allow
        cam1.record4kVideo();

        MySmartPhone2 sp = new MySmartPhone2();
        sp.connectToNetwork("PTCl");
        sp.getNetworks();
        sp.recordVideo();
        sp.sampleMeth();
        sp.callNumber(345);



    }
}
