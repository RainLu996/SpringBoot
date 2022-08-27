package com.lujun61.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -7892523745204851764L;

    private Integer id;
    private Integer age;
    private String name;

    public Student() {
    }

    public Student(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
