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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Student(String name, int age, String hometown) {
        this.hometown = hometown;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名: " + name + ", 年龄: " + age + ", 家乡: " + hometown;
    }
}
