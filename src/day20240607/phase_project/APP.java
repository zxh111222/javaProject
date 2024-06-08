package day20240607.phase_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/6  18:16
 */


public class APP {
    public static void main(String[] args) throws IOException {
        // 读取配置文件
        Properties properties = new Properties();
        File file = new File("src/day20240607/phase_project/resources/config.properties");
        properties.load(new FileInputStream(file));
        System.out.println("配置文件读取成功!");

        // 下载模块: 根据配置文件的信息进行不同方式的下载

        // 解析模块: 根据配置文件的信息进行不同 url 的解析

        // 存储模块: 根据配置文件的信息进行不同方式的存储

        // 通知模块: 根据配置文件的信息选择通知方式，配置文件含有通知的相关信息
    }




}
