package innerclass2;
//静态内部类
public class InnerClassDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚静态内部类的语法
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        //1、静态内部类中可以访问外部类静态成员
    }
}
