package day20240607.phase_project;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Storage {
    Map<String, String> save(List<String> information) throws IOException;
}
