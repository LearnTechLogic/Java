package com.itheima.array;

public class arraydemo3 {
    public static void main(String[] args) {
        int[] arr = {20, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printMaxAndMin(arr);
    }
    //数组求最值
    public static void printMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            if (data > max) {
                max = arr[i];
            }
            if (data < min) {
                min = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
