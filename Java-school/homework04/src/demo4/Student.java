package demo4;

public class Student {
    private String Sname;
    private String Sbirthday;
    private String Sclass;

    public Student() {

    }
    public Student(String Sname,String Sbirthday,String Sclass) {
        this.Sname = Sname;
        this.Sbirthday = Sbirthday;
        this.Sclass = Sclass;
    }

    public void show() {
        System.out.println("姓名："+Sname+"，生日："+Sbirthday+"，班级："+Sclass);
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSbirthday() {
        return Sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        Sbirthday = sbirthday;
    }

    public String getSclass() {
        return Sclass;
    }

    public void setSclass(String sclass) {
        Sclass = sclass;
    }
}
