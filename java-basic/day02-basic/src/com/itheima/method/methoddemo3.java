package com.itheima.method;

public class methoddemo3 {
    public static void main(String[] args) {
        getDiv(10,0);
    }
    //设计一个除法的功能，要处理特殊情况
    public static void getDiv(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return ;
        }
        System.out.println(a/b);
    }

}
