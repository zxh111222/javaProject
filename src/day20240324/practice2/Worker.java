package day20240324.practice2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  14:44
 * @Description: TODO
 */
public class Worker extends Person {

    public Worker(String name) {
        super(name);
    }

    public void talkAboutLonely() {
        System.out.println("打工人--" + this.name + "：为什么会孤独");
    }

}
