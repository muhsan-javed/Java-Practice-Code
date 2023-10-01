package JCollectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer("Muhsan");
        priorityQueue.offer("Ali");
        priorityQueue.offer("Hyder");

        System.out.println(priorityQueue);

//        priorityQueue.poll();
        System.out.println(priorityQueue);

    }
}
