package day20240729.phase_project.Notificator;

import java.util.List;
import java.util.Properties;

public interface Notificator {
    void notificator(List<String> information, String keywords, Properties properties) throws Exception;
}
