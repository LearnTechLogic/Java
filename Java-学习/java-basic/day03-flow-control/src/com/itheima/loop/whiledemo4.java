package com.itheima.loop;

import java.util.Scanner;

public class whiledemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        main1(n);
    }
    //认识while写法
    public static void main1(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("hello world");
            i++;
        }
    }
}
