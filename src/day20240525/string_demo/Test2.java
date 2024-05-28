package day20240525.string_demo;

public class Test2 {
    public static void main(String[] args) {

        // 自定义一个 MyStringBuilder，模拟 StringBuilder 的核心功能
        // 以终为始的方式
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("abc").append("xyz");
        System.out.println(myStringBuilder);



    }
}
