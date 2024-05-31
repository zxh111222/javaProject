package day20240531.p;

import java.util.ArrayList;

public class ArrayListReadingSourceCode {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // 通过阅读 ArrayList 源码，我们知道:
        // 1. 底层是用Object[] elementData 来存储的
        // 2. 当只是 new ArrayList<>() 时，这个还没给它指定大小
        //    跟 StringBuilder 不一样，StringBuilder 只要 new 出来，哪怕还没append，就已经分配长度16了
        // 3. 什么时候真正开始给 Object[] 指定长度？ => add 的时候 (when first element is added)
        //    第一次分配的长度是多少  => Math.max(DEFAULT_CAPACITY,minCapacity)

        arrayList.add("abc");

    }
}
