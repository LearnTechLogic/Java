package com.itheima.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 用户信息包含用户名，密码，登录名。
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username; // 用户名
    private String password; // 密码
    private String loginName; // 登录名
}
