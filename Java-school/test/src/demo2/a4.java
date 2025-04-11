package demo2;



//密码的自动生成器：密码由大写字母/小写字母/数字组成，生成六位随机密码
import java.util.Random;
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        // 定义一个字符型数组
        char[] pardStore = new char[62];
        // 把所有的大写字母放进去 把所有的小写字母放进去 把0到9放进去
        for (int i = 0; i < 26; i++) {
            pardStore[i] = (char) (65 + i);
            pardStore[i + 26] = (char) (97 + i);
        }
        for (int i = 0; i < 10; i++) {
            pardStore[i + 52] = (char) (48 + i);
        }

        // 分别以1、2、3作为种子数 生成6位随机密码
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            Random r = new Random(seed);
            String password = "";
            for (int j = 0; j < 6; j++) {
                int index = r.nextInt(62);
                password += pardStore[index];
            }
            System.out.println(password);
            seed++;
        }
    }
}