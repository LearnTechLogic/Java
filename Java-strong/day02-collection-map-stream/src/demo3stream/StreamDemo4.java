package demo3stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 目标：掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 23, 5000));
        teachers.add(new Teacher("金毛狮王", 54, 16000));
        teachers.add(new Teacher("李四", 24, 6000));
        teachers.add(new Teacher("王五", 25, 7000));
        teachers.add(new Teacher("白眉鹰王", 66, 108000));
        teachers.add(new Teacher("陈昆", 42, 48000));

        teachers.stream().filter(t -> t.getSalary() > 15000).forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        long count = teachers.stream().filter(t -> t.getSalary() > 15000).count();
        System.out.println(count);

        System.out.println("--------------------------------------------------");

        // 获取薪水最高的老师对象
        Optional<Teacher> max = teachers.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxTeacher = max.get(); // 获取Optional对象中的元素
        System.out.println(maxTeacher);

        Optional<Teacher> min = teachers.stream().min((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher minTeacher = min.get(); // 获取Optional对象中的元素
        System.out.println(minTeacher);

        System.out.println("---------------------------------------------------------");

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张翠山");

        // 流只能收集一次

        // 收集到集合或者数组中去。
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        // 收集到List集合
        List<String> list1 = s1.collect(Collectors.toList());
        System.out.println(list1);

//        Set<String> set2 = new HashSet<>();
//        set2.addAll(list1);

        // 收集到Set集合
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        // 收集到数组中去
        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println("数组：" + Arrays.toString(array));

        System.out.println("------------------收集到Map集合---------------------------");

        // 收集到Map集合：键是老师名称，值是老师薪水
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);
    }
}
