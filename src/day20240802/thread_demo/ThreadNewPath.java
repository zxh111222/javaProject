package day20240802.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 10:07
 */
public class ThreadNewPath {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("Thread-path1");
        myThread1.start();

        Thread myThread2 = new Thread(new MyThread2(), "Thread-path2");
        myThread2.start();

        // 匿名的 Runnable 实现类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "===" + i);
                }
            }
        }).start();


    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName() + "===" + i);
        }
    }

    public MyThread1(String name) {
        super(name);
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }
}
