package JCollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Muhsan", 2));
        studentSet.add(new Student("Ali", 8));
        studentSet.add(new Student("Javed", 1));
        studentSet.add(new Student("Junaid", 8));

        studentSet.add(new Student("Hyder", 8));

        Student s1 = new Student("Uzair", 2);
        Student s2 = new Student("Sahid", 2);

        System.out.println(s1.equals(s2));

        System.out.println(studentSet);

        //Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();

//        Set<Integer> set = new TreeSet<>();
//
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//
//        System.out.println(set);
//
//        set.remove(65);
//        System.out.println(set);
//
//        System.out.println(set.contains(21));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//        System.out.println(set);

    }
}
