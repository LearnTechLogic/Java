package StoneDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// 自定义窗口类，创建对象，展示一个主窗口。
public class MainFrame extends JFrame {
    // 设置图片位置
    private static final String imagePath = "StoneDemo/image/";
    // 准备一个数组，用户存储数字色块的行列位置: 4行4列
    private int[][] imageData = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    // 定义一个二维数组，用来存储最终游戏成功的数据顺序。
    private int[][] winData = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // 定义两个整数变量记录当前空白色块的位置。
    private int row; // 行索引
    private int col; // 列索引
    private int count; // 统计总共移动的步数。

    public MainFrame() {
        // 1、调用一个初始化方法：初始化窗口大小等信息。
        initFrame();
        // 4、打乱数组色块的顺序，再展示图片
        initRandomArray();
        // 2、初始化界面：展示数字色块。
        initImage();
        // 3、初始化系统菜单：点击弹出菜单信息是系统退出，重启游戏
        initMenu();
        // 5、给当前窗口绑定上下左右按键事件。
        initKeyPressEvent();
        // 设置窗口的显示
        this.setVisible(true);
    }

    private void initKeyPressEvent() {
        // 给当前窗口绑定上下左右按键事件。
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取当前按钮的编号
                int keyCode = e.getKeyCode();
                // 判断这个编号是否是上下左右的按键
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        // 用户按了上键，让图片向上移动。
                        switchAndMove(StoneDemo.Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        // 用户按了下键，让图片向下移动。
                        switchAndMove(StoneDemo.Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        // 用户按了左键，让图片向左移动。
                        switchAndMove(StoneDemo.Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        // 用户按了右键，让图片向右移动。
                        switchAndMove(StoneDemo.Direction.RIGHT);
                        break;
                }
            }
        });
    }

    // 控制数据交换，和图片移动。
    private void switchAndMove(StoneDemo.Direction r){
        // 判断图片的方向，再控制图片移动
        switch (r) {
            case UP:
                // 上交换的条件是行必须 < 3，然后才开始交换.
                if(row < imageData.length - 1){
                    // 当前空白色块位置：rol  col
                    // 需要被交换的位置：row + 1  col
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row + 1][col];
                    imageData[row + 1][col] = temp;
                    // 更新当前空白色块的位置了。
                    row++;
                    count++;
                }
                break;
            case DOWN:
                if(row > 0){
                    // 当前空白色块位置：rol  col
                    // 需要被交换的位置：row - 1  col
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row - 1][col];
                    imageData[row - 1][col] = temp;
                    // 更新当前空白色块的位置了。
                    row--;
                    count++;
                }
                break;
            case LEFT:
                // 左交换的条件是空白色块的列必须小于3
                if(col < imageData.length - 1){
                    // 当前空白色块位置：rol  col
                    // 需要被交换的位置：row   col + 1
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col + 1];
                    imageData[row][col + 1] = temp;
                    // 更新当前空白色块的位置了。
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                if(col > 0){
                    // 当前空白色块位置：rol  col
                    // 需要被交换的位置：row   col - 1
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col - 1];
                    imageData[row][col - 1] = temp;
                    // 更新当前空白色块的位置了。
                    col--;
                    count++;
                }
                break;
        }
        // 重新刷新界面！！！
        initImage();
    }

    private void initRandomArray() {
        // 打乱二维数组中的元素顺序
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                // 随机两个行列位置，让这两个位置交换。
                int i1 = (int) (Math.random() * imageData.length);
                int j1 = (int) (Math.random() * imageData.length);

                int i2 = (int) (Math.random() * imageData.length);
                int j2 = (int) (Math.random() * imageData.length);

                int temp = imageData[i1][j1];
                imageData[i1][j1] = imageData[i2][j2];
                imageData[i2][j2] = temp;
            }
        }

        // 定位空白色块的位置。
        // 去二维数组中遍历每个数据，只要发现这个数据等于0，这个位置就是当前空白色块的位置。
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] == 0) {
                    // 定位到空白色块的位置。
                    row = i;
                    col = j;
                    break OUT; // 跳出循环。
                }
            }
        }
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar(); // 创建一个菜单条
        JMenu menu = new JMenu("系统"); // 创建一个菜单
        JMenuItem exitJi = new JMenuItem("退出");
        menu.add(exitJi); // 添加一个菜单项
        exitJi.addActionListener(e -> {
            dispose(); // 销毁！
        });
        // 添加一个菜单，重启
        JMenuItem restartJi = new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
             // 重启游戏: 从新打乱二维数组重的顺序。重新刷新界面。
            initRandomArray();
            initImage();
        });
        menuBar.add(menu); // 添加到菜单条中
        this.setJMenuBar(menuBar);
    }

    private void initImage() {
        // 先清空窗口上的全部图层
        this.getContentPane().removeAll();

        // 刷新界面时，可以给界面显示步数：
        // 给窗口添加一个展示文字的组件
        JLabel countTxt = new JLabel("当前移动" + count +"步");
        countTxt.setBounds(20, 20, 100, 20);
        // 把文字展示成红色
        countTxt.setForeground(Color.RED);
        // 加粗
        countTxt.setFont(new Font("楷体", Font.BOLD, 12));
        this.add(countTxt);

        // 判断是否赢了
        if(isWin()){
            // 展示胜利的图片
            JLabel label = new JLabel(new ImageIcon(imagePath + "win.png"));
            label.setBounds(124, 230, 266, 88);
            this.add(label);
        }

        // 1、展示一个行列矩阵的图片色块依次铺满窗口（4 * 4）
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                // 拿到图片的名称
                String imageName = imageData[i][j] + ".png";
                // 2、创建一个JLabel对象，设置图片给他展示。
                JLabel label = new JLabel();
                // 3、设置图片到label对象中去。
                label.setIcon(new ImageIcon( imagePath + imageName));
                // 4、设置图片位置展示出来
                label.setBounds(20 + j * 100,60 + i * 100, 100, 100);
                // 5、把这个图片展示到窗口上去
                this.add(label);
            }
        }

        // 设置窗口的背景图片
        JLabel background = new JLabel(new ImageIcon(imagePath + "background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);

        // 刷新新图层,重新绘制
        this.repaint();
    }

    private boolean isWin() {
        // 判断游戏二维数组和赢了之后的二维数组的内容是否一样，只要有一个位置处的数据不一样，说明没有赢
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if(imageData[i][j] != winData[i][j]){
                    return false;
                }
            }
        }
        // 赢了
        return true;
    }

    private void initFrame() {
        // 设置窗口的标题
        this.setTitle("石子迷宫 V 1.0 dlei");
        // 设置窗口的宽高
        this.setSize(465,575);
        // 设置窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口的居中显示
        this.setLocationRelativeTo(null);
        // 设置布局方式为绝对位置定位
        this.setLayout(null);
    }
}
