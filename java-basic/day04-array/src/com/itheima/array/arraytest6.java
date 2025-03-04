package com.itheima.array;

public class arraytest6 {
    public static void main(String[] args) {
        //目标：完成数字华容道的初始化和随机乱序
        int n = 5;
        start(n);
    }
    public static void start(int n ) {
        //定义一个二维数组存储数字列表
        int[][] arr = new int[n][n];
        int count = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = count;
                count++;
            }
        }
        printarray(arr);
        //打乱二维数组中的元素顺序
        shuffle(arr);
        System.out.println();
        printarray(arr);
    }
    public static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void shuffle(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int random = (int)(Math.random() * arr.length * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[random / arr.length][random % arr[i].length];
                arr[random / arr.length][random % arr[i].length] = temp;
            }
        }
    }
}
