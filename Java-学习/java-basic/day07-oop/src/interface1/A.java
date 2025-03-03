package interface1;

public interface A {
    //JDK8之前，接口中只能定义常量和抽象方法
    int x = 100;
    String run();
    //public static final int x = 100;接口中的常量默认都是public static final修饰

    //public abstract void run();接口中的抽象方法可以省略public abstract
}
