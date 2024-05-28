package day20240525.string_demo;

@SuppressWarnings({"all"})
public class StringCommonMethod {
    public static void main(String[] args) {
        String s = "zxj";
        String s1 = s.toUpperCase();
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));

        System.out.println(s.endsWith("j"));
        System.out.println(s.startsWith("z"));
    }
}
