package demo1;

import java.util.Scanner;


public class a7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogName = sc.next();
        String dogSex = sc.next();
        String dogColor = sc.next();
        String catName = sc.next();
        String catSex = sc.next();
        double catWeight = sc.nextDouble();
        // 通过有参构造函数实例化Dog类对象dog
        // dog调用talk()方法
        // dog调用eat()方法
        /********* begin *********/
        Dog dog = new Dog(dogName,dogSex,dogColor);
        dog.talk();
        dog.eat();
        /********* end *********/
        // 通过有参构造函数实例化Cat类对象cat
        // cat调用talk()方法
        // cat调用eat()方法
        /********* begin *********/
        Cat cat = new Cat(catName,catSex,catWeight);
        cat.talk();
        cat.eat();
        /********* end *********/
    }
}

// 抽象类Pet 封装属性name和sex
// 构造函数初始化name和sex
// 声明抽象方法talk()
// 声明抽象方法eat()
abstract class Pet {
    /********* begin *********/
    String name;
    String sex;
    public void Pet(String name,String sex){
        this.name = name;
        this. sex = sex;
    }
    abstract void talk();
    abstract void eat();
    /********* end *********/
}

// Dog类继承自Pet类 封装属性color
// 构造函数初始化name、sex和color
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，颜色：color，汪汪叫'
// eat()输出'name吃骨头'
class Dog extends Pet {
    /********* begin *********/
    private String color;
    public Dog(String name,String sex,String color){
        super.Pet(name,sex);
        this.color = color;
    }
    public void talk(){
        System.out.println("名称：" + this.name + "，性别：" + sex + "，颜色：" + color + "，汪汪叫");
    }
    public void eat(){
        System.out.println(name + "吃骨头!");
    }
    /********* end *********/
}

// Cat类继承自Pet类 封装属性weight
// 构造函数初始化name、sex和weight
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，体重：weight kg，喵喵叫'
// eat()输出'name吃鱼'
class Cat extends Pet {
    /********* begin *********/
    private double weight;
    public Cat(String name,String sex,double weight){
        super.Pet(name,sex);
        this.weight = weight;
    }
    public void talk(){
        System.out.println("名称：" + name + "，性别：" + sex + "，颜色：" + weight + "，喵喵叫");
    }
    public void eat(){
        System.out.println(name + "吃鱼！");
    }
    /********* end *********/
}