package day20240729.project;


import day20240729.project.downloader.DefaultDownloader;
import day20240729.project.downloader.Downloader;
import day20240729.project.parser.DefaultParser;
import day20240729.project.parser.Parser;

import java.util.List;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/29 11:21
 */
public class App {
    public static void main(String[] args) {
        // 读取配置文件
        System.out.println("配置文件读取成功!");

        // 下载模块 Downloader :
        Downloader downloader = new DefaultDownloader();
        String html = downloader.download("http://bbs.xmfish.com/thread-htm-fid-55-search-all-orderway-postdate-asc-DESC-page-1.html");
        System.out.println("Downloader - 下载完成");


        // 解析模块 Parser :
        System.out.println("Parser - 正在解析...");
        Parser parser = new DefaultParser();
        List<String> result = parser.parse(html);
        System.out.println(result);
        System.out.println("Parser - 解析完成");


        // 存储模块 Storage :


        // 通知模块 Notificator :





    }

}
