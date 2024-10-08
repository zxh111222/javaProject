package day20240729.phase_project.storage;


import day20240729.phase_project.dto.CustomResult;

import java.io.*;
import java.util.*;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/9 14:14
 */
public class FileStorage implements Storage {
    @Override
    public void save(List<CustomResult> information) throws IOException {
        File file = new File("src/day20240729/phase_project/resources/storeInfo.properties");
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            for (CustomResult cr : information) {
                pw.println(cr.getTitle());
                pw.println(cr.getUrl());
                pw.println(cr.getCreatedAt());
                pw.println(cr.getUpdatedAt());
                pw.println("--- --- ---");
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
