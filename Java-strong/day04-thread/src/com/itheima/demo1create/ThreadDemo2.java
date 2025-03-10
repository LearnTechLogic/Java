package com.itheima.demo1create;

import java.util.Scanner;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：实现Runnable接口来创建。
        // 3、创建线程任务类的对象代表一个线程任务。
        Runnable r = new MyRunnable();
        // 4、把线程任务对象交给一个线程对象来处理
        Thread t1 = new Thread(r); // public Thread(Runnable r)
//        Thread t1 = new Thread(r, "1号子线程"); // public Thread(Runnable r,String name)
        // 5、启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}

// 1、定义一个线程任务类实现Runnable接口
class MyRunnable implements Runnable {
    // 2、重写run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}
