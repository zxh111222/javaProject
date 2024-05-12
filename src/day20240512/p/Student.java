package day20240512.p;

public class Student extends MyComparable {
    String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ")";
    }

        @Override
    public double toNumber() {
        return this.age;
    }
}
