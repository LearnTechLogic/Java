package com.itheima.operator;

public class operatordemo5 {
    public static void main(String[] args) {
        print1();
        print2();
    }
    //学习三元运算符，给出一段代码学习
    public static void print1() {
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);
    }
    //给一个嵌套的三元运算符，学习嵌套三元运算符
    public static void print2() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a > b ? a : b > c ? b : c;
        System.out.println(d);
    }
}
