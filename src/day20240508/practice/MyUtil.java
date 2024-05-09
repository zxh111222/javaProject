package day20240508.practice;

public class MyUtil {
    public static void calculateTime(Algorithm algorithm) {
        long startTime = System.nanoTime();

        algorithm.algorithm();

        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }

}
