package demo1hashset;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // 只要两个对象的内容一样结果一定是true.
    // s3.equals(s1)
    @Override
    public boolean equals(Object o) {
        // 1、如果是自己和自己比直接返回true
        if (this == o) return true;
        // 2、如果o为空或者o不是Student类型，直接返回false
        if (o == null || this.getClass() != o.getClass()) return false;
        // 3、比较两个对象的内容是否一样
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        // 不同学生对象，如果内容一样返回的哈希值一定是一样的，
        return Objects.hash(name, age, address, phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}' + "\n";
    }
}
