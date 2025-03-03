package com.itheima.branch;

public class iftest2 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1() {
        boolean red = true;
        boolean yellow = false;
        boolean green = false;
        if (red) {
            System.out.println("stop");
        } else if (yellow) {
            System.out.println("caution");
        } else if (green) {
            System.out.println("go");
        } else {
            System.out.println("error");
        }
    }
}
