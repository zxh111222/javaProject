package day20240424;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-04-24  19:37
 * @Description: TODO
 */
public class JsoupDemo {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://bbs.xmfish.com/thread-htm-fid-55.html").get();
        Elements secondHandText = doc.select("tbody#threadlist tr.tr3 td.subject a.subject_t");
        Elements secondHandData = doc.select("tbody#threadlist tr.tr3 td.author p");

//        System.out.println(secondHandData.size());
//        System.out.println(secondHandData.eachText());


        for (int i = 1; i < secondHandText.size()-1; i++) {
            System.out.println("标题：" + secondHandText.eachText().get(i));
            if(i % 2 != 0){
                System.out.println("发布时间：" + secondHandData.eachText().get(++i));
            }
            System.out.println("链接：http://bbs.xmfish.com/" + secondHandText.get(i).attr("href"));
            System.out.println("----------");
        }
    }


}
