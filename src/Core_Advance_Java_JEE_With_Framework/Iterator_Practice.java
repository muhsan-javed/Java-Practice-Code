package Core_Advance_Java_JEE_With_Framework;

import java.util.ArrayList;
import java.util.Collection;

/*
interface Iterator { }

interface collection {
    public abstract Iterator iterator();
}

interface List extends Collection {
    public abstract Iterator iterator();
}

class ArrayList Implements List {
    class MyItr implements Iterator{

    }
}
*/

class Emp {
    String name, lastName;
    int age;

    Emp(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return "Name: "+name + " LastName : " + lastName + " Age: " + age;
    }
}
//UserDefineClass
public class Iterator_Practice {
    public static void main(String[] args) {

        ArrayList<Emp>  arrayList = new ArrayList<>();

        Emp emp1 = new Emp("Muhsan","Javed", 22);
        Emp emp2 = new Emp("Uzair","Ali", 30);
        Emp emp3 = new Emp("Sahib","Brohi", 16);
        Emp emp4 = new Emp("Hyder","Ali Brohi", 21);

        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);

        System.out.println(arrayList);

    }
}
