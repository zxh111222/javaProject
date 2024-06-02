package day20240602.p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/2 16:33
 */
public class MapDemo {
    public static void main(String[] args) {
        // 回顾之前泛型的时候写的 MyMap<K,V>
        Map<String, Integer> group = new HashMap<>();
        group.put("第一组", 3);
        group.put("第二组", 4);
        group.put("第三组", 2);
        group.put("第四组", 5);
        System.out.println(group);
        System.out.println(group.toString());

        System.out.println("=== === ===");

        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            System.out.println("组号: " + entry.getKey() + ", 数量: " + entry.getValue() + "人");
        }

        System.out.println("--- --- ---");

        Set<Map.Entry<String, Integer>> entries = group.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + " = = = " + next.getValue());
        }



    }
}
