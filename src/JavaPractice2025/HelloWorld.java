package JavaPractice2025;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World Create By Muhsan Javed");

    // A Package in java is used to group related classes. Think of it as a folder in a file directory.
    // we use packages to avoid name conflicts, and to write a better maintainable code.
        // Packages are divided into two categories>
        // Built - in packages from the java Api)
        // User-defined Packages ( Create your own packages)
        // Syntax:
        //import package.name.class // import a single class
        //import package.name.* // import the whole class


        // Class
        // A class is an entity that determines how an object will behave and what the object will contain.
        // In other words, it os a blueprint or a set of instruction to build a specific type of object.
        // Contains variables (fields_) methods & Object...
        // Syntax:
        // class <Class_Name> {
        // Field;
        // method;
        // }

        // Data Type
        int a;
        a = 7;
        int b = 7;
        int c = a+b;
        System.out.println("The Sum is: "+c);

        // Methods ???
        // it is a collection  og statements that are grouped to gather to perform an operation.
        // It tasks some parameters, performs some computations and then optionally returns a value or object.
        // Syntax:
        // Used to perform certain actions, and also functions.
        // public class Main{
        // Public void myMethod(Params)
        // // COde to be executed
        // }
        // }
        // myMethod(atgs); // Method Calling
//        int Ad = Add();
        int Ad = Add(7,7);
        System.out.println("The Sum is: "+ Ad);

        // Encapsulation

        /* Encapsulation in java is a mechanism of wrapping the data (variable) and code acting on the data (methods) together as a single unit.
        * In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding,.
        *
        * To achieve encapsulation in java
        * Declare the variable of a class as private.
        * Provide public setter and  getter methods to modify and view the variable values.
        * */
    }

    public static int Add(int a, int b){
//        int a;
//        a = 7;
//        int b = 7;
        int c = a+b;
       return c;
    }

}
