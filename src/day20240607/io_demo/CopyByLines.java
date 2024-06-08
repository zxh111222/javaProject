package day20240607.io_demo;

import java.io.*;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/8 18:07
 */
public class CopyByLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src/day20240607/io_demo/from.txt"));
            outputStream = new PrintWriter(new FileWriter("src/day20240607/io_demo/to.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                //System.out.println(l);
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
