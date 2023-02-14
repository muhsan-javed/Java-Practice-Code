package JCollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(44);
        queue.offer(76);
        queue.offer(26);
        queue.offer(96);
        queue.offer(34);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
