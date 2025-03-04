package innerclass2;
//外部类
public class Outer {
    public static String name = "Outer";
    public  int age;
    //静态内部类：属于外部类本身持有
    public static class Inner{
        public void show(){
            System.out.println("show");
            //静态内部类中可以访问外部类静态成员
            System.out.println(name);
            //静态内部类中不可以访问外部类的实例成员
            //System.out.println(age);
        }
    }
}
