package day20240515.p;

public class Student {
    String name;
    public int age;
    public char firstLetter;

    public Student(String name, char firstLetter, int age) {
        this.name = name;
        this.age = age;
        this.firstLetter = firstLetter;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ")";
    }


}
