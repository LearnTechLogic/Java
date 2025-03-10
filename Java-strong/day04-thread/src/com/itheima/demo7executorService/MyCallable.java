package com.itheima.demo7executorService;

import java.util.concurrent.Callable;

// 1、定义一个实现类实现Callable接口
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    // 2、实现call方法，定义线程执行体
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() +"计算1-" + n + "的和是："  + sum;
    }
}
