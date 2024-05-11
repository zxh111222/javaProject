package day20240510.newP;

public class MySortUtil {
    public static void sort(EntitySort entitySort, Entity[] arr) {
        entitySort.print(arr);
        entitySort.startSort(arr);
        entitySort.print(arr);
    }

}
