package day20240607.phase_project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: 解析厦门小鱼网
 * @date 2024/6/8 18:37
 */
public class XmfishParser implements Parser {
    @Override
    public List<String> parser(String html) {
        List<String> parserList = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Elements es = doc.select("tbody[id=threadlist]").select("tr[class=tr3]");

        for (Element e : es) {
            // 过滤公告、置顶
            Element noticeAndTop = e.select("td.icon a i").first();
            if (noticeAndTop.hasAttr("alt") && "置顶帖标志".equals(noticeAndTop.attr("alt"))) {
                continue;
            }
            //解析数据
            Element titleElement = e.select("td.subject a.subject_t").first();
            String title = titleElement.text();
            String url = titleElement.attr("href");
            url = "http://bbs.xmfish.com/" + url;
            parserList.add(title + "," + url);
        }

        return parserList;
    }
}
