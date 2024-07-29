package day20240729.project;

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


        // 存储模块 Storage :


        // 通知模块 Notificator :





    }

}
