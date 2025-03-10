package demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        //认识泛型
        /*
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(100);
        list.add(true);
        list.add(9.09);
        **/
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        //获取数据
        /*
        for (int i = 0; i < list.size(); i++) {
            Object rs = list.get(i);
            System.out.println(rs);
            String s = (String) rs;
            System.out.println(s);
        }
        **/

    }
}
