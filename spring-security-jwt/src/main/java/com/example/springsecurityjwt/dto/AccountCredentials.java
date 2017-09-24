package com.example.springsecurityjwt.dto;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-09-23 17:15
 **/
public class AccountCredentials {
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
}
