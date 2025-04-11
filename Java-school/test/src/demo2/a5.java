package demo2;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a5 {
    public static void main(String[] args) throws ParseException {
        // 键盘录入你的出生年月日 格式为yyyy-MM-dd
        // 把该字符串转换为一个日期
        // 通过该日期得到一个毫秒值
        // 获取2020年10月1日的毫秒值
        // 两者想减得到一个毫秒值
        // 把该毫秒值转换为天 打印输出
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();// 键盘录入你的出生年月日
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 创建一个日期格式化对象
        Date birthday = sdf.parse(line);// 把该字符串转换为一个日期
        long birthdayTime = birthday.getTime();// 通过该日期得到一个毫秒值
        Date date = sdf.parse("2020-10-01");// 获取2020年10月1日的毫秒值
        long dateTime = date.getTime();// 获取2020年10月1日的毫秒值
        long time = dateTime - birthdayTime;// 两者相减得到一个毫秒值
        long day = time / (1000 * 60 * 60 * 24);// 把该毫秒值转换为天
        System.out.println(day);
    }
}