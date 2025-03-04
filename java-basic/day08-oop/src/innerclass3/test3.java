package innerclass3;

import javax.swing.*;
import java.awt.event.ActionListener;

public class test3 {
    public static void main(String[] args) {
        JFrame win = new JFrame("登录窗口");
        JPanel panel = new JPanel();
        win.add(panel);
        JButton btn = new JButton("登录");
        panel.add(btn);
        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("登录");
            }
        });
        win.setVisible(true);
    }
}
