package Code;

import java.util.Arrays;

public class CodeDemo1 {
    public static int a ;
    public static String[] cards =new String[54];
    //static属于类，和类一起加载
    static {
        System.out.println("static");
        a = 100;
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
        cards[3] = "4";
    }

    public static void main(String[] args) {
        System.out.println("main");

        System.out.println(Arrays.toString(cards));
    }
}
