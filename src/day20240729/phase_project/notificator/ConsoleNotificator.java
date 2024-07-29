package day20240729.phase_project.notificator;


import java.util.List;
import java.util.Properties;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/11 9:01
 */
public class ConsoleNotificator implements Notificator {
    @Override
    public void notify(List<String> information, Properties properties) {
        // 处理、获取关键词
        int keywordCount = 0;
        String keywords = properties.getProperty("keywords");
        String[] keyword = keywords.split(",");
        // 获取信息并发送到控制台
        for (String info : information) {
            int index = info.lastIndexOf(",");
            String title = info.substring(0, index-1);
            String url = info.substring(index + 1);
            for (String key : keyword) {
                if (title.contains(key)) {
                    keywordCount++;
                    System.out.println("获取到第" + keywordCount + "个所需的关键词内容，关键词为：“" + key + "”");
                    System.out.println("其标题为:" + title);
                    System.out.println("其url为:" + url);
                }
            }
        }
        System.out.println("发送完毕!");
    }
}
