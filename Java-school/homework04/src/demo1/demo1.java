/**
 * 23软二
 * 23030433
 * 赵新航
 * 计算长方体的体积和表面积
 */
package demo1;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长、宽、高");
        double length = 0;
        double width = 0;
        double height = 0;
        while (length<=0||width<=0||height<=0) {
           length = sc.nextDouble();
           width = sc.nextDouble();
           height = sc.nextDouble();

        }

        Cuboid cuboid = new Cuboid(length,width,height);
        System.out.println("长方体的体积为："+cuboid.volume());
        System.out.println("长方体的表面积为："+cuboid.area());
    }
}
