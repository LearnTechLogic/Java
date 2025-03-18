package com.itheima.demo8api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        // 目标：掌握java提供的获取时间的方案。
        // JDK 8之前的方案： Date 获取此刻日期时间 老项目还有。
        Date d = new Date();
        System.out.println(d);

        // 格式化：SimpleDateFormat 简单日期格式化，格式化日期对象成为我们喜欢的格式。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String result = sdf.format(d);
        System.out.println(result);

        // JDK 8之后的方案： LocalDate LocalTime LocalDateTime 获取此刻日期时间 新项目推荐。
        // 获取此刻日期时间对象 
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());

        LocalDateTime now2 = now.plusSeconds(60); // 60秒后
        System.out.println(now);
        System.out.println(now2);

        // 格式化：DateTimeFormatter
        // 1、创建一个格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EEE a");
        // 2、格式化now对象的时间
        String result2 = dtf.format(now);
        System.out.println(result2);
    }
}
