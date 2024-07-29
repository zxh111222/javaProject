package day20240729.project.storage;

import java.util.List;
import java.util.Map;

public interface Storage {
     Map<String, String> save(List<String> information);
}
