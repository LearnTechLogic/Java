package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
// 自定义员工界面类
public class EmployeeManagerUI extends JFrame{
    private JFrame frame; // 窗口
    private JTable table;  // 表格
    private DefaultTableModel model; // 表格模型: 封装表格数据的对象
    private JTextField nameTextFieldSearch; // 搜索输入框
    // 准备一个静态集合对象，用于存储系统中的全部员工对象信息。
    private static ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeManagerUI() {
    }

    public  EmployeeManagerUI(String username) {
        super("欢迎，" + username + "进入人事信息管理界面"); // 设置窗口标题
        frame = this;
        initialize();
        this.setVisible(true); // 显示窗口
    }

    private void initialize() {
        this.setBounds(100, 100, 800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        // 输入框和搜索按钮
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nameTextFieldSearch = new JTextField(20);
        JButton btnSearch = new JButton("搜索");
        JButton btnAdd = new JButton("添加");
        topPanel.add(nameTextFieldSearch);
        topPanel.add(btnSearch);
        topPanel.add(btnAdd);

        // 创建表格模型
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "姓名", "性别", "年龄", "电话" ,"职位", "入职日期", "薪水", "部门"}
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 设置所有单元格为不可编辑
            }
        };

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);

        // 右键菜单
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("编辑");
        JMenuItem deleteItem = new JMenuItem("删除");
        popupMenu.add(editItem);
        popupMenu.add(deleteItem);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // 明确检查是否为鼠标右键
                    int row = table.rowAtPoint(e.getPoint());
                    if (row >= 0) {
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    }
                }
            }
        });

        // 绑定事件到菜单项
        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (Integer) model.getValueAt(selectedRow, 0); // 假设ID在第一列
                    JOptionPane.showMessageDialog(frame, "删除 ID: " + id);
                    // 这里可以添加编辑逻辑，比如打开一个新的对话框让用户修改数据
                }
            }
        });

        deleteItem.addActionListener(e -> {
                int selectedRow = table.getSelectedRow(); // 获取选中的行索引
                if (selectedRow >= 0) {
                    int id = (Integer) model.getValueAt(selectedRow, 0); // 假设ID在第一列
                    // JOptionPane.showMessageDialog(frame, "删除 ID: " + id);
                    // 这里可以添加删除逻辑，比如从模型中移除该行
                    deleteEmployee(id);
                    model.removeRow(selectedRow); // 删除当前行。
                }
        });

        // 搜索按钮监听器
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchValue = nameTextFieldSearch.getText();
                // 这里可以添加搜索逻辑
            }
        });

        // 添加按钮监听器
        btnAdd.addActionListener(e -> {
            // 弹出一个添加员工信息的界面出来。
            new AddEmployeeUI(this);
        });

        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void deleteEmployee(int id) {
        // 从集合中删除该员工对象。
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == id) {
                employees.remove(i);
                break;
            }
        }
    }

    public void addEmployee(Employee employee) {
        // 添加到集合，展示到表格。
        employees.add(employee);
        // 添加一行数据
        model.addRow(new Object[]{employee.getId(), employee.getName(), employee.getSex(), employee.getAge(), employee.getPhone(), employee.getPosition(), employee.getEntryDate(), employee.getSalary(), employee.getDepartment()});
    }
}