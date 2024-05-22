package day20240522.p2;

public class Test {
    public static void main(String[] args) {
        Entity a = new Entity("实训室8", "4台风扇");

        Entity b = new Entity();
        b.set("实训室3", "3台风扇");
        b.get("实训室3");

        Entity c = new Entity("实训室1", new Student[]{new Student("学生1"), new Student("学生2")});




    }
}
