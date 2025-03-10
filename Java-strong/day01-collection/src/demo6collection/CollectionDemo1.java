package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚Collection集合的整体特点.
        // 1、List家族的集合：有序、可重复、有索引。
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("C");
        list.add("C++");
        System.out.println(list); // [Java, Java, C, C++] 顺序和添加顺序一致
        String rs = list.get(0);
        System.out.println(rs);

        // 2、Set家族的集合：无序、不可重复、无索引。
        Set<String> set = new HashSet<>();
        set.add("鸿蒙");
        set.add("Java");
        set.add("Java");
        set.add("C");
        set.add("C++");
        System.out.println(set);
    }
}
