package demo2;

public class Rectangle extends Shape{

    private double width;
    private double height;

    // 构造函数
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 实现计算面积的方法
    @Override
    public double Area() {
        return width * height;
    }

    // 实现计算周长的方法
    @Override
    public double Perimeter() {
        return 2 * (width + height);
    }
}
