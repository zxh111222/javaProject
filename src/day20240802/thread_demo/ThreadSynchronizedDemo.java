package day20240802.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/3 19:52
 */
public class ThreadSynchronizedDemo {
    public static void main(String[] args) {
        ThreadSynchronizedDemo.classM1();
        new ThreadSynchronizedDemo().instanceM1();
    }

    public static void classM1() {
        System.out.println("ThreadSynchronizedDemo.classM1");
        System.out.println("假设这个有10行代码，没有操作公共资源，即使多线程访问也没影响。不需要被锁");
        synchronized (ThreadSynchronizedDemo.class) {
            System.out.println("N行访问共享资源的代码...");
        }
        System.out.println("其他代码...");
    }

    public void instanceM1() {
        System.out.println("ThreadSynchronizedDemo.instanceM1");
        System.out.println("假设这个有10行代码，没有操作公共资源，即使多线程访问也没影响。不需要被锁");
        synchronized (this) {
            System.out.println("N行访问共享资源的代码...");
        }
        System.out.println("其他代码...");
    }
}
