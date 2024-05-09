package day20240508.practice;

public class Test {
    public static void main(String[] args) {
        Algorithm sum100 = new Sum100();
        MyUtil.calculateTime(sum100);

        System.out.println("=== === ===");

        Algorithm bubbleSort = new Bubble();
        MyUtil.calculateTime(bubbleSort);

        System.out.println("=== === ===");

        Algorithm linearSearch = new LinearSearch();
        MyUtil.calculateTime(linearSearch);

        System.out.println("=== === ===");

        Algorithm binarySearch = new BinarySearch();
        MyUtil.calculateTime(binarySearch);
    }
}
