package day20240729.phase_project.storage;

import day20240729.phase_project.util.MyReflectionUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Storage {

    static Storage getInstance(String storage) {
        return MyReflectionUtil.getInstance(storage);
    }

    Map<String, String> save(List<String> information) throws IOException;
}
