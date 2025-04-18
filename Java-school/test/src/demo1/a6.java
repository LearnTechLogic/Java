package demo1;

public class a6 {
    public static void main(String[] args) {
        // 实例化一Student的对象s，并调用talk()方法，打印信息
        /********* begin *********/
        Student6 student = new Student6();
        student.talk();
        /********* end *********/

    }
}

// 声明一个Person接口，并在里面声明三个常量：name、age和occupation，并分别赋值，声明一抽象方法talk()
interface Person6 {
    /********* begin *********/
    public String name = "张三";
    public int age = 18;
    public String occupation = "学生";
    abstract void talk();
    /********* end *********/
}

// Student类继承自Person类 复写talk()方法返回姓名、年龄和职业信息
class Student6 implements Person6 {
    /********* begin *********/

    public void talk(){
        System.out.println(occupation +"——>姓名：" + name + "，年龄：" + age + "，职业：" + occupation +"！");
    }
    /********* end *********/
}
