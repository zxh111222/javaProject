package day20240607.phase_project;

import java.io.*;
import java.util.*;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/9 14:14
 */
public class FileStorage implements Storage {
    @Override
    public Map<String, String> save(List<String> information) throws IOException {
        Map<String, String> map = new LinkedHashMap<>();
        Properties properties = new Properties();
        File file = new File("src/day20240607/phase_project/resources/storeInfo.properties");
        try (FileInputStream fis = new FileInputStream(file)){
            properties.load(fis);
        }
        for (int i = 0; i < information.size(); i++) {
            String key = "info_" + (i + 1);
            String value = information.get(i);
            map.put(key, value);
            properties.setProperty(key, value);
        }
        try (FileOutputStream fos = new FileOutputStream(file)){
            properties.store(fos, properties.toString());
        }
        return map;
    }
}
