package day20240607.phase_project;

import java.util.List;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/11 9:01
 */
public class ConsoleNotificator implements Notificator {
    @Override
    public void send(List<String> information, String keywords) {
        // 处理、获取关键词
        String[] keyword = keywords.split(",");
        // 获取信息并发送到控制台
        for (String info : information) {
            int index = info.lastIndexOf(",");
            String title = info.substring(0, index-1);
            String url = info.substring(index + 1);
            for (String key : keyword) {
                if (title.contains(key)) {
                    System.out.println("获取到“" + key + "”关键字");
                    System.out.println("其url为:" + url);
                }
            }
        }
        System.out.println("发送完毕!");
    }
}
