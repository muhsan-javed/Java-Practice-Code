package com.muhsanjaved;

import java.util.LinkedList;

public class MT_92_LinkedList_in_Java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(40);
        l2.add(60);
        l2.add(6);
        l2.add(200);
        l2.add(90);
        l2.add(2,900);

        l1.add(5);
        l1.add(9);
        l1.add(6);
        l1.add(7);
        l1.addAll(0,l2);
        l1.addLast(700);
        l1.addFirst(100);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //System.out.println(l1.remove(6));
        l1.set(1,5000);
//        System.out.print(l1.removeAll(l2)); // Remove all l2 elements
//        l2.trimToSize();// Don't no
//        l1.clear();
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(", ");
        }
    }
}
