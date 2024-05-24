package day20240524.string_demo;

import day20240508.practice.MyUtil;

public class Test2 {

    public static void main(String[] args) {

        int[] is = {10, 1000, 10000, 100000, 300000, 500000};
        for (int i = 0; i < is.length; i++) {
            System.out.println("count=" + is[i]);
            //String '+'
            MyUtil.calculateTime(new StringPlus(is[i]));

            // StringBuffer append 方法
            MyUtil.calculateTime(new StringBufferAppend(is[i]));


            // StringBuilder append 方法
            MyUtil.calculateTime(new StringBuilderAppend(is[i]));

            System.out.println("=== === ===");
        }
    }
}
