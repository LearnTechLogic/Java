package singleinstance;

public class test {
    public static void main(String[] args) {
        //设计单例类
        A a1 = A.a;
        A a2 = A.a;
        System.out.println(a1 == a2);
        A a3 = A.getInstance();
        A a4 = A.getInstance();

        B b1 = B.getInstance();
        B b2 = B.getInstance();
    }


}
