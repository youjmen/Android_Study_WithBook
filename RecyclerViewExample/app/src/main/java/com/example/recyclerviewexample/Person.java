package com.example.recyclerviewexample;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Person(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    String name;
    String phone_number;
}
