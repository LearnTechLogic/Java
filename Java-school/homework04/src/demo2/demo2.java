/**
 * 23软二
 * 23030433
 * 赵新航
 * 计算正方形的周长和面积
 */
package demo2;

public class demo2 {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("正方形的周长： "+s.perimeter());
        System.out.println("正方形的面积： "+s.area());
    }
}
