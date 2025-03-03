package com.itheima.array;

public class arraydemo1 {
    public static void main(String[] args) {

    }
    //开发一个随机点名的方法
    public static void randomName(){
        String[] names = {"张三","李四","王五","赵六","孙七"};
        int index = (int)(Math.random()*names.length);
        System.out.println(names[index]);
    }
}
