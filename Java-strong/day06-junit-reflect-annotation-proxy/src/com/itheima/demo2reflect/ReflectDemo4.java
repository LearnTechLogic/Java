package com.itheima.demo2reflect;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        // 目标：搞清楚反射的应用：做框架的通用技术。
        Dog d = new Dog("小黑", 3);
        SaveObjectFrameWork.saveObject(d);

        // 创建学生对象
        Student s = new Student("小明", 18, "爱问问题");
        SaveObjectFrameWork.saveObject(s);

        // 创建老师对象
        Teacher t = new Teacher("小红", 19, "java、前端、动漫", 3000, "422期", '女', "12345678901");
        SaveObjectFrameWork.saveObject(t);

    }
}
