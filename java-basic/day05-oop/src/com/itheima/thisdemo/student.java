package com.itheima.thisdemo;

public class student {
    String name;
    public void print(){
        //哪个对象调用这个方法，this就是哪个对象
        System.out.println(this);
    }
    public void printhobby(String name){
        System.out.println(this.name + "喜欢" + name);
    }
}
