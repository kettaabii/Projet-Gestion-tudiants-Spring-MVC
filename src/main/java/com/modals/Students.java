package com.modals;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
    private String id;
    private String name;
    private int age;
    private String Apogee;
    private String Picture;
    private String Email;
    private String Phone;
    private String Address;
    private String Course;

    public Students() {}

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getApogee() {
        return Apogee;
    }

    public void setApogee(String apogee) {
        Apogee = apogee;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Apogee='" + Apogee + '\'' +
                ", Picture='" + Picture + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }
}
