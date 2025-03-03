package extends1demo;

public class text {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.setName("张三");
        t.setSex('男');
        t.setSkill("java");
        System.out.println(t.getSex());
        System.out.println(t.getName());
        System.out.println(t.getSkill());

    }
}
