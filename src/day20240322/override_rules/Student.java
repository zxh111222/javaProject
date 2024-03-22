package day20240322.override_rules;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-22  19:39
 * @Description: TODO
 */
public class Student extends Person{

    public String studentCardId;

    public String getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(String studentCardId) {
        this.studentCardId = studentCardId;
    }

    @Override
    public int eat() {
        System.out.println("吃食堂。。。");
    }
}
