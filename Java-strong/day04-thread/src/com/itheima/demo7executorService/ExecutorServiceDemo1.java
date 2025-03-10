package com.itheima.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        // 目标：创建线程池对象来使用。
        // 1、使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
               Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        // 2、使用线程池处理任务！看会不会复用线程？
        Runnable target = new MyRunnable();
        pool.execute(target); // 提交第1个任务 创建第1个线程 自动启动线程处理这个任务
        pool.execute(target); // 提交第2个任务 创建第2个线程 自动启动线程处理这个任务
        pool.execute(target); // 提交第2个任务 创建第3个线程 自动启动线程处理这个任务
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target); // 到了临时线程的创建时机了
        pool.execute(target); // 到了临时线程的创建时机了
        pool.execute(target); // 到了任务拒绝策略了，忙不过来

        // 3、关闭线程池 ：一般不关闭线程池。
        // pool.shutdown(); // 等所有任务执行完毕后再关闭线程池！
//        pool.shutdownNow(); // 立即关闭，不管任务是否执行完毕！
    }
}
