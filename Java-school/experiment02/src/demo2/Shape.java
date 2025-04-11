package demo2;

abstract class Shape {
    // 抽象类 Shape
    // 抽象方法计算面积
    public abstract double Area();

    // 抽象方法计算周长
    public abstract double Perimeter();

    // 打印方法
    public void Print() {
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}
