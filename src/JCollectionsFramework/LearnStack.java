package JCollectionsFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Cow");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());

        System.out.println("Stack: " + animals);
        animals.pop();
        System.out.println(animals.peek());

    }
}
