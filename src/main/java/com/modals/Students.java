package com.modals;

public class Students {
    private int id;
    private String name;
    private int age;
    private String Apogee;





    public int getId() {
        return id;
    }

    public void setId(int id) {
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
                '}';
    }
}
