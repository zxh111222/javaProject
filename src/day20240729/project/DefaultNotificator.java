package day20240729.project;

import java.util.List;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/29 13:13
 */
public class DefaultNotificator implements Notificator {
    @Override
    public void notify(List<String> information) {
        System.out.println("DefaultNotificator - 通知器");
    }
}
