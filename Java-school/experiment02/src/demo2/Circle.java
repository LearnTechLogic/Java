package demo2;

public class Circle extends Shape{

        private double radius;

        // 构造函数
        public Circle(double radius) {
            this.radius = radius;
        }

        // 实现计算面积的方法
        @Override
        public double Area() {
            return Math.PI * radius * radius;
        }

        // 实现计算周长的方法
        @Override
        public double Perimeter() {
            return 2 * Math.PI * radius;
        }
}
