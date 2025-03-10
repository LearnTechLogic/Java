package com.itheima.demo2threadapi;

public class ThreadApiDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚线程的常用方法。
        Thread t1 = new MyThread("1号线程");
        // t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName()); // 线程默认名称是：Thread-索引

        Thread t2 = new MyThread("2号线程");
        // t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); // 线程默认名称是：Thread-索引

        // 哪个线程调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread(); // 主线程
        m.setName("主线程");
        System.out.println(m.getName()); // main
    }
}

// 1、定义一个子类继承Thread类，成为一个线程类。
class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // public Thread(String name)
    }

    // 2、重写Thread类的run方法
    @Override
    public void run() {
        // 3、在run方法中编写线程的任务代码（线程要干的活儿）
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +"子线程输出：" + i);

        }
    }
}