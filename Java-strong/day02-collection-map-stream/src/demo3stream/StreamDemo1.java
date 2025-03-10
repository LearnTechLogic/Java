package demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        // 目标：认识Stream流，掌握其基本使用步骤。体会它的优势和特点。
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        // 1、先用传统方案：找出姓张的人，名字为3个字的，存入到一个新集合中去。
        List<String> newList = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张") && name.length() == 3){
                newList.add(name);
            }
        }
        System.out.println(newList);

        // 2、使用Stream流解决
        List<String> newList2 = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
