package day20240730.Singleton_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/30 15:53
 */
public class SingletonTest {
    public static void main(String[] args) {
        Student student = Student.STUDENT_X;
        Student student1 = Student.STUDENT_X;
        System.out.println(student == student1);
        student.print();
    }
    public enum Student {
        STUDENT_X;
        public void print() {
            System.out.println("123!");
        }
    }

}
