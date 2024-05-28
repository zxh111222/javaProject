package day20240525.string_demo;

public class StringCommonMethod4 {
    public static void main(String[] args) {
        // 3.敏感词库功能
        // 比如：用户发的微博内容是“早上买的包子实惠又好吃，店老板说他自己是SB，但是良心还是有的。“
        // 需要的显示效果:早上买的**实惠又好吃，店老板说他自己是**，但是**还是有的。
        String[] words = new String[]{"包子", "SB", "良心"};
        String s3 = "早上买的包子实惠又好吃，店老板说他自己是SB，但是良心还是有的。" ;

        for (int i = 0; i < words.length; i++) {
            s3 = s3.replaceAll(words[i], "**");
        }
        System.out.println(s3);

    }
}
