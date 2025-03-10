package com.itheima.demo6_lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId; // 卡号
    private double money; // 余额
    private final Lock lk = new ReentrantLock(); // 保护锁对象

    // 小明和小红都到这里来了取钱
    public void drawMoney(double money) {
        // 拿到当前谁来取钱。
        String name = Thread.currentThread().getName();
        lk.lock(); // 上锁
        try {
            // 判断余额是否足够
            if (this.money >= money) {
                // 余额足够，取钱
                System.out.println(name + "取钱成功，吐出了" + money + "元成功！");
                // 更新余额
                this.money -= money;
                System.out.println(name + "取钱成功，取钱后，余额剩余" + this.money + "元");
            } else {
                // 余额不足
                System.out.println(name + "取钱失败，余额不足");
            }
        } finally {
            lk.unlock();// 解锁
        }
    }
}
