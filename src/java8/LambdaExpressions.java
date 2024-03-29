package java8;


interface MyInr {

    void show();

}

/*class IntImp implements MyInr {

    @Override
    public void show() {

    }
}*/
public class LambdaExpressions {
    public static void main(String[] args) {

        /*

        // Lambda expression is kind of function which have the following charatertics
        // It is anonymous(NameLass) function
        // It have no return type.
        // It has no modifiers (Live - public - static & final)
        //->() {}
        // WHY LAMBDA
        // 1. Enable functional programming
        // 2. Readable adn concise code
        // 3.Easier-to-use API and libraries
        // 4. Enable support of parallel processing.


        (Int x) -> {}

        public void show(){
            System.out.println("Show");
        }

        // Lambda
        () -> System.out.println("Show");
        */

        Inr t = () -> System.out.println("Show");
        t.show();
    }
}
