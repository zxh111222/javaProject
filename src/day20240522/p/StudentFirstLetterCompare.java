package day20240522.p;

public class StudentFirstLetterCompare implements MyComparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return (int) s1.firstLetter - (int) s2.firstLetter;
    }
}
