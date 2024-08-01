package day20240801.thread_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/1 16:34
 */
public class MultiplePathDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("path-new-Thread===" + i);
                }
            }
        }).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("path-main===" + i);
        }
    }
}
