package demo4;

public class demo4 {
    public static void main(String[] args) {
        Student student = new Student("张三", "2000-01-01", "1");
        student.show();

        CollengeStudent collengeStudent = new CollengeStudent("李四", "2000-01-01", "1","男");
        collengeStudent.show();
    }
}
