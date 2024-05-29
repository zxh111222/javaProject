package day20240529.p;

public class Task1 {
    public static void main(String[] args) {
        String fileName1 = "MyStringBuiler.java";
        String fileName2 = "My.StringBuilder.java";
        String fileName3 = "abc.txt";
        String fileName4 = "xyz_.80_i.png";

        // 任务：如何根据文件名，获取文件类型(后缀)
        // 备注：不带点'.'
        getFileExtracted(fileName1);
        getFileExtracted(fileName2);
        getFileExtracted(fileName3);
        getFileExtracted(fileName4);


    }

    private static void getFileExtracted(String fileName1) {
        String[] suffix = fileName1.split("\\.");
        System.out.println(suffix[suffix.length - 1]);
    }
}
