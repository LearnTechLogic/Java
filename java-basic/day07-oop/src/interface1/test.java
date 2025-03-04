package interface1;

public class test {
    public static void main(String[] args) {
        System.out.println(A.x);

        //接口不可以创建对象
        //A a = new A();
        //接口是用来被类实现的

        C c = new C();
        System.out.println(c.run());
    }
}
//C被称为实现类，同时实现了多个接口
class C implements A,B{
    @Override
    public String run() {
        return "C";

    }

    @Override
    public void play() {

    }
}