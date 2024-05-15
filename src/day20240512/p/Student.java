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
    public int compareTo(MyComparable other) {
        Student o = (Student) other;
        if (this.age == o.age) {
            return 0;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
