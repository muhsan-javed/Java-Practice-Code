package JCollectionsFramework;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int[] numbers = {8, 6, 5, 4, 8, 7, 8, 7, 54, 54, 65, 4, 6, 6, 8};
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}
