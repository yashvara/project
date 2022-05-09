package com.project;

public class MyMain {
    String name="";
    String Address="";
    String CGPA="";
    String PhonNum="";

    String MyMain(){
        return this.Address + this.CGPA + this.name + this.PhonNum;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCGPA() {
        return CGPA;
    }

    public void setCGPA(String CGPA) {
        this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonNum() {
        return PhonNum;
    }

    public void setPhonNum(String phonNum) {
        PhonNum = phonNum;
    }

    public static void mian(String args[]) {}

    MyMain obj = new MyMain();

}

