package com.itheima.demo6tcp3;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下多发多收：服务端开发。支持多个客户端开发。
        System.out.println("服务端启动了...");
        // 1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket ss = new ServerSocket(9999);

        while (true) {
            // 2、调用accept方法，阻塞等待客户端连接，一旦有客户端链接会返回一个Socket对象
            Socket socket = ss.accept();
            System.out.println("一个客户端上线了：" + socket.getInetAddress().getHostAddress());
            // 3、把这个客户端管道交给一个独立的子线程专门负责接收这个管道的消息。
            new ServerReader(socket).start();
        }
    }
}
