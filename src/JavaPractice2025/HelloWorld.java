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
    }
}
