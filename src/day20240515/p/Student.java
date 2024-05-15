package day20240515.p;

public class Student implements MyComparable {
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

    @Override
    public int compareTo(MyComparable other) {
        Student o = (Student) other;
        if ((int)this.firstLetter == (int)o.firstLetter) {
            return 0;
        } else if ((int)this.firstLetter > (int)o.firstLetter) {
            return 1;
        } else {
            return -1;
        }
    }
}
