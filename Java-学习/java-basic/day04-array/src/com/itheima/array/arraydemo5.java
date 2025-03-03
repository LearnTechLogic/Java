package com.itheima.array;

public class arraydemo5 {
    public static void main(String[] args) {
        printArray();
    }
    //二维数组认识
    public static void printArray() {
        String[][] classroom = new String[3][4];
        String[][] classroom2 = {
                {"张三", "李四", "王五", "赵六"},
                {"赵四", "钱五", "孙六", "周七"},
                {"孙八", "周九", "吴十", "郑十一"}
        };
        System.out.println(classroom2[2][1]);
        System.out.println(classroom2[1].length);
        int[][] arr = new int[3][4];
    }
}
