package demo2;

import java.util.Scanner;

public class a7 {
    /********* Begin *********/
    public static void main(String[] args) throws MyException{
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        try{
            checkusername(username);
            System.out.println("用户名格式正确");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkusername(String username) throws MyException{
        if(username.length()<3){
            throw new MyException("Exception in thread \"main\" step4.MyException: 用户名小于三位Exception at step4.Task.main(Task.java:13)");
        }
    }
}


class MyException extends Exception{
    public MyException(){

    }
    public MyException(String message){
        super(message);
    }
}

/********* End *********/