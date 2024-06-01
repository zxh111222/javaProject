package day20240531.p;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionCommentMethod2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("add");
        stringList.add("abc");
        System.out.println(stringList);
        stringList.remove("abc");
        System.out.println(stringList);

        System.out.println("=== === ===");

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
//        integerList.remove(2);
        integerList.remove(Integer.valueOf(2));
        System.out.println(integerList);

    }
}
