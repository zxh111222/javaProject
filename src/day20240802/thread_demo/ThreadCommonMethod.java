package day20240802.thread_demo;


/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 14:28
 */
public class ThreadCommonMethod {
    public static void main(String[] args) throws InterruptedException {
        // sleep();
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

    private static void join() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        });
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

    private static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
                if (i % 10 ==0) {
                    Thread.yield();
                }
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

    private static void testPriority() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        });
        t1.setPriority(Thread.NORM_PRIORITY + 3);
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

    private static void isAlive() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                //System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        });
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println("等待一秒钟");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.isAlive());
    }




}
