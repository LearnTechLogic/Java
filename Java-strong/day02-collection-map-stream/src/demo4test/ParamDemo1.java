package demo4test;

import java.util.Arrays;

public class ParamDemo1 {
    public static void main(String[] args) {
        // 目标：认识可变参数
        sum(); // 不传参数
        sum(10);  // 可以传1个参数
        sum(10, 20, 30, 40, 50);  // 可以传多个参数
        sum(new int[]{11, 22, 33, 44});  // 可以传数组

        // 优势：接收参数很灵活，可以替代数组传参
    }

    // 注意事项：可变参数在形参列表中只能有一个 , 可变参数必须放在形参列表的最后面
    public static void sum(int...nums){
        // 内部怎么拿数据：
        // 可变参数对内实际上就是一个数组。nums就是数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------------");
    }
}
