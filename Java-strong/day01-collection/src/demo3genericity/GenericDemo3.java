package demo3genericity;

public class GenericDemo3 {
    public static void main(String[] args) {
        //泛型接口的基本作用
        //项目需要对学生数据和老师数据进行增删改查
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        studentData.update(new Student());
        studentData.query(new Student());
    }
}
