package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class AddEmployeeUI extends JFrame {
    private JTextField txtId, txtName, txtSex, txtAge, txtPhone, txtPosition, txtSalary, txtDepartment;
    private JFormattedTextField txtHireDate;
    private JButton btnSave, btnCancel;
    private EmployeeManagerUI employeeManagerUI;

    public AddEmployeeUI(EmployeeManagerUI employeeManagerUI) {
        super("添加员工信息");
        this.employeeManagerUI = employeeManagerUI;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        Font labelFont = new Font("楷体", Font.PLAIN, 14);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel idLabel = new JLabel("ID:");
        idLabel.setFont(labelFont);
        add(idLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtId = new JTextField(10);
        add(txtId, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel nameLabel = new JLabel("姓名:");
        nameLabel.setFont(labelFont);
        add(nameLabel, gbc);

        gbc.gridx = 1;
        txtName = new JTextField(10);
        add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel sexLabel = new JLabel("性别:");
        sexLabel.setFont(labelFont);
        add(sexLabel, gbc);

        gbc.gridx = 1;
        txtSex = new JTextField(10);
        add(txtSex, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel ageLabel = new JLabel("年龄:");
        ageLabel.setFont(labelFont);
        add(ageLabel, gbc);

        gbc.gridx = 1;
        txtAge = new JTextField(10);
        add(txtAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel phoneLabel = new JLabel("电话:");
        phoneLabel.setFont(labelFont);
        add(phoneLabel, gbc);

        gbc.gridx = 1;
        txtPhone = new JTextField(10);
        add(txtPhone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel positionLabel = new JLabel("职位:");
        positionLabel.setFont(labelFont);
        add(positionLabel, gbc);

        gbc.gridx = 1;
        txtPosition = new JTextField(10);
        add(txtPosition, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        JLabel hireDateLabel = new JLabel("入职日期:");
        hireDateLabel.setFont(labelFont);
        add(hireDateLabel, gbc);

        gbc.gridx = 1;
        txtHireDate = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
        add(txtHireDate, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        JLabel salaryLabel = new JLabel("薪水:");
        salaryLabel.setFont(labelFont);
        add(salaryLabel, gbc);

        gbc.gridx = 1;
        txtSalary = new JTextField(10);
        add(txtSalary, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        JLabel departmentLabel = new JLabel("部门:");
        departmentLabel.setFont(labelFont);
        add(departmentLabel, gbc);

        gbc.gridx = 1;
        txtDepartment = new JTextField(10);
        add(txtDepartment, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        btnSave = new JButton("添加");
        btnCancel = new JButton("取消");
        btnSave.setPreferredSize(new Dimension(100, 30));
        btnCancel.setPreferredSize(new Dimension(100, 30));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSave);
        buttonPanel.add(btnCancel);
        add(buttonPanel, gbc);

        // 给添加员工信息绑定一个点击事件监听器。
        btnSave.addActionListener(e -> {
            // 获取输入框的数据，封装成员工对象，添加到信息界面的集合并在其表格展示。
            Employee employee = new Employee();
            employee.setId(Integer.parseInt(txtId.getText()));
            employee.setName(txtName.getText());
            employee.setSex(txtSex.getText());
            employee.setAge(Integer.parseInt(txtAge.getText()));
            employee.setPhone(txtPhone.getText());
            employee.setPosition(txtPosition.getText());
            employee.setEntryDate(txtHireDate.getText());
            employee.setSalary(Double.parseDouble(txtSalary.getText()));
            employee.setDepartment(txtDepartment.getText());
            // 把这个员工对象送到信息界面那里去，添加到信息界面的集合中，并在信息界面的表格中展示。
            employeeManagerUI.addEmployee(employee);
            // 弹出一个提示成功的弹框
            JOptionPane.showMessageDialog(this, "添加成功！");
            // 关闭当前窗口。
            dispose();
        });

        pack();
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}