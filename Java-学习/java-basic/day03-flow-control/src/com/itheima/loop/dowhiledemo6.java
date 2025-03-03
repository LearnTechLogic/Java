package com.itheima.loop;

import java.util.Scanner;

public class dowhiledemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        main1(n);
    }
    //学习do while的写法
    public static void main1(int n) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
