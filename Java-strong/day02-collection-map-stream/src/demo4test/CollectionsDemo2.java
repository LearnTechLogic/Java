package demo4test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        // 目标：Colllections工具类
        List<String> list = new ArrayList<>();
//        list.add("张无忌");
//        list.add("周芷若");
//        list.add("赵敏");
//        list.add("张强");
//        list.add("张三丰");
//        list.add("张翠山");
        // 1、Collections的方法批量加
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山");
        System.out.println(list);

        // 2、打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
