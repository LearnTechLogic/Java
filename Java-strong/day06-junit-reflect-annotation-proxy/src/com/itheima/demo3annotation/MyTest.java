package com.itheima.demo3annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 表示注解的作用目标为方法
@Retention(RetentionPolicy.RUNTIME) // 表示注解的保留策略: 编译器运行时(一直活着)
public @interface MyTest {
    int count() default 1; // 表示注解的属性
}
