package day20240420;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-04-24  17:36
 * @Description: TODO
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://so.gushiwen.org/gushi/shijing.aspx").get();
        System.out.println(doc.html());
        Elements poemName = doc.select("div.left div.sons a");
        System.out.println("当前网页列出的诗经总共有" + poemName.size() + "篇");
        System.out.println("它们的标题是：" + poemName.eachText());

    }
}
