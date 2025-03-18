package com.itheima.demo7tcp4;

import com.itheima.demo6tcp3.ServerReader;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        // 目标：BS架构的原理理解
        System.out.println("服务端启动了...");
        // 1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket ss = new ServerSocket(8080);

        // 创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 10, 10, TimeUnit.SECONDS
        , new ArrayBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            // 2、调用accept方法，阻塞等待客户端连接，一旦有客户端链接会返回一个Socket对象
            Socket socket = ss.accept();
            System.out.println("一个客户端上线了：" + socket.getInetAddress().getHostAddress());
            // 3、把这个客户端管道包装成一个任务交给线程池处理
            pool.execute(new ServerReaderRunnable(socket));
        }
    }
}
