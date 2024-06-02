package day20240602.p;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/2 11:24
 */
@SuppressWarnings({"all"})
public class SetDemo {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("abc");
        list1.add("def");
        list1.add("qwe");
        list1.add("xyz");
        list1.add("xyz");
        list1.add("abc");
        System.out.println(list1);

        System.out.println("=== === ===");

        Set<String> set1 = new HashSet<>();
        set1.add("abc");
        set1.add("def");
        set1.add("qwe");
        set1.add("xyz");
        set1.add("xyz");
        set1.add("abc");
        System.out.println(set1);


    }
}
