package day20240510.newP;

public class Student extends Entity {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "学生：" + this.name + "，年龄：" + this.age + "岁\t";
    }
}
