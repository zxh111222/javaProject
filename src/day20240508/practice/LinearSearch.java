package day20240508.practice;

public class LinearSearch extends Algorithm{

    public void algorithm() {
        int arr[] = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        int target = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i); // 如果找到目标元素，则返回其索引
            }
        }


    }

}
