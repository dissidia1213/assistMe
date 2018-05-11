package com.example.daniel.assistme;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String name;
    private String surname;
    private String mail;
    private String password; // Are you sure?
    private String country;
    private String usertype;

    public User(String user, String mail, String name, String surn, String coun, String usertype){
        this.username = user;
        this.mail = mail;
        this.name = name;
        this.surname = surn;
        this.country = coun;
        this.usertype = usertype;
    }

    public User(String user, String pass){
        this.username = user;
        this.password = pass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userN) {
        this.username = userN;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

