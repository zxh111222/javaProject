package day20240729.project;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/29 11:27
 */
public class DefaultDownloader extends Downloader {
    public String download(String html){
        System.out.println("DefaultDownloader - 下载器");
         return "我不会这个，你去找其他人吧！";
    }

}
