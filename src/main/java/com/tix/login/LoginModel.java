package com.tix.login;

public class LoginModel {

    public LoginModel() {
        this.PASSWORD = "*************";
        this.USER = "Enter your username";
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getUSER() {
        return USER;
    }

    private final String PASSWORD;
    private final String USER;
    
}
