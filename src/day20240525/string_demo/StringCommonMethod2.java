package day20240525.string_demo;

public class StringCommonMethod2 {
    public static void main(String[] args) {
        // 1.隐藏手机号码的中间几位，用 * 替代
        // 比如: 18898765432,需要显示效果: 188****5432
        String phoneNumber = "18898765432";
        String startPhoneNumber = phoneNumber.substring(0,3);
        String middlePhoneNumber = "****";
        String endPhoneNumber = phoneNumber.substring(7,11);
        String newPhoneNumber = startPhoneNumber + middlePhoneNumber + endPhoneNumber;
        System.out.println(newPhoneNumber);

        System.out.println("=== === ===");

        // 2.判断某个字符串，在另一个字符串中出现的次数
        // 比如: s2 中出现了多少次s1
        String s1 = "sb";
        String s2 = "asdksbashdia133sb514846asdssbadkbaksjasbnk23sb13";
        int count = 0;
        int index = 0;

        while (s2.indexOf(s1, index) != -1) {
            index = s2.indexOf(s1, index);
            count++;
            index += s1.length();
        }



        System.out.println(count);
        System.out.println("=== === ===");

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
