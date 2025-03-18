/**
 * 23030433
 * 赵新航
 * 菱形
 */
import javax.swing.JOptionPane;

public class lingxing {
    public static void main(String[] args) {
        // 使用 JOptionPane 获取用户输入
        String input = JOptionPane.showInputDialog("请输入要打印的菱形的高度：");
        int n;
        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "输入的不是有效的整数，请重新运行程序并输入一个整数。");
            return;
        }

        // 打印上半部分
        for (int i = 1; i <= n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= n - i; j++) {
                line.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                line.append("\u25C7");
            }
            System.out.println(line.toString());
        }

        // 打印下半部分
        for (int i = n - 1; i >= 1; i--) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= n - i; j++) {
                line.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                line.append("\u25C7");
            }
            System.out.println(line.toString());
        }
    }
}
