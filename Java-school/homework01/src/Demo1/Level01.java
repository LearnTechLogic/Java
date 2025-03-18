package Demo1;

import java.util.Scanner;

public class Level01 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("请输入姓名：");
    String name = scanner.nextLine();

        System.out.println("请输入年龄：");
    int age = scanner.nextInt();
        scanner.nextLine(); // 读取换行符

        System.out.println("请输入性别：");
    String gender = scanner.nextLine();

        System.out.println("请输入体重：");
    double weight = scanner.nextDouble();
        scanner.nextLine(); // 读取换行符

        System.out.println("请输入地址：");
    String address = scanner.nextLine();

        System.out.println("请输入是否已婚：");
    boolean isMarried = scanner.nextBoolean();

        System.out.println("\n信息如下：");
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age + "岁");
        System.out.println("性别: " + gender);
        System.out.println("体重: " + weight + "kg");
        System.out.println("地址: " + address);
        System.out.println("婚否: " + (isMarried ? "是" : "否"));
    }
}
