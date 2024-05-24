package day20240522.p2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyMap<String,String> a = new MyMap<>("实训室8", "4台风扇");

        MyMap<String,String> b = new MyMap<>();
        b.set("实训室3", "3台风扇");
        b.get("实训室3");
        System.out.println(b.get("实训室3"));

        System.out.println("=== === ===");

        MyMap<String, Student[]> c = new MyMap<>("实训室1", new Student[]{new Student("学生1"), new Student("学生2")});
        c.set("实训9",new Student[]{new Student("a"),new Student("b")});
        System.out.println(Arrays.toString(c.get("实训9")));

        System.out.println("=== === ===");

        MyMap<String, Integer> d = new MyMap<>("实训室2", 2);
        System.out.println(d.get("实训室2"));


    }
}
