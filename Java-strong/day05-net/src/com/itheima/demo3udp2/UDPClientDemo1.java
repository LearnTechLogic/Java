package com.itheima.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
// 都听的懂，但是记不住！
public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：完成UDP通信多发多收：客户端开发
        System.out.println("===客户端启动==");
        // 1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket(); // 随机端口

        Scanner sc = new Scanner(System.in);
        while (true) {
            // 2、创建数据包对象封装要发送的数据。(韭菜盘子)
            System.out.println("请说：");
            String msg = sc.nextLine();

            // 如果用户输入的是 exit，则退出
            if ("exit".equals(msg)) {
                System.out.println("===客户端退出==");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(), 8080);

            // 3、让发送端对象发送数据包的数据
            socket.send(packet);
        }

    }
}
