package com.itheima.thisdemo;

public class test {


    public static void main(String[] args) {
        student s1 = new student();
        s1.print();
        System.out.println(s1);
        student  s2 = new student();
        s2.name = "张三";
        s2.printhobby("打篮球");
    }

}
