package day20240508.practice;

import java.util.Arrays;

public class Bubble extends Algorithm{

    @Override
    public void algorithm() {
        int arr[] = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }



}
