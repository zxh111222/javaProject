package day20240802.thread_demo;

import java.util.*;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 16:24
 */
import java.util.ArrayList;
import java.util.List;

public class TicketWindows {
    static List<String> tickets = new Vector<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("车票编码---" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!tickets.isEmpty()) {
                        System.out.println("售出===" + tickets.remove(0));
                    }
                }
            }).start();
        }
    }
}
