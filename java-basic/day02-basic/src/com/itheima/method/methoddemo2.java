package com.itheima.method;

public class methoddemo2 {
    public static void main(String[] args) {
        //调用写出来的方法
        print(10);
        print("hello");
        print(10,20);
        print("hello",20);
    }
    //定义一个方法，打印整数，学习方法重载
    public static void print(int a){
        System.out.println(a);
    }
    public static void print(String a){
        System.out.println(a);
    }
    public static void print(int a,int b){
        System.out.println(a+b);
    }
    public static void print(String a,int b){
        System.out.println(a+b);
    }
}
