package day20240324.practice2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  14:41
 * @Description: TODO
 */
public abstract class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }


    public abstract void talkAboutLonely(String text);


    public final void describeLonely(String text) {
        System.out.println(text);
    }

}
