package day20240607.io_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/8 18:13
 */
public class IOCommonFlow {
    public static void main(String[] args) {
        // 之前的 `CopyBytes` 代码
        //FileInputStream in = new FileInputStream("src/day240607/io_demo/file.txt");
        // 可以传入 `文件路径` 给 FileInputStream 构造器
        // 点进源码会发现，内部用这个 `文件路径` new 了 File 对象

        // 所以，以`文件&输入流`为例子，它的通用流程是：
        // 1. new File，即：数据源（这里以文件为例，`流`的数据源也可以是其他，如：URL...）
        File file = new File("src/day20240607/io_demo/file.txt");
        FileInputStream fis = null;
        try {
            // 2. 找一根 `管子` 接上去，即：`流`
            fis = new FileInputStream(file);

            // 3. 打开开关，让`东西`流出来
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
                //System.out.println("--- --- ---");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            // 4. 关闭 `流`
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
