package com.itheima.variable;

public class variabledemo1 {
    public static void main(String[] args) {
        //目标：认识变量
        printliteral();
    }
    //定义一个方法，来学习变量的定义
    public static void printliteral(){
        //变量的定义
        //数据类型 变量名 = 值;
        int age = 18;
        System.out.println(age);
        age = 19;
        System.out.println(age);
        age = 20;
        System.out.println(age);
        //定义一个小数变量，存储java成绩
        double score = 99.5;
        System.out.println(score);
        System.out.println("=================");
        //研究变量的特点
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        a=a+10;
        b=b+10;
        System.out.println(a);
        System.out.println(b);
        System.out.println("=================");
        //需求：微信钱包目前有9.9，发出去5元，又收到6元，请实时输出钱包金额
        double money = 9.9;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
        money = money + 6;
        System.out.println(money);
        System.out.println("=================");
    }
}
