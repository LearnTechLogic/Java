/**
 * 23030433
 * 赵新航
 * 冒泡排序和选择排序
 */

import java.util.Arrays;

public class maopaoxuanzepaixu {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        test1(arr);
        test2(arr);
    }
    public static void test1(int[] arr) {
       //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void test2(int[] arr) {
        //选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
