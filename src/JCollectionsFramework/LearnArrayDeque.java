package JCollectionsFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(49);
        ad.offerFirst(99);
        ad.offer(16);
        ad.offerLast(5);
        ad.offer(8);
        ad.offer(50);
        ad.offer(150);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println("\n");
        System.out.println(ad.poll());
        System.out.println("Poll() " + ad);

        System.out.println("\n");
        System.out.println(ad.pollFirst());
        System.out.println("PollFirst() " + ad);

        System.out.println("\n");
        System.out.println(ad.pollLast());
        System.out.println("PollLast() " + ad);
    }
}
