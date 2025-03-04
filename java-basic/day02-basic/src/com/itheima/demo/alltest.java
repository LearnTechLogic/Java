package com.itheima.demo;

import java.util.Scanner;

public class alltest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 用户输入个人信息
        System.out.print("请输入您的身高（米）：");
        double height = scanner.nextDouble();

        System.out.print("请输入您的体重（公斤）：");
        double weight = scanner.nextDouble();

        System.out.print("请输入您的性别（男/女）：");
        String gender = scanner.next();

        System.out.print("请输入您的年龄（岁）：");
        int age = scanner.nextInt();

        // 计算BMI
        double bmi = calculateBMI(weight, height);
        System.out.println("您的BMI值为：" + bmi);
        System.out.println(getBMIDescription(bmi));

        // 计算BMR
        double bmr = calculateBMR(weight, height, age, gender);
        System.out.println("您的基础代谢率为：" + bmr + " 千卡/天");
        System.out.println(getBMRSuggestion(bmr, gender));

        scanner.close();
    }

    // 计算BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // 根据BMI值给出描述
    public static String getBMIDescription(double bmi) {
        if (bmi < 18.5) {
            return "体重过轻";
        } else if (bmi < 24.9) {
            return "正常体重";
        } else if (bmi < 29.9) {
            return "超重";
        } else {
            return "肥胖";
        }
    }

    // 计算BMR
    public static double calculateBMR(double weight, double height, int age, String gender) {
        // 将身高从米转换为厘米
        height *= 100;
        if (gender.equalsIgnoreCase("男")) {
            return 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (gender.equalsIgnoreCase("女")) {
            return 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            throw new IllegalArgumentException("性别输入错误，请输入男或女");
        }
    }

    // 根据BMR值给出建议
    public static String getBMRSuggestion(double bmr, String gender) {
        if (gender.equalsIgnoreCase("男")) {
            if (bmr < 1600) {
                return "建议增肌";
            } else if (bmr > 2000) {
                return "建议减脂";
            } else {
                return "体重正常，保持当前饮食和运动";
            }
        } else if (gender.equalsIgnoreCase("女")) {
            if (bmr < 1200) {
                return "建议增肌";
            } else if (bmr > 1600) {
                return "建议减脂";
            } else {
                return "体重正常，保持当前饮食和运动";
            }
        } else {
            throw new IllegalArgumentException("性别输入错误，请输入男或女");
        }
    }
}
