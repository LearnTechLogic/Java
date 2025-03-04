package com.itheima.loop;

public class deadfordemo7 {
    public static void main(String[] args) {
        main1();
        main2();
    }
    // 死循环
    public static void main1() {
        for (; ; ) {
            System.out.println("helloworld");
        }
    }
    public static void main2() {
        while(true) {
            System.out.println("helloworld");
        }
    }
}
