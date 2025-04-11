package demo1;

public class complex {
    private double real;
    private double imaginary;

    public complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public complex() {
    }

    // 复数加法
    public complex add(complex other) {
        return new complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // 复数减法
    public complex subtract(complex other) {
        return new complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // 复数乘法
    public complex multiply(complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new complex(newReal, newImaginary);
    }

    // 复数除法
    public complex divide(complex other) {
        complex conjugate = new complex(other.real, -other.imaginary);
        complex numerator = this.multiply(conjugate);
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new complex(numerator.real / denominator, numerator.imaginary / denominator);
    }

    // 打印复数
    @Override
    public String toString() {
        return "(" + real + "," + imaginary + ")";
    }
}
