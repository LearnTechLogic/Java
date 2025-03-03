package demo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //加油站支付小程序
        //1：创建卡片类，以便创建金卡或者银卡对象，封装车主数据
        //2：定义一个卡片父类：card
        //3:定义一个金卡类，继承父类card
        //4.创建金卡对象，交给一个独立的业务
        //5.创建银卡对象，交给一个独立的业务
        goldcard goldcard = new goldcard("苏A66666","张三","123456789",5000);
        silvercard silvercard = new silvercard("苏A88888","张三","123456789",5000);

        pay(goldcard);


    }

    //支付机：用一个方法来刷卡
    public static void pay(card card){
        System.out.println("请输入金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        //double money = new Scanner(System.in).nextDouble();
        card.consume(money);
        System.out.println("支付成功");
    }
}
