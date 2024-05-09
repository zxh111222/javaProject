package day20240508.practice;

public class Practice1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
