/**
 * 23030433
 * 赵新航
 * 阶乘
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class jiecheng {
    public static void main(String[] args) throws IOException {
        System.out.print("请输入几的阶乘：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(n+"的阶乘为："+sum);
    }
}
