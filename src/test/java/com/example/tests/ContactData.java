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
}
