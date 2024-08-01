package day20240801.singleton_recap;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/1 15:04
 */
public class StudentTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Student.getInstance());
        }

    }
}
