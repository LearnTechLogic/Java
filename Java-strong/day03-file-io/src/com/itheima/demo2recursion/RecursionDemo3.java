package com.itheima.demo2recursion;

public class RecursionDemo3 {
    public static void main(String[] args) {
        // 目标：递归解决猴子吃桃问题。
        // 公式：
        //       f(n + 1) =  f(n) - f(n) / 2 - 1
        // 变形： 2f(n + 1) = 2f(n) - f(n) - 2
        // 变形： f(n) = 2f(n + 1) + 2

        // 终结点： f(10) = 1

        // 递归的方向: 没有问题的

        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
    }

    public static int f(int n) {
        if (n == 10) {
            return 1;
        } else {
            return 2 * f(n + 1) + 2;
        }
    }
}
