package day20240324.practice2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  14:43
 * @Description: TODO
 */
public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    public void talkAboutLonely() {
        System.out.println("老师--" + this.name + "：我不孤独！");
    }

}
