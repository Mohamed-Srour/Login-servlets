package com.myproject;

// import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
class users
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ; 
    @Column(name = "user_name")
    private String user_name ;
    @Column(name = "pass")
    private String pass;

    users(){}
    users(String user_name , String pass)
    {
        this.user_name = user_name ; 
        this.pass = pass;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getId() {
        return id;
    }
    public String getPass() {
        return pass;
    }
    public String getUser_name() {
        return user_name;
    }
}