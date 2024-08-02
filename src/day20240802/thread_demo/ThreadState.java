package day20240802.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 11:42
 */
public class ThreadState {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "---1")).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "---2")).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "---3")).start();
    }
}
