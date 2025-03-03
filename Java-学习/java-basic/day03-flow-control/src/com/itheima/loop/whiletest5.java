package com.itheima.loop;

import java.util.Scanner;

public class whiletest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        main1(n);
        main2();
    }
    //复利计算：本金10万，复利1.7%，请问多少年之后本金翻倍
    public static void main1(int n) {
        double money = 100000;
        double rate = 0.017;
        int year = 0;
        while (money < 200000) {
            money = money * (1 + rate);
            year++;
        }
        System.out.println("第" + year + "年，本金翻倍");
    }
    public static void main2() {
        double money = 8848860;
        double height = 0.1;
        int n = 0;
        while (height < money){
            height = height * 2;
            n++;
        }
        System.out.println("第" + n + "次，一样高");
    }
}
