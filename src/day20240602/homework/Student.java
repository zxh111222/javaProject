package day20240602.homework;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: Student类,包含学生的姓名、年龄和家乡
 * @date 2024/6/1 15:16
 */
public class Student {
    String name;
    int age;
    String hometown;

    public Student(String hometown, int age, String name) {
        this.hometown = hometown;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名: " + name + ", 年龄: " + age + ", 家乡: " + hometown;
    }
}
