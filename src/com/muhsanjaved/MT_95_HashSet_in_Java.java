package com.muhsanjaved;

import java.util.HashSet;

public class MT_95_HashSet_in_Java {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        //myHashSet.add(11);
        myHashSet.add(11);
        myHashSet.remove(11);
        System.out.println(myHashSet);
    }
}
