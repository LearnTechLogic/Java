/**
 * 23030433
 * 赵新航
 * 数字转化为字符串比较
 */
public class demo2 {
    public static void main(String[] args) {
        String a = "1" + 2 + 3 + 4;
        String b = 1 + 2 + 3 + "4";
        String c = "1" + (2 + 3 + 4);

        System.out.println("字符串 a: " + a);
        System.out.println("字符串 b: " + b);
        System.out.println("字符串 c: " + c);

        if (a.equals(b)) {
            System.out.println("字符串 a 和字符串 b 是相等的。");
        } else {
            System.out.println("字符串 a 和字符串 b 是不相等的。");
        }

        if (a.equals(c)) {
            System.out.println("字符串 a 和字符串 c 是相等的。");
        } else {
            System.out.println("字符串 a 和字符串 c 是不相等的。");
        }

        if (b.equals(c)) {
            System.out.println("字符串 b 和字符串 c 是相等的。");
        } else {
            System.out.println("字符串 b 和字符串 c 是不相等的。");
        }
    }
}


