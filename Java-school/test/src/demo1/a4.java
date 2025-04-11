package demo1;

public class a4 {
    //声明一个名为Person的类，里面声明name与age两个属性，定义talk()方法返回姓名和年龄信息；
    //
    //声明一个名为Student的类，此类继承自Person类，添加school属性，声明带三个参数的构造方法，复写talk()方法，在该方法中调用父类的talk()方法，返回姓名、年龄和学校信息；
    //
    //实例化子类对象s，调用talk()方法打印我是：张三，今年：18岁，我在哈佛大学上学。

    public static void main(String[] args) {
        Student s = new Student("张三", 18, "哈佛大学");
        System.out.println(s.talk());
    }

}
class Person {
    String name;
    int age;

    public String talk() {
        return "我是：" + name + "，今年：" + age + "岁";
    }
}
class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String talk() {
        return super.talk() + "，我在" + school + "上学";
    }
}
