package day20240602.p;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/2 16:44
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("k1", null);
        map1.put("k1", "1");
        map1.put("k1", "2");
        map1.put(null, "v1");
        System.out.println(map1);
        System.out.println(map1.get("k1"));


        // Hashtable 典型的官方命名就不规范的例子 Since: 1.0
        // synchronized 线程安全，性能较低，类似 StringBuilder 和 StringBuffer,又不全一样，把 Hashtable 当成淘汰的类
        Map<String, String> map2 = new Hashtable<>();
        map2.put("k1", null);
        map2.put(null, "v1");
        System.out.println(map2);




    }
}
