package com.example.myfinalproject;

public class VaccinatorData {
    private String userName,password;

    public VaccinatorData() {
    }

    public VaccinatorData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
