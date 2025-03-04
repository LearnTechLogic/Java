package gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        //入门JFrame
        //创建一个窗口，有一个输入窗，一个登录按钮
        JFrame win = new JFrame("登录窗口");

        JPanel p = new JPanel();
        win.add(p);

        win.setSize(800, 600);//设置窗口大小
        win.setLocationRelativeTo(null);//设置窗口居中
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭窗口，程序退出

        JButton btn = new JButton("登录");//创建一个按钮
        btn.setBounds(10, 10, 10, 10);//设置按钮位置和尺寸
        p.add(btn);//将按钮添加到面板上

        win.setVisible(true);//设置窗口可见
    }
}
