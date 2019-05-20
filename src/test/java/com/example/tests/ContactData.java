package com.example.tests;

public class ContactData {
    public String firstname;
    public String lastname;
    public String address;
    public String home;
    public String mobile;
    public String work;
    public String email;
    public String birthday;
    public String birthmonth;
    public String birthyear;
    public String address2;
    public String phone;

    public ContactData(){

    }

    public ContactData(String firstname, String lastname, String address, String home, String mobile, String work, String email, String birthday, String birthmonth, String birthyear, String address2, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.email = email;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.address2 = address2;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
