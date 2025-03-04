package com.itheima.scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        print();
    }
    //写一个键盘输入用户名和年龄的程序，然后打印出来
    /**
     * 打印用户输入的用户名和年龄
     * 此方法使用Scanner类从控制台获取用户的用户名和年龄输入，然后将这些信息打印到控制台
     * 不需要任何参数
     * 不返回任何值
     */
    public static void print() {
        // 创建Scanner对象以获取用户输入
        Scanner sc = new Scanner(System.in);

        // 提示用户输入用户名
        System.out.println("请输入用户名：");
        // 读取用户输入的用户名
        String name = sc.next();

        // 提示用户输入年龄
        System.out.println("请输入年龄：");
        // 读取用户输入的年龄
        int age = sc.nextInt();

        // 打印用户名和年龄
        System.out.println("用户名：" + name + "    年龄：" + age);
    }
}
