package com.itheima.javabean;

public class studentoperator {
    private student s;
    private int a;

    public studentoperator() {
    }

    public studentoperator(student s) {
        this.s = s;
    }
    //提供方法：打印学生对象的总成绩
    public void print(student s) {
        System.out.println(s.getName() + "的总成绩为：" + (s.getChinese() + s.getMath()));
    }
    //提供方法：打印学生的平均成绩
    public void printavg(student s) {
        System.out.println(s.getName() + "的平均成绩为：" + (s.getChinese() + s.getMath()) / 2);
    }
    public void printavg() {
        System.out.println(s.getName() + "的平均成绩为：" + (s.getChinese() + s.getMath()) / 2);
    }
    public void print() {
        System.out.println(s.getName() + "的总成绩为：" + (s.getChinese() + s.getMath()));
    }
}
