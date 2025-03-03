package innerclass1;
//成员内部类
public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
        oi.show2();
        //1、成员内部类中可以直接访问外部类的静态成员，也可以直接访问外部类的实例成员
        //2、成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象:外部类名.this
    }

}
