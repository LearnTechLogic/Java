package com.itheima.type;

public class typedemo1 {
    /**
     * 自动类型转换
     * 强制类型转换
     */
    public static void main(String[] args) {
        byte a=12;
        print1(a);
        print2(a);
        int b=10;
        print3((byte) b);//强制转换
    }
    public static void print1(int a){
        System.out.println(a);
    }
    public static void print2(double a){
        System.out.println(a);
    }
    public static void print3(byte a){
        System.out.println(a);
    }
}
