package com.itheima.loop;

import java.util.Scanner;

public class fortest2 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System .in);
        // 用户输入一个正整数n
        System.out.print("请输入一个正整数n：");
        int n = sx.nextInt();
        fortest2(n);
    }
    //for循环进行求和
    public static void fortest2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
