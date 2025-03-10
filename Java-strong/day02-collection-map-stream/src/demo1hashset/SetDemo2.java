package demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 目标：掌握HashSet集合去重操作。
        demo1hashset.Student s1 = new demo1hashset.Student("张三", 18, "北京", "123456");
        demo1hashset.Student s2 = new demo1hashset.Student("李四", 19, "上海", "989876");
        demo1hashset.Student s3 = new demo1hashset.Student("张三", 18, "北京", "123456");
        demo1hashset.Student s4 = new demo1hashset.Student("李四", 19, "上海", "989876");

        Set<demo1hashset.Student> set = new HashSet<>(); // 不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
