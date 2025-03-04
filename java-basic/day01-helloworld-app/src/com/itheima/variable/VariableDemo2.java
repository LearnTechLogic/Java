package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        printPrimitiveType();
    }
    //帮我设计一个方法，打印出8种基本数据类型定义的变量
    public static void printPrimitiveType(){
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'a';
        boolean b2 = true;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b2);
    }
}
