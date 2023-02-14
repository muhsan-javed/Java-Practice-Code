package com.muhsanjaved;

@FunctionalInterface
interface myFunctionInterface{
    void SSS();
//    void SSS2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM ");
    }
    @Deprecated
    public int sum(int a ,int v){
        return a + v;
    }
}
public class MT_108_Annotations_in_Java {
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(34,34);
    }
}
