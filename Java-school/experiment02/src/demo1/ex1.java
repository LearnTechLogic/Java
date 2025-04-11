/*
23软二
赵新航
23030433
复数计算
 **/
package demo1;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个复数：");
        System.out.print("请输入第一个复数实部：");
        double real1 = sc.nextDouble();
        System.out.print("请输入第一个复数虚部：");
        double imaginary1 = sc.nextDouble();
        System.out.print("请输入第二个复数实部：");
        double real2 = sc.nextDouble();
        System.out.print("请输入第二个复数虚部：");
        double imaginary2 = sc.nextDouble();
        //判断是否输入正确
        while(real1 == 0 && imaginary1 == 0){
            System.out.println("请重新输入第一个复数！");
            System.out.print("请输入第一个复数实部：");
            real1 = sc.nextDouble();
            System.out.print("请输入第一个复数虚部：");
            imaginary1 = sc.nextDouble();
        }
        while(real2 == 0 && imaginary2 == 0){
            System.out.println("请重新输入第二个复数！");
            System.out.print("请输入第二个复数实部：");
            real2 = sc.nextDouble();
            System.out.print("请输入第二个复数虚部：");
            imaginary2 = sc.nextDouble();
        }
        complex c1 = new complex(real1, imaginary1);
        complex c2 = new complex(real2, imaginary2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.subtract(c2));
        System.out.println("c1 * c2: " + c1.multiply(c2));
        System.out.println("c1 / c2: " + c1.divide(c2));
    }
}

