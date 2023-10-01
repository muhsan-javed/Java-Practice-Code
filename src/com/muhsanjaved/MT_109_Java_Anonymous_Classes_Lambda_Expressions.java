package com.muhsanjaved;

@FunctionalInterface
interface DemoAno {
    void meth1(int a);
    //   void meth2();
}

//class MuhsanFunc implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("i am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("i am meth2");
//    }
//}
public class MT_109_Java_Anonymous_Classes_Lambda_Expressions {
    public static void main(String[] args) {

//        DemoAno obj = new AnonyDemo();
//        obj.meth1();
        // Anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("Ima meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("Ima meth1");
//            }
//        };
//        obj.meth1();

        // Lambda Expressions

//        DemoAno obj = new MuhsanFunc();
//        obj.meth1();

        DemoAno obj = (a) -> {
            System.out.println("DemoAno obj = ()- >{};  This method 1 form this lambda" + a);
        };
        obj.meth1(6);


    }
}
