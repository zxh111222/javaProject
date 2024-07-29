package day20240729.phase_project.notificator;


import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

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
    public void notify(List<String> information, String keywords, Properties properties) throws Exception {
        // 处理、获取关键词
        int keywordCount = 0;
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
        send(sender, secret_token, receiver, String.valueOf(content));
    }

    public static void send(String sender, String secret_token, String receiver, String content)  throws Exception {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.qq.com");
        prop.put("mail.smtp.port", "587");

        // https://wx.mail.qq.com/list/readtemplate?name=app_intro.html#/agreement/authorizationCode
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, secret_token);
            }
        });

        Message message = new MimeMessage(session);
        // who you are
        message.setFrom(new InternetAddress(sender));
        // send to ...
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));

        message.setSubject("来自 Java 的提醒");

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(content, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);

        System.out.println("邮件发送成功");
    }

}
