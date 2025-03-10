package com.itheima.demo6_lock;

// 取钱线程类
public class DrawThread extends Thread{
    private Account acc; // 记住线程对象要处理的账户对象。

    public DrawThread(String name, Account acc) {
        super(name);// 设置线程名称
        this.acc = acc;
    }

    @Override
    public void run() {
        // 小明 小红 取钱
        acc.drawMoney(100000);
    }
}
