package day20240607.phase_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
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
        System.out.println("程序开始运行...");

        // 下载模块: 根据配置文件的信息进行不同方式的下载
        String url = properties.getProperty("url");
        Downloader downloader = getDownloader(properties.getProperty("downloader"));
        System.out.println("Downloader - 正在下载...:" + url);
        String html = downloader.downloader(url);

        // 解析模块: 根据配置文件的信息进行不同 url 的解析
        Parser parser = getParser(properties.getProperty("parser"));
        List<String> result = parser.parser(html);
        // System.out.println(result);

        // 存储模块: 根据配置文件的信息进行不同方式的存储

        // 通知模块: 根据配置文件的信息选择通知方式，配置文件含有通知的相关信息
    }

    private static Parser getParser(String parser) {
        Parser p = null;
        if ("xmfish".equals(parser)) {
            p = new XmfishParser();
        }
        return p;
    }

    /**
     * @description: TODO
     * @author XinhaoZheng
     * @date 2024/6/9 12:55
     * @version 1.0
     */
    private static Downloader getDownloader(String downloader) {
        Downloader dl = null;
        if ("jsoup".equals(downloader)) {
            dl = new JsoupDownloader();
        } else if ("io".equals(downloader)) {
            dl = new MyIODownloader();
        }
        return dl;
    }


}
