package day20240801.singleton_recap;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/1 15:04
 */
public class Student {
    private static Student instance;

    private Student() {
        System.out.println("----");
    }

    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }

}
