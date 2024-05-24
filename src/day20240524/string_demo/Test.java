package day20240524.string_demo;

public class Test {
    public static void main(String[] args) {
        int count = 10;

        long s1 = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
        long e1 = System.currentTimeMillis();
        System.out.println(e1-s1);

        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb1.append(i);
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i);
        }


    }
}
