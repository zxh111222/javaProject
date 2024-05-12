package day20240512.p;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 7, 1, 9, 5, 3, 8, 6};
        MySortUtil.sort(arr);
        MySortUtil.print(arr);

        int size = 4;
        Student[] studentArr = new Student[size];
        for (int i = 0; i < size; i++) {
            studentArr[i] = new Student("编号-" + i, 23 - i);
        }
        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr);
        MySortUtil.print(studentArr);
    }
}
