package day20240729.phase_project.notificator;

import day20240729.phase_project.util.MyReflectionUtil;

import java.util.List;
import static day20240729.phase_project.App.PROPERTIES;

public interface Notificator {

    static Notificator getInstance() {
        return MyReflectionUtil.getInstance(PROPERTIES.getProperty("notificator"));
    }

    void notify(List<String> information) throws Exception;
}
