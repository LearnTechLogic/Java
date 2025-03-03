package com.itheima.operator;

public class operatordemo2 {
    public static void main(String[] args) {
        print1();
    }
    //写一个代码来研究自增自减
    public static void print1(){
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        int c = ++a;
        System.out.println(a);
        System.out.println(c);
        int d = a--;
        System.out.println(a);
        System.out.println(d);
        int e = --a;
        System.out.println(a);
        System.out.println(e);

    }
}

