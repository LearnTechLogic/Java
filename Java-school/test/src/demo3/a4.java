package demo3;
import java.util.Scanner;

public class a4 {
    /********* Begin *********/
    public static void main(String[] args) {
        // 使用 try-with-resources 自动关闭 Scanner
        try (Scanner sc = new Scanner(System.in)) {
            String username = sc.next();

            // 判断用户名
            checkUsername(username);
            System.out.println("用户名格式正确");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkUsername(String username) throws MyException {
        if (username.length() < 3) {
            throw new MyException("Exception in thread \"main\" step4.MyException: 用户名小于三位Exception at step4.Task.main(Task.java:13)");
        }
    }
    /********* End *********/
}

class MyException extends Exception {
    public MyException() {
    }
    public MyException(String message) {
        super(message);
    }
}
