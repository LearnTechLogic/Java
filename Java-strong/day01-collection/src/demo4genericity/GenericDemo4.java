package demo4genericity;

import demo3genericity.Student;

public class GenericDemo4 {
    //学习定义泛型方法
    //打印任意数组的内容
    public static void main(String[] args) {
        String[] names = {"张三","李四","王五"};
        printArray(names);

        Student[] stus = new Student[3];
        printArray(stus);

        Student max = getMax(stus);

    }

    public static <T> void printArray(T[] names){

    }
    public static <T> T getMax(T[] names){
        return null;
    }
}

