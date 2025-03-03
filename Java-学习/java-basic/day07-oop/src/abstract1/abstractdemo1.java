package abstract1;

public class abstractdemo1 {
    public static void main(String[] args) {
        //抽象类不能创建对象
        //A a = new A();报错
        //抽象类的使命就是被继承

        B b = new B();
        b.setAge(18);
    }
}
