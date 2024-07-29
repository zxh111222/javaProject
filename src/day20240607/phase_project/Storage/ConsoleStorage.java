package day20240607.phase_project.Storage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/9 14:14
 */
public class ConsoleStorage implements Storage {
    @Override
    public Map<String, String> save(List<String> information) {
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < information.size(); i++) {
            String key = "info_" + (i + 1);
            String value = information.get(i);
            map.put(key, value);
            // System.out.println(key + " : " + value);
        }
        System.out.println(map);
        return map;
    }
}
