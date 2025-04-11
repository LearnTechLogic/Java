package demo2;

import java.util.Scanner;

public class a3 {
    //测试输入：
    //张三 李四 王五 小明
    //李明 张三 小明 王五
    //预期输出：
    //11
    //11
    //不相同'
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name1 == name2 ? "相同":"不相同");
    }
}
