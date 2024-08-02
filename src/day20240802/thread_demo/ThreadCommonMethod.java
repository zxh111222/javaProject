package day20240802.thread_demo;


/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 14:28
 */
public class ThreadCommonMethod {
    public static void main(String[] args) throws InterruptedException {
        sleep();
        // join();
        // testYield();
        // testPriority();
        // isAlive();
    }

    private static void sleep() throws InterruptedException {
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("2");
    }





}
