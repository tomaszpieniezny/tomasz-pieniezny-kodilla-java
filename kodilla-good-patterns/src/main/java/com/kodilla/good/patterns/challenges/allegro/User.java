package com.kodilla.good.patterns.challenges.allegro;

public class User {
    private String userName;
    private String userFirstName;
    private String userSecondName;
    private String userMailAdress;

    public User(String userName, String userFirstName, String userSecondName, String userMailAdress) {
        this.userName = userName;
        this.userFirstName = userFirstName;
        this.userSecondName = userSecondName;
        this.userMailAdress = userMailAdress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserSecondName() {
        return userSecondName;
    }

    public String getUserMailAdress() {
        return userMailAdress;
    }
}
