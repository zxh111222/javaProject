package day20240529.p;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("src/day20240321");
        String str = "--";

        // 用树形的格式展示某个目录下的所有文件夹
        // 每多一级，在文件名前面多两个减号

        printFileList(file, str);



    }

    private static void printFileList(File file, String str) {
        File[] files = file.listFiles();
        if (files != null)  {
            for (File f : files) {
                if (file.isDirectory()) {
                    printFileList(file,"--");
                } else {

                }
            }
        }
    }
}
