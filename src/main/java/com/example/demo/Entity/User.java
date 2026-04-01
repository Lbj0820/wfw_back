package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_COM0110_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_COM0110_USER_seq")
    @SequenceGenerator(name = "TB_COM0110_USER_seq", sequenceName = "TB_COM0110_USER_SEQ", allocationSize = 1)
    private String USR_ID;

    private String usrnm;
    private String pwd;

    // Getter / Setter
    public String getUserId() {
        return USR_ID;
    }

    public String getUsrnm() {
        return usrnm;
    }

    public void setUsrnm(String usrnm) {
        this.usrnm = usrnm;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}