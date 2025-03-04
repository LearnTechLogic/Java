package innerclass3;
//匿名内部类
public class test1 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.cry();

        //匿名内部类
        Animal b = new Animal() {
            @Override
            public void cry() {
                System.out.println("cat cry");
            }
        };
        b.cry();
    }
}
    class Cat extends Animal{
        @Override
        public void cry() {
            System.out.println("cat cry");
        }
    }
