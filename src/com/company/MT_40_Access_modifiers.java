package com.company;

class MyEmployee{
    private int id;
    private String name ;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id =i;
    }
    public int getId(){
        return id;
    }
}
public class MT_40_Access_modifiers {
    public static void main(String[] args) {

        MyEmployee muhsan = new MyEmployee(); 
        MyEmployee Ali = new MyEmployee();
       // muhasn.id =45;
       // muhsan.name = "Muhsan Tech "; --> Throws an error due to private access modifier

        muhsan.setName("Muhsan Tech");
        System.out.println("Name "+muhsan.getName());
        muhsan.setId(100255);
        System.out.println("Id "+muhsan.getId());

        Ali.setName("Ali hyder ");
        System.out.println("Name "+ Ali.getName());
        Ali.setId(500000);
        System.out.println("ID "+Ali.getId());

                                                                                                                                                                                                                          
    }


}
