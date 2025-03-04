package com.itheima.javabean;

public class test {
    public static void main(String[] args) {
        student s1 = new student("张三",90,20);
        studentoperator so = new studentoperator();
        so.print(s1);
        so.printavg(s1);
        studentoperator so2 = new studentoperator(s1);
        so2.print();
        so2.printavg();
    }
}
