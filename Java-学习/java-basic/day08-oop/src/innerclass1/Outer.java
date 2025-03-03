package innerclass1;

public class Outer {
    public static String name = "Outer";
    public  int age;
    //成员内部类：无static修饰，属于外部类的对象持有
    public class Inner{
        //private String name;
        public void show(){
            System.out.println("show");
        }
        public void show2(){
            System.out.println("show2");
            System.out.println(name);
            System.out.println(age);
        }




    }
}
