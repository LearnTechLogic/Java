/**
 * 23030433
 * 赵新航
 * 实现字符串的各种形式
 */
public class demo3 {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("Abc");
        String d = "abc";
        String e = new String("abc");

        int c = a.compareTo(b);
        System.out.println("compareTo:" + c);
        c = a.compareToIgnoreCase(b);
        System.out.println("compareToIgnoreCase:" + c);

        boolean boo = a.equals(b);
        System.out.println("equals:" + boo);
        boo = a.equalsIgnoreCase(b);
        System.out.println("equalsIgnoreCase:" + boo);

        boo = (a == b);
        System.out.println("a==b:" + boo);
        boo = (a == d);
        System.out.println("a==d:" + boo);
        boo = (a == e);
        System.out.println("a==e:" + boo);

    }
}
