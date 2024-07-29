package day20240729.project.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/29 11:37
 */
public class DefaultParser implements Parser {
    @Override
    public List<String> parse(String html) {
        List<String> parserList = new ArrayList<>();
        parserList.add("闲置桌子");
        parserList.add("苹果手机");
        return parserList;
    }
}
