package com.itheima.demo2reflect;

public class Dog {
    private String name;
    private int age;
    private String hobby;
    private Dog() {
        System.out.println("无参数构造器执行了~~");
    }
    private Dog(String name) {
        System.out.println("1个参数有参数构造器执行了~~");
        this.name = name;
    }
    public Dog(String name, int age) {
        System.out.println("2个参数有参数构造器执行了~~");
        this.name = name;
        this.age = age;
    }

    private void eat(){
        System.out.println("狗吃骨头！");
    }

    public String eat(String name){
        System.out.println("狗吃" + name);
        return "狗说：谢谢！谢谢！汪汪汪！";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
