package JCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();

        list.add(new Student("Muhsan",2));
        list.add(new Student("Ali",3));
        list.add(new Student("Javed",1));
        list.add(new Student("Junaid",4));

        list.add(new Student("Hyder",7));

        Student s1 = new Student("Uzair",6);
        Student s2 = new Student("Sahid",6);

//        System.out.println(s1.compareTo(s2));
//        System.out.println(list);

        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(list);


//        List<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(15);
//        list.add(16);
//        list.add(17);
//        list.add(18);
//        list.add(18);

//        System.out.println("min element "+ Collections.min(list));
//        System.out.println("max element "+ Collections.max(list));
//        System.out.println(Collections.frequency(list,9));

//        Collections.sort(list, Comparator.reverseOrder());

//        System.out.println(list);

    }
}
