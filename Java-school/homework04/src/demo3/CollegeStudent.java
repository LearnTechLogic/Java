/**
 * 23软二
 * 23030433
 * 赵新航
 * 大学生信息
 */
package demo3;

import java.time.LocalDate;
import java.time.Period;

public class CollegeStudent extends Student{
    public void setSbirthday(String sbirthday)
    {
        LocalDate birthday = LocalDate.parse(sbirthday);
        if(birthday.isAfter(LocalDate.now()))
        {
            System.out.println("生日不能大于当前日期，请重新输入！");
            return;
        }
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday,now);
        int age = period.getYears();
        //判断年龄是否在17-30岁之间
        if(age < 17 || age > 30)//年龄不在17-30岁之间
        {
            System.out.println("年龄不在17-30岁之间，请重新输入！");
            return;
        }
        super.setSbirthday(sbirthday);
        super.print();
    }

}
