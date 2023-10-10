package Core_Advance_Java_JEE_With_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Practice {
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
    public static void main(String[] args) {

//        ArrayList_Practice arrayListD = new ArrayList_Practice();
//        System.out.println(arrayListD);

        ArrayList arrayList = new ArrayList();
        //System.out.println(arrayList);
        //System.out.println(arrayList.isEmpty());
        //System.out.println(arrayList.size());
        arrayList.add(10);
        arrayList.add(999);
        arrayList.add(10.5);
        arrayList.add("Muhsan");
        arrayList.add("Hello");
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList(2);
        arrayList1.add(10.5);
        arrayList1.add("Uzair");
        System.out.println(arrayList1);

        ArrayList arrayList2 = new ArrayList(arrayList1);
        arrayList2.add("Hi");
        arrayList2.add("Bye");
        //System.out.println(arrayList2);
        arrayList2.add(3,50);
        arrayList2.set(1,"BYE");
        System.out.println(arrayList2);
//        System.out.println(arrayList2.isEmpty());
//        System.out.println(arrayList2.size());
//        System.out.println(arrayList2.get(4));
//        System.out.println(arrayList2.contains("BYE"));

        //arrayList2.removeAll(arrayList2);
        //arrayList2.retainAll(arrayList2);
        //System.out.println(arrayList2.size());

        // Get All Elements ArraysList
        //for
        //foreach
        //Iterator
        //List isterator
        //Enumeration
        System.out.println();
//        for (int i =0;i<arrayList2.size();i++){
//            System.out.println(arrayList.get(i));
//        }
        System.out.println();

        for (Object i:arrayList2) {
            System.out.println(i);
        }

        System.out.println();

        Iterator u = arrayList2.iterator();
        while (u.hasNext()){
            Object object = (Object) u.next();
            System.out.println(object);
        }

//        ArrayList<String> stringArrayList = new ArrayList<String>();
//        stringArrayList.add(4);
//        stringArrayList.add("Addition");
//        stringArrayList.add("Subtra");

    }
}
