package demo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统
        //角色：设备（吊灯，电视剧，洗衣机，落地窗。。。）
       //具体功能：开关
       //谁控制他们：智能控制系统（单例对象），控制调用设备的开关
        //1、定义设备类：创建设备对象代表家里的设备
        //2、准备这些设备对象，放到数组中，代表整个家庭的设备
        JD[] jds = new JD[4];
        jds[0] = new TV("小米电视",true);
        jds[1] = new WashMachine("美的洗衣机",false);
        jds[2] = new Lamp("落地灯",true);
        jds[3] = new Air("美的空调",false);

        //3、为每个设备制定一个开和关的功能，定义一个接口，让JD实现开和关功能
        //4、创建智能控制系统对象，控制设备开和关
        SmartHomeControl control = SmartHomeControl.getInstance();
        //5、处理电视剧
        control.control(jds[0]);
        //6、提示用户操作，a、展示全部设备的当前情况。b、让用户选择哪一操作。
        while (true) {
            SmartHomeControl.printAllStatus(jds);
            System.out.println("请输入您要操作的设备序号：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    control.control(jds[0]);
                    break;
                case "2":
                    control.control(jds[1]);
                    break;
                case "3":
                    control.control(jds[2]);
                    break;
                case "4":
                    control.control(jds[3]);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }

    }
}
