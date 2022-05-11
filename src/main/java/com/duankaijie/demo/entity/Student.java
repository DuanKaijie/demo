package com.duankaijie.demo.entity;

/**
 * @version 1.0
 * @author： 段凯杰
 * @date： 2022-04-14 21:34
 */

public class Student {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
