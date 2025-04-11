package demo2;

import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        //编写测试类MathTest，输入4个int类型数值，7个double类型数值；
        //
        //分别输出第一个数的平方根，
        // 第二个数的立方根，
        // 第三个数的第四个数次方，
        // 第五个数和第六个数的最大值、最小值，
        // 第七个数的绝对值，
        // 第八个数的ceil值，
        // 第九个数的floor值，
        // 第十个数的rint值，
        // 第十一个数的round值。
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        double a5 = sc.nextDouble();
        double a6 = sc.nextDouble();
        double a7 = sc.nextDouble();
        double a8 = sc.nextDouble();
        double a9 = sc.nextDouble();
        double a10 = sc.nextDouble();
        double a11 = sc.nextDouble();
        System.out.println(Math.sqrt(a1));
        System.out.println(Math.cbrt(a2));
        System.out.println(Math.pow(a3,4));
        System.out.println(Math.max(a4,a5));
        System.out.println(Math.min(a6,a7));
        System.out.println(Math.abs(a8));
        System.out.println(Math.ceil(a9));
        System.out.println(Math.floor(a10));
        System.out.println(Math.rint(a11));
        System.out.println(Math.round(a11));
    }
}
