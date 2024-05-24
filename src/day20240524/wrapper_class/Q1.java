package day20240524.wrapper_class;

public class Q1 {
    public static void print(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void m(Object o) {
        System.out.println(o);
    }

    public static void m(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        String[] ss = new String[] {"abc"};
        print(ss);

        int[] is = new int[] {1, 5, 8};
        //下面代码会报错
        // print(is);

        m(123);

        Object a = 1;
        Object b = 2L;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }


}
