package demo1;

public class a5 {
    public static void main(String[] args) {
        /********* begin *********/
        // 分别实例化Student类与Worker类的对象，并调用各自构造方法初始化类属性。
        Student2 s1 = new Student2("张三", 20, "学生");
        Worker w1 = new Worker("李四", 30, "工人");
        // 分别调用各自类中被复写的talk()方法 打印信息。
        s1.talk();
        w1.talk();
        /********* end *********/

    }
}

// 声明一个名为Person的抽象类，在Person中声明了三个属性name age occupation和一个抽象方法——talk()。
abstract class Person2 {
    /********* begin *********/
    public String name;
    public int age;
    public String occupation;
    abstract void talk();
    /********* end *********/
}

// Student类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Student2 extends Person2 {
    /********* begin *********/
    public Student2(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public void talk() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 职业：" + occupation);
    }

    /********* end *********/
}

// Worker类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Worker extends Person2 {
    /********* begin *********/
    public Worker(String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public void talk() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 职业：" + occupation);
    }
    /********* end *********/

}