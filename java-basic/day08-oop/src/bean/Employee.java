package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 员工信息："ID", "姓名", "性别", "年龄", "电话" ,"职位", "入职日期", "薪水", "部门"
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String phone;
    private String position;
    private String entryDate;
    private double salary;
    private String department;
}
