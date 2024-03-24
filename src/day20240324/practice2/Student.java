package day20240324.practice2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  14:43
 * @Description: TODO
 */
public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void talkAboutLonely() {
        System.out.println("学生--" + this.name + "：好孤独！");
    }

}
