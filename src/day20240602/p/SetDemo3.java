package day20240602.p;

import java.util.*;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/2 11:24
 */
@SuppressWarnings({"all"})
public class SetDemo3 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("abc");
        set1.add("zxy");
        set1.add("def");
        set1.add("qwe");
        set1.add("xyz");
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(2);
        set2.add(8);
        System.out.println(set2);

        Set<Phone> phones = new TreeSet<>();
        phones.add(new Phone("xm", 1999));
        phones.add(new Phone("hw", 2999));
        phones.add(new Phone("pg", 999));
        System.out.println(phones);
    }
}

class Phone implements Comparable<Phone> {
    String brand;
    double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.price, o.price);
    }
}
