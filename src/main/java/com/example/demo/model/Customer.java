package com.example.demo.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String idNumber;
    private String name;
    private BigInteger phoneNumber;
    private String email;
    private String nationality;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        String pattern =  "^([a-zA-Z0-9(&*_~)]+([.])?)+[a-zA-Z0-9(&*_~)]+@([a-zA-Z0-9]+[-]?[a-zA-Z0-9]+)+([.]([a-zA-Z0-9]+))+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Your email format is incorrect");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
