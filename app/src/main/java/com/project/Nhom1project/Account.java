package com.project.Nhom1project;

public class Account {
    String username;
    String password;
    public Account() {
    }
    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String name) {
        this.username = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
