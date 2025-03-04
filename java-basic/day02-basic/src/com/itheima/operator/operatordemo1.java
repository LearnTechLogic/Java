package com.itheima.operator;

public class operatordemo1 {
    public static void main(String[] args) {
        //算术运算符
        // + - * / %
        //逻辑运算符
        // && || !
        //关系运算符
        // > < >= <= == !=
        //位运算符
        // & | ^ << >> >>>
        //赋值运算符
        // = += -= *= /= %=
        //其他运算符
        // ++ --
        // instanceof
        // .
        print1();
        print2();
    }
    //写一些代码来了解算数运算符
    public static void print1() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);
    }
    //写一段代码来了解+
    public static void print2() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        String d = "hello";
        String e = "world";
        String f = d + e;
        System.out.println(f);
        String g = d + b;
        System.out.println(g);
        String h = a + b + d;
        System.out.println(h);
        String i = d +a + b;
    }
}
