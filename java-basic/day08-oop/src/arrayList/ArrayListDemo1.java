package arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //掌握ArrayList的使用
        //创建ArrayList集合
        ArrayList<String> list = new ArrayList<String>();
        //添加数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("钱七");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //查看数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //删除数据
        list.remove(0);
        list.remove("钱七");
        //修改数据
    }
}
