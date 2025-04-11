package demo1;

public class a3 {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student1 s = new Student1();
        s.show();
        /********* end *********/
    }
}
class Person1 {
    /********* begin *********/
    public String name;
    public int age;
    public Person1(String name,int age){
        this.name = name;
        this.age = age;
    }
    /********* end *********/
}

class Student1 extends Person1 {
    /********* begin *********/
    public String school;
    public Student1(){
        super("张三",18);
        school ="哈佛大学";
    }
    public void show(){
        System.out.println("姓名；"+ name + "，年龄：" + age +"，学校：" + school);
    }
    /********* end *********/
}
