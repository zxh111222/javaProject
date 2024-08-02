package day20240802.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 9:53
 */
public class ThreadIntro {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("当前线程的名称=" + Thread.currentThread().getName());
        System.out.println("2");
        Thread.currentThread().setName("newName");
        System.out.println("3");
        System.out.println("当前线程的名称=" + Thread.currentThread().getName());
    }
}
