package com.faham.pmanager.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Student")
public class Student {
    private String name;
    private String gender;
    private Integer age;

    public Student() {
    }

    public Student(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
