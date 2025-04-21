/**
 * 23软二
 * 23030433
 * 赵新航
 * 计算正方形的周长和面积
 */
package demo2;

public class Square implements Perimeter,Area {
    private double length;
    public Square(double length)
    {
        this.length=length;
    }
    public double perimeter()
    {
        return 4*length;
    }
    public double area()
    {
        return length*length;
    }
}
