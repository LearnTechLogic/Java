package com.itheima.operator;

public class operatordemo3 {
    public static void main(String[] args) {
        print1();
    }
    //学习赋值运算符，出给示例进行学习，写一代码
    public static void print1() {
        int a = 10;
        a += 10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);
        System.out.println("=================");
    }
}
