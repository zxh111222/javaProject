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


        // 新需求：
        // 支持排序 Dog[]（按体重 weight）
        // 支持排序 TV[]（按价格 price）
        // 支持排序 Room[]（按面积 area）
        // 以及任何其他类型...
        // 目标：让 MySortUtil 代码足够`稳定`，同时`可扩展`


    }
}
