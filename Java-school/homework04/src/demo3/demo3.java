/**
 * 23软二
 * 23030433
 * 赵新航
 * 大学生信息
 */
package demo3;

public class demo3 {
    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent();
        s1.setSname("张三");
        s1.setSclass("软一");
        s1.setSbirthday("1980-01-01");

        CollegeStudent s2 = new CollegeStudent();
        s2.setSname("李四");
        s2.setSclass("软二");
        s2.setSbirthday("2005-01-01");

        CollegeStudent s3 = new CollegeStudent();
        s3.setSname("王五");
        s3.setSclass("软三");
        s3.setSbirthday("2038-01-01");
    }
}
