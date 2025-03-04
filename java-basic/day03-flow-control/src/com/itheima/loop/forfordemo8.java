package com.itheima.loop;

import java.util.Scanner;

public class forfordemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入几行：");
        int n = scanner.nextInt();
        System.out.print("请输入几列：");
        int m = scanner.nextInt();
        main1(n,m);
        main2(n);
    }
    public static void main1(int n,int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //打印乘法表
    public static void main2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
