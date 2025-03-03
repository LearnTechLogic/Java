package com.itheima.capsulation;

public class student {
    String name;
    //使用private 修饰的成员变量，称为私有成员变量
    private int age;
    private double chinese;
    private double math;

    // 使用public 修饰的成员方法，称为公共成员方法，get和set方法
    public void setAge(int age)
    {
        if(age>0&&age<150)
        {
            this.age=age;
        }
        else
        {
            System.out.println("年龄不合法");
        }
    }
    public int getAge()
    {
        return age;
    }

    public void print()
    {
        System.out.println("姓名："+name+"年龄："+age+"语文成绩："+chinese+"数学成绩："+math);
    }
}
