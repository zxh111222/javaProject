package day20240512.p;

public class Student extends Entity{
    String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.xxx = this.age;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ")";
    }
}
