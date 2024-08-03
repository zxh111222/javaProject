package day20240802.thread_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/2 16:24
 */
import java.util.ArrayList;
import java.util.List;

public class TicketWindows {
    static List<String> tickets = new ArrayList<>();

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
                    while (true) {
                        String ticket = sellTicket();
                        if (ticket == null) {
                            break;
                        }
                        System.out.println("售出===" + ticket);
                    }
                }
            }).start();
        }
    }

    private static synchronized String sellTicket() {
        if (tickets.isEmpty()) {
            return null;
        } else {
            return tickets.remove(0);
        }
    }
}
