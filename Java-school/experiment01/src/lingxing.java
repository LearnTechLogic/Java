/**
 * 23030433
 * 赵新航
 * 菱形
 */
import javax.swing.JOptionPane;


public class lingxing {
    public static void main(String[] args) {
        System.out.println("请输入菱形的边长：");
        String input = JOptionPane.showInputDialog(null, "请输入菱形的边长：");
        if (!input.matches("\\d+")||!input.matches("-?\\d*[13579]")) {
            JOptionPane.showMessageDialog(null, "请输入一个奇数");
            return;
        }
        int size = Integer.parseInt(input);
        for(int i=1;i<=(size+1)/2;i++){
            for(int j=0;j<=(size-1)/2-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("\u002A");
            }
            System.out.println();
        }
        for(int i=(size+1)/2-1;i>=1;i--){
            for(int j=0;j<=(size-1)/2-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("\u002A");
            }
            System.out.println();
        }
    }
}
