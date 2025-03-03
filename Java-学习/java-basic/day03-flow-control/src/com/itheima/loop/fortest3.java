package com.itheima.loop;

import java.util.Scanner;

public class fortest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        main1(n);
        main2(n);
    }
    //for循环求奇数和
    public static void main1(int n) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    //for循环求偶数和
    public static void main2(int n) {
        int sum = 0;
        for (int i = 1; i <= 100; i+=2) {
                sum += i;
        }
        System.out.println(sum);
    }
}
