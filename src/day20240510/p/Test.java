package day20240510.p;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 7, 1, 9, 5, 3, 8, 6};
        // 需求：支持排序 int[]
        MySortUtil.sort(arr);
        MySortUtil.print(arr);

        // 新需求：支持排序 Student[]
        int size = 5;
        Student[] studentArr = new Student[size];
        for (int i = 0; i < size; i++) {
            studentArr[i] = new Student("编号-" + i, 23 - i);
        }
        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr);
        MySortUtil.print(studentArr);
    }
}
