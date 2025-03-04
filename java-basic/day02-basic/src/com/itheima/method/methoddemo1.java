package com.itheima.method;

public class methoddemo1 {
    public static void main(String[] args) {
       int sum = getSum(10,20);
        System.out.println(sum);
        //调用getCode方法
        String code = getCode(6);
        System.out.println(code);
    }
    //定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a,int b){
        //int sum = a+b;
        return a+b;
    }
    //获取一个指定位数的验证码放回
    public static String getCode(int length){
        String code = "";
        for (int i = 0; i < length; i++) {
            int number = (int)(Math.random()*10);
            code += number;
        }
        return code;
    }
}
