package demo3;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
            System.out.println(num1 / num2);
        } catch (Exception e){
            System.out.println("除数不能为0");
        }
    }
}
