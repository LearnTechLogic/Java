package demo1exception;

import java.util.Scanner;

public class ExcetionDemo6 {
    public static void main(String[] args) {
        double price = 0;
        while (true) {
            try {
                price = userInputPrice();
                System.out.println("用户成功的设置了定价：" + price);
                break;
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.print("用户输入的定价有误，请重新输入:");
            }
        }

    }

    public static double userInputPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入商品定价：");
        double price = sc.nextDouble();
        return price;
    }
}
