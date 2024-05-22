package day20240515.p;

public class StudentAgeCompare implements MyComparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return (int) s1.age - (int) s2.age;
    }
}
