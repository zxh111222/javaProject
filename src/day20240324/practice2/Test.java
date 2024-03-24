package day20240324.practice2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  14:45
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {

        Person person = new Student("张三");
        person.talkAboutLonely();
        Person person1 = new Teacher("李四");
        person1.talkAboutLonely();
        Student person2 = new Student("zhengxinhao");
        person2.meTalkAboutLonely();


    }
}
