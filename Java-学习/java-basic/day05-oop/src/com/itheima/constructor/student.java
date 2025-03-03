package com.itheima.constructor;

public class student {
    String name;
    int age;
    char sex;
    //构造器，名称必须是类名，没有返回值类型，可以重载
    public student() {
        System.out.println("student()");
    }
    //有参数的构造器
    public student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + this.age);
    }
    public student(String name) {
        System.out.println("student(int age,String name)");
    }
}
