package day20240324.practice2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  14:43
 * @Description: TODO
 */
public class Student extends Person {

    public String lonely;


    public Student(String name) {
        super(name);
    }

    @Override
    public void talkAboutLonely(String text) {
        System.out.println(text);
    }

    public void TalkAboutLonely(String people, String text) {
        System.out.println(people + text);
    }

    //你没资格重写我了
//    public void describeLonely(String text) {
//        System.out.println(text);
//    }

}
