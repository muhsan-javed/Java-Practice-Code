package com.company;


class C1{
    public int x = 5;
    protected int y = 55;
    int z = 65;
    private int a = 100;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class MT_66_Access_Modifiers_in_Java {
    public static void main(String[] args) {

        C1 s = new C1();
//        s.meth1();
        System.out.println(s.x);
        System.out.println(s.y);
        System.out.println(s.z);
//        System.out.println(s.a);
    }
}
