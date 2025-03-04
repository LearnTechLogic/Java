package StringDemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "hello";
        //Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s1.length());

        //构造器
        String s2 = new String();//String s2 = "";
        System.out.println(s2);//空字符串

        String s3 = new String("hello");//不推荐
        System.out.println(s3);

        char[] chars = {'a','b','c'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {97,98,99,65};
        String s5 = new String(bytes);
        System.out.println(s5);



        System.out.println("------------------------");
        String loginName = "admin";
        System.out.print("请输入登录名：");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.next();
        if(loginName.equals(inputName)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        if(loginName == inputName){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        System.out.println("------------------------");
        System.out.print("请您用手机号登录：");
        String phone = sc.next();


        String newPhone = phone.substring(0,3) + "****" + phone.substring(7,11);
        System.out.print("系统显示以下手机号码：" + newPhone);
    }
}
