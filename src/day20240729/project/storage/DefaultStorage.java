package day20240729.project.storage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/29 11:53
 */
public class DefaultStorage implements Storage {
    @Override
    public Map<String, String> save(List<String> information) {
        System.out.println("DefaultStorage - 存储器");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("key", "value");
        return map;
    }
}
