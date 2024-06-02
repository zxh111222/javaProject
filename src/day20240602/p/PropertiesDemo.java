package day20240602.p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/2 17:00
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        properties.put("username", "admin");
//        properties.put("password", "secret");
//        properties.put("token","ksadiadiowoiho3ioiasioads");
        File file = new File("src/day20240602/p/config.properties");
        properties.load(new FileInputStream(file));
        System.out.println(properties);
        System.out.println(properties.getProperty("username"));

    }
}
