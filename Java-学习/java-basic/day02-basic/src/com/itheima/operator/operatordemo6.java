package com.itheima.operator;

public class operatordemo6 {
    public static void main(String[] args) {
        print1();
    }
    //学习逻辑运算符，给出一段代码学习，四种运算符的使用
    public static void print1(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a>b && c>d);
        System.out.println(a>b || c>d);
        System.out.println(!(a>b));
        System.out.println(a>b ^ c>d);
        //非短路运算符
        System.out.println(a>b & c++>d);
        System.out.println(a>b | c++>d);
    }
}
