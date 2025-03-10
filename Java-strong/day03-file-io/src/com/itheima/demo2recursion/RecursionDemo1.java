package com.itheima.demo2recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        // 目标：认识递归的形式。
        printA();
    }

    public static void printA() {
        System.out.println("===A执行了===");
        printA(); // 直接递归：自己调用自己  .  递归可能出现死循环，导致出现栈内存溢出现象。
    }
}
