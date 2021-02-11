package com.company;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor "+ c);
    }
}
public class MT_47_this_and_super_keyword_java {
    public static void main(String[] args) {

        EkClass e = new EkClass(65);
        DoClass d = new DoClass(500);
        System.out.println(e.getA());

    }
}
