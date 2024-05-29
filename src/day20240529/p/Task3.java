package day20240529.p;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        File rootDir = new File("src");

        Map<String, Integer> fileTypeCount = new HashMap<>();

        countFiles(rootDir, fileTypeCount);


        for (Map.Entry<String, Integer> entry : fileTypeCount.entrySet()) {
            System.out.println("类型: " + entry.getKey() + ", 数量: " + entry.getValue() + "个");
        }
    }

    
    private static void countFiles(File dirPath, Map<String, Integer> fileTypeCount) {
        File[] files = dirPath.listFiles();
        if (files != null)  {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    int i = fileName.lastIndexOf('.');
                    if (i > 0) {
                        fileName = fileName.substring(i + 1);
                    }else {
                        fileName = "无后缀";
                    }
                    if (fileTypeCount.containsKey(fileName)) {
                        fileTypeCount.put(fileName, fileTypeCount.get(fileName) + 1);
                    } else {
                        fileTypeCount.put(fileName, 1);
                    }
                } else if (file.isDirectory()) {
                    countFiles(file, fileTypeCount);
                }
            }
        }
    }
}
    
    

