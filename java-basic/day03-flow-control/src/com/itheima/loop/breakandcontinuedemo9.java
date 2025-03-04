package com.itheima.loop;

public class breakandcontinuedemo9 {
    public static void main(String[] args) {
        main1(10);
    }
    //break 和 continue 的使用
    public static void main1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
