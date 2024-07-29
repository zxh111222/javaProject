package day20240729.phase_project.notificator;


import day20240729.phase_project.util.MyEmailUtil;

import java.util.List;
import java.util.Properties;


/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/11 9:01
 */
public class EmailNotificator implements Notificator {
    @Override
    public void notify(List<String> information, Properties properties) throws Exception {
        // 处理、获取关键词
        int keywordCount = 0;
        String keywords = properties.getProperty("keywords");
        String[] keyword = keywords.split(",");
        // 提取配置文件相关信息
        String secret_token = properties.getProperty("secret_token");
        String from = properties.getProperty("from");
        String to = properties.getProperty("to");
        int fromIndex = from.indexOf(".");
        int toIndex = to.indexOf(".");
        String sender = from.substring(fromIndex + 1);
        String receiver = to.substring(toIndex + 1);
        //System.out.println(sender + " -> " + receiver);
        // 获取信息并发送到控制台
        StringBuilder content = new StringBuilder();
        for (String info : information) {
            int index = info.lastIndexOf(",");
            String title = info.substring(0, index-1);
            String url = info.substring(index + 1);
            for (String key : keyword) {
                if (title.contains(key)) {
                    keywordCount++;
                    content.append("获取到第").append(keywordCount).append("个所需的关键词内容，关键词为：“").append(key).append("”").append("<br/>");
                    content.append("其标题为:").append(title).append("<br/>");
                    content.append("其url为:").append(url).append("<br/><br/>");
                    /*System.out.println("获取到第" + keywordCount + "个所需的关键词内容，关键词为：“" + key + "”");
                    System.out.println("其标题为:" + title);
                    System.out.println("其url为:" + url);*/
                }
            }
        }
        //System.out.println(content);

        MyEmailUtil.send(sender, secret_token, receiver, String.valueOf(content));
    }



}
