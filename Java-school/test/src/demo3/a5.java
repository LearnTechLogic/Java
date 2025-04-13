package demo3;

import java.util.Scanner;

public class a5 {
    /********* Begin *********/
    public static void main(String[] args) throws MyException1{
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        try{
            checkusername(username);
            System.out.println("用户名格式正确");
        }catch(MyException1 e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkusername(String username) throws MyException1{
        if(username.length()<3){
            throw new MyException1("Exception in thread \"main\" step4.MyException: 用户名小于三位Exception at step4.Task.main(Task.java:13)");
        }
    }
}


class MyException1 extends Exception{
    public MyException1(String message){
        super(message);
    }
}

/********* End *********/