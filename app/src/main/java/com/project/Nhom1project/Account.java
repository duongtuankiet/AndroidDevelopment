package com.project.Nhom1project;

public class Account {
    int id;
    String username;
    String password;
    public Account() {
    }
    /*public Account(int id, String name, String password) {
        this.id = id;
        this.username = name;
        this.password = password;
    }*/
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
