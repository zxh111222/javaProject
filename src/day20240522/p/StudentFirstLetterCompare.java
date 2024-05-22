package day20240522.p;

public class StudentFirstLetterCompare implements MyComparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.firstLetter == s2.firstLetter) {
            return 0;
        } else if (s1.firstLetter > s2.firstLetter) {
            return 1;
        } else {
            return -1;
        }
    }
}
