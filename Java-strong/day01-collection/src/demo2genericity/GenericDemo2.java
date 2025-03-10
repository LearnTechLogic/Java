package demo2genericity;

public class GenericDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        list.remove("java");

        System.out.println(list);
    }
}
