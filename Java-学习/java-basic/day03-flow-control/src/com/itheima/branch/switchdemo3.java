package com.itheima.branch;

public class switchdemo3 {
    public static void main(String[] args) {
        switchdemo3();
    }
    //switch的应用，写法
    public static void switchdemo3() {
        int score = 80;
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("一般");
                break;
            case 6:
                System.out.println("差");
                break;
            default:
                System.out.println("未知");
        }
    }
}
