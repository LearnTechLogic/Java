/**
 * 23软二
 * 23030433
 * 赵新航
 * 大学生信息
 */
package demo3;

public class Student {
    private String sname;
    private String sbirthday;
    private String sclass;
    public Student()
    {
        this.sname = " ";
        this.sbirthday = " ";
        this.sclass = " ";
    }
    public Student(String Sname,String Sbirthday,String Sclass)
    {
        this.sname = Sname;
        this.sbirthday = Sbirthday;
        this.sclass = Sclass;
    }

    public void print()
    {
        System.out.println("姓名："+this.sname+"，生日："+this.sbirthday+"，班级："+this.sclass);
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

}
