package com.example.user.fita.model;

/**
 * Created by User on 13.03.2018.
 */

public class User {
    private String userName;

    public User(String userName, String userEmail, String password, String key) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
        this.key = key;
    }

    private String userEmail;
    private String password;
    private String key;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
