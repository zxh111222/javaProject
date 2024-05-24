package day20240508.practice;

public class MyUtil {
    public static void calculateTime(Algorithm algorithm) {
        long startTime = System.currentTimeMillis();

        algorithm.algorithm();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

}
