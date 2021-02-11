package com.company;

interface MyCamera{
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
interface MyWife{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements MyWife, MyCamera{

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
}
public class MT_57_Default_Methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        //ms.greet(); ---> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }


    }
}
