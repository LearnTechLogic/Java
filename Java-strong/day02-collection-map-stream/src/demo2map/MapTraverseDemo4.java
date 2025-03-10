package demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo4 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的遍历方式二：键值对。
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}

        // 1、把Map集合转换成Set集合，里面的元素类型都是键值对类型（Map.Entry<String, Integer>）
        /**
         *  map = {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}
         *   ↓
         *   map.entrySet()
         *   ↓
         *  Set<Map.Entry<String, Integer>> entries = [(嫦娥=28), (铁扇公主=38), (紫霞=31), (女儿国王=31)]
         *                                                                                   entry
         */
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        // 2、遍历Set集合，得到每一个键值对类型元素
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
