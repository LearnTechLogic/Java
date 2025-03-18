/**
 * 23030433
 * 赵新航
 * 实汉诺塔
 */
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入盘子的个数: ");
        int n = scanner.nextInt();
        scanner.close();

        // 调用汉诺塔移动函数，A、B、C分别代表三个柱子
        hanoi(n, 'A', 'B', 'C');
    }
    public static void hanoi(int n, char from, char auxiliary, char to) {
        if (n == 1) {
            // 只有一个盘子时，直接从初始柱子移动到目标柱子
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        // 将上面n-1个盘子从初始柱子移动到辅助柱子
        hanoi(n - 1, from, to, auxiliary);
        // 将最大的盘子从初始柱子移动到目标柱子
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        // 将刚才移动到辅助柱子的n-1个盘子移动到目标柱子
        hanoi(n - 1, auxiliary, from, to);
    }
}
