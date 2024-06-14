package day20240607.phase_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/6  18:16
 */


public class APP {
    public static void main(String[] args) throws Exception {
        // 读取配置文件
        Properties properties = new Properties();
        File file = new File("src/day20240607/phase_project/resources/config.properties");
        properties.load(new FileInputStream(file));
        System.out.println("配置文件读取成功!");
        System.out.println("程序开始运行...");

        // 下载模块: 根据配置文件的信息进行不同方式的下载
        String url = properties.getProperty("url");
        System.out.println("Downloader - 正在下载...:" + url);
        Downloader downloader = getDownloader(properties.getProperty("downloader"));
        String html = downloader.downloader(url);
        System.out.println("Downloader -下载完成");

        // 解析模块: 根据配置文件的信息进行不同 url 的解析
        System.out.println("Parser - 正在解析...");
        Parser parser = getParser(properties.getProperty("parser"));
        List<String> information = parser.parser(html);
        System.out.println("Parser - 解析完成！(共获取到" + information.size() + "条数据)");
        // System.out.println(information);

        // 存储模块: 根据配置文件的信息进行不同方式的存储
        System.out.println("Storage - 正在存储...");
        Storage storage = getStorage(properties.getProperty("storage"));
        Map<String, String> saveInfo =  storage.save(information);
        System.out.println("Storage - 存储完成...");

        // 通知模块: 根据配置文件的信息选择通知方式，配置文件含有通知的相关信息
        System.out.println("Notificator - 正在通知...");
        String keywords = properties.getProperty("keywords");
        Notificator notificator = getNotificator(properties.getProperty("notificator"));
        notificator.notificator(information, keywords, properties);
        System.out.println("Notificator - 通知完成...");

        //结束
        System.out.println("程序运行结束!");
    }

    /**
     * @description: TODO
     * @author XinhaoZheng
     * @date 2024/6/11 8:52
     * @version 1.0
     */
    private static Notificator getNotificator(String notificator) {
        return MyReflectionUtil.getInstance(notificator);
    }

    /**
     * @description: TODO
     * @author XinhaoZheng
     * @date 2024/6/11 8:52
     * @version 1.0
     */
    private static Storage getStorage(String storage) {
        return MyReflectionUtil.getInstance(storage);
    }

    /**
     * @description: TODO
     * @author XinhaoZheng
     * @date 2024/6/9 13:54
     * @version 1.0
     */
    private static Parser getParser(String parser) {
        return MyReflectionUtil.getInstance(parser);
    }

    /**
     * @description: TODO
     * @author XinhaoZheng
     * @date 2024/6/9 12:55
     * @version 1.0
     */
    private static Downloader getDownloader(String downloader) {
        return MyReflectionUtil.getInstance(downloader);
    }


}
