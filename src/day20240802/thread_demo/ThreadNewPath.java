package day20240802.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 10:07
 */
public class ThreadNewPath {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();


    }
}

class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(this.getName() + "===" + i);
            }
        }
    }


