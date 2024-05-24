package day20240524.wrapper_class;

@SuppressWarnings({"all"})
public class MyIntegerTest {
    public static void main(String[] args) {
        // Boxing
        MyInteger myInteger = new MyInteger(1);

        // UnBoxing
        int value = myInteger.intValue();

        System.out.println("=== === ===");

//        Integer i = Integer.valueOf(3);
        Integer i = new Integer(3);
        System.out.println(i.intValue());

    }
}
