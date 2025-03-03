package interface4;

public interface A {
    //默认方法：必须加default，并且会默认会用public修饰
    default void go(){
        System.out.println("==go方法执行了==");
        run();
    }

    private void run(){
        System.out.println("==run方法执行了==");
    }

    static void show(){
        System.out.println("==show方法执行了==");
    }
}
