package day20240801.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/1 15:52
 */
public class BeforeThreadSinglePath {
    public static void m1() {
        m2();
        System.out.println("BeforeThreadSinglePath.m1");
    }

    public static void m2() {
        m3();
        System.out.println("BeforeThreadSinglePath.m2");
    }

    private static void m3() {
        System.out.println("BeforeThreadSinglePath.m3");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("BeforeThreadSinglePath.main");
    }

}
