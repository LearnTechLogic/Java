package com.itheima.branch;

public class switchdemo4 {
    public static void main(String[] args) {

    }
    //switch不支持浮点数，所以不能使用switch判断浮点数
    //switch不支持double、float、long

    public static void switchdemo4() {
        /*double score = 90.5;
        switch (score) {
            case 90.5:
                System.out.println("优秀");
                break;
            case 80:
                System.out.println("良好");
                break;
            case 70:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }*/
    }
    //switch中的值不能重复，且只支持字面量，不支持变量
    public static void switchdemo5() {
        int score = 90;
        switch (score) {
            case 90:
                System.out.println("优秀");
                break;
            case 80:
                System.out.println("良好");
                break;
            case 70:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }
    //Switch要有break，否则会出现穿透现象
    public static void switchdemo6() {
        int score = 90;
        switch (score) {
            case 90:
                System.out.println("优秀");
            case 80:
                System.out.println("良好");
                break;
            case 70:
                System.out.println("及格");
            default:
                System.out.println("不及格");
        }
    }
}
