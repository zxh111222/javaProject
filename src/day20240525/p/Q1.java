package day20240525.p;


@SuppressWarnings({"all"})
public class Q1 {
    public static void main(String[] args) {
        String s1 = new String("xyz");
        String s2 = new String("xyz");
        System.out.println(s1 == s2);   // false

        System.out.println("=== === ===");

        String s3 = "xyz";
        String s4 = "xyz";
        System.out.println(s3 == s4);    // true

        System.out.println("=== === ===");

        final String s5 = "Java";
        String s6 = "Cool";
        String s7 = "JavaCool";
        String s8 = "Java" + "Cool";
        String s9 = s5 + "Cool";
        String s10 = "Java" + s6;
        String s11 = s9+ s10;

        System.out.println(s7 == s8);     //true
        System.out.println(s7 == s9);     //false
        System.out.println(s7 == s10);    //false
        System.out.println(s7 == s11);    //false
        System.out.println(s8 == s9);     //false
        System.out.println(s9 == s10);    //false
        System.out.println(s10 == s11);   //false

        System.out.println("=== === ===");

        String s12 = s9.intern();
        System.out.println(s7 == s12);

        System.out.println("=== === ===");


    }
}
