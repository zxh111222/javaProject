package day20240525.string_demo;

public class StringCommonMethod3 {
    public static void main(String[] args) {
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
    }
}
