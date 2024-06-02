package day20240531.p;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionCommentMethod3 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("abc");
        als.add("qwe");
        als.add("asd");
        System.out.println(als.contains("asd"));

        System.out.println("=== === ===");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("X", 18));
        students.add(new Student("Y", 19));
        students.add(new Student("Z", 20));
        System.out.println(students.contains(new Student("Y", 19)));

    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
