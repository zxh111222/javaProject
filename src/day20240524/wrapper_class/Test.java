package day20240524.wrapper_class;

import day20240522.p2.MyMap;

public class Test {
    public static void main(String[] args) {
        // 在什么情况下引出包装类之一: Integer
        MyMap<String, Integer> map1 = new MyMap<>("今天上课教室", 8);
        System.out.println(map1.get("今天上课教室"));


    }
}
