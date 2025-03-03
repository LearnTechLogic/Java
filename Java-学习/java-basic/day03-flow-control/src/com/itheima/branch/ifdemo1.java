package com.itheima.branch;

public class ifdemo1 {
    public static void main(String[] args) {

        ifdemo1();
        ifdemo2();
        ifdemo3();
        ifdemo4();
    }
    //认识if语句，搞清楚写法和应用场景
    public static void ifdemo1(){
        int score = 80;
        if(score >= 60){
            System.out.println("及格了");
        }
    }
    public static void ifdemo2(){
        int score = 80;
        if(score >= 60){
            System.out.println("及格了");
        }else{
            System.out.println("不及格了");
        }
    }
    public static void ifdemo3(){
        int score = 80;
        if(score >= 90){
            System.out.println("优秀");
        }else if(score >= 80){
            System.out.println("良好");
        } else if(score >= 70){
            System.out.println("一般");
        }else{
            System.out.println("差");
        }
        System.out.println("程序结束");
    }
    public static void ifdemo4(){
        int score = 80;
        if(score >= 90){
            System.out.println("优秀");
        }else if(score >= 80){
            System.out.println("良好");
        } else if(score >= 70){
            System.out.println("一般");
        }else{
            System.out.println("差");
        }
    }
}
