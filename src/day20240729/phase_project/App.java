package day20240729.phase_project;

import day20240729.phase_project.downloader.Downloader;
import day20240729.phase_project.notificator.Notificator;
import day20240729.phase_project.parser.Parser;
import day20240729.phase_project.storage.Storage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/6  18:16
 */


public class App {
    public static void main(String[] args) throws Exception {
        // 读取配置文件
        // === --- ===

        Properties properties = new Properties();
        File file = new File("src/day20240729/phase_project/resources/config_local.properties");
        properties.load(new FileInputStream(file));
        System.out.println("配置文件读取成功!");

        // === --- ===

        // 开始项目
        String app = properties.getProperty("app");
        System.out.println("程序名称 : " + app);
        System.out.println("程序开始运行...");

        // 下载模块: 根据配置文件的信息进行不同方式的下载
        String url = properties.getProperty("url");
        System.out.println("Downloader - 正在下载...:" + url);
        Downloader downloader = Downloader.getInstance(properties.getProperty("downloader"));
        String html = downloader.download(url);
        System.out.println("Downloader -下载完成");

        // 解析模块: 根据配置文件的信息进行不同 url 的解析
        System.out.println("Parser - 正在解析...");
        Parser parser = Parser.getInstance(properties.getProperty("parser"));
        List<String> information = parser.parse(html);
        System.out.println("Parser - 解析完成！(共获取到" + information.size() + "条数据)");
        // System.out.println(information);

        // 存储模块: 根据配置文件的信息进行不同方式的存储
        System.out.println("Storage - 正在存储...");
        Storage storage = Storage.getInstance(properties.getProperty("storage"));
        Map<String, String> saveInfo =  storage.save(information);
        System.out.println("Storage - 存储完成...");

        // 通知模块: 根据配置文件的信息选择通知方式，配置文件含有通知的相关信息
        System.out.println("Notificator - 正在通知...");
        Notificator notificator = Notificator.getInstance(properties.getProperty("notificator"));
        notificator.notify(information, properties);
        System.out.println("Notificator - 通知完成...");

        //结束
        System.out.println("程序运行结束!");
    }

}
