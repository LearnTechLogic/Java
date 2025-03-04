package lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Aniaml a = new Aniaml() {
            @Override
            public void cry() {
                System.out.println("cry");
            }
        };

        a.cry();
        System.out.println("------------------------");
        /*Aniaml a1 = ()->{
            System.out.println("cry");
        };**/
        //lambda表达式只能替代函数式接口的匿名内部类

        Swim s1 =new Swim() {
            @Override
            public void swimming() {
                System.out.println("swimming");
            }
        };
        s1.swimming();
        System.out.println("------------------------");
        Swim s2 = () -> {
            System.out.println("swimming");
        };
        s2.swimming();
    }
}

abstract class Aniaml {
    public abstract void cry();
}

@FunctionalInterface//声明函数式接口
interface Swim {
    void swimming();
}
