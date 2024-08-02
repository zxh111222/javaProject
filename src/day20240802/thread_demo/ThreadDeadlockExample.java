package day20240802.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 15:51
 */
public class ThreadDeadlockExample {
    private static  Object resource1 = new Object();
    private static  Object resource2 = new Object();

    public static void main(String[] args) {
        // 线程1拿到resource1，等待resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired resource 1");
                System.out.println("Thread 1 Waiting for resource 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1 acquired resource 2...");
                }
            }
        });

        // 线程2拿到resource2，等待resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 acquired resource 2");
                System.out.println("Thread 2 Waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2 acquired resource 1...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
