package com.rolin.blogapi.entity;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private Date createDate;
    private String avatar;
    private Date lastLogin;
    private int status; //0-默认状态

    public User(String username, String email, String password, String avatar, Date lastLogin) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.lastLogin = lastLogin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", avatar='" + avatar + '\'' +
                ", lastLogin=" + lastLogin +
                ", status=" + status +
                '}';
    }
}
