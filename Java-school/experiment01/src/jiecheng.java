/**
 * 23030433
 * 赵新航
 * 阶乘
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class jiecheng {
    public static void main(String[] args) throws IOException {
        System.out.print("请输入几的阶乘：");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n+"的阶乘为："+sum);
    }
}
