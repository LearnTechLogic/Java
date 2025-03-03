package com.itheima.type;

public class typedemo2 {
    public static void main(String[] args) {
        System.out.println(print(1,2,3.14,'a'));
    }
    //接收各种类型的数据运算
    public static double print(int a,int b,double c,char r){

        System.out.println(a);
        return a+b+c+r;
    }
    public static int print(byte a,byte b){  //byte，short，char类型计算会转换成int类型
        return a+b;
    }
}
