package day20240605.exceptions;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/5 20:32
 */
public class Test {
    public static void main(String[] args) {
        // 1.java.lang.StackOverflowError
        /*m();*/

        // 2.java.lang.OutOfMemoryError
        /*String[] a = new String[1024 * 1024 *1024];*/

        // 3.java.lang.ArrayIndexOutOfBoundsException
        /*String[] a = new String[5];
        for (int i = 0; i <= 5; i++) {
            System.out.println(a[i]);
        }*/

        // 4.java.lang.NumberFormatException
        /*String a = "asdasd";
        System.out.println(Integer.parseInt(a));*/

        // 5.java.lang.ArithmeticException
        /*System.out.println(3/0);*/


    }


    public static void m(){
        m();
    }
}
