package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class MT_58_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        MySampleClass ms = new MySampleClass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}

