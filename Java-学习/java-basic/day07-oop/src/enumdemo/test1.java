package enumdemo;

public class test1 {
    public static void main(String[] args) {
        A a1=A.x;
        System.out.println(a1);

        A a2=A.y;
        System.out.println(a2);

        System.out.println(a1.name());
        System.out.println(a1.ordinal());
        System.out.println(a2.name());
        System.out.println(a2.ordinal());

    }
}
