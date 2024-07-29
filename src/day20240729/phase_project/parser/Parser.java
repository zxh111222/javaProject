package day20240729.phase_project.parser;

import day20240729.phase_project.util.MyReflectionUtil;

import java.util.List;

public interface Parser {

    static Parser getInstance(String parser) { return MyReflectionUtil.getInstance(parser);}

    List<String> parse(String html);

}