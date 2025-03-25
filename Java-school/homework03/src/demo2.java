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
        hanoi(n, 'A', 'B', 'C');
    }
    public static void hanoi(int n, char from, char auxiliary, char to) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        hanoi(n - 1, from, to, auxiliary);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, auxiliary, from, to);
    }
}
