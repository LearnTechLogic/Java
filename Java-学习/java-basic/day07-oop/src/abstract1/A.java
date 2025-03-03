package abstract1;

public abstract class A {
    private String name;
    private int age;

    //抽象方法：必须用abstract修饰，没有方法体，只有方法声明
    public abstract void show();

    public A(){
        System.out.println("A");
    }

    public A(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void show1(){
        System.out.println("show1");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
