package day20240729.phase_project.notificator;

import day20240729.phase_project.util.MyReflectionUtil;

import java.util.List;
import java.util.Properties;

public interface Notificator {

    static Notificator getInstance(String notificator) {
        return MyReflectionUtil.getInstance(notificator);
    }

    void notify(List<String> information, String keywords, Properties properties) throws Exception;
}
