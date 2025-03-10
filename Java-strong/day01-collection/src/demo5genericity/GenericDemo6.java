package demo5genericity;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {
        //泛型和集合不支持基本数据类型，只能支持对象类型（引用数据类型）
        //ArrayList<int> list = new ArrayList<>();
        //ArrayList<double> list = new ArrayList<>();
        //把基本数据类型变成对象类型
        //ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Double> list2 = new ArrayList<>();

        //手工包装
        //Integer it = new Integer(100);
        Integer it = Integer.valueOf(100);

        //自动装箱：底层自动将基本数据类型变成对象类型
        Integer it1 = 100;
        Integer it2 = 200;


        //自动拆箱：底层自动将对象类型变成基本数据类型
        int i = it1;
        System.out.println(i);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        int rs = list.get(0);
        System.out.println(rs);

        int j = 23;
        String rs1 = Integer.toString(j);
        System.out.println(rs1 +1);

        Integer i2 = j;
        String rs2 = i2.toString();
        System.out.println(rs2 +1);

        String rs3 = j +"";
        System.out.println(rs3 +1);

        String str = "123";
        int i1 = Integer.parseInt(str);
        System.out.println(i1 + 1);


    }
}
