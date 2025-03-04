package com.itheima.staticfield;

public class test {
    public static void main(String[] args) {
        student.name = "张三";

        student s1 = new student();
        s1.name = "李四";
        student s2 = new student();
        s2.name = "王五";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(student.name);

        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
