package com.example.meiyoudalao.pesystem.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "pesystem_student_info")
public class Student_info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_info_id;
    private String username;
    private String name;
    private String sex;
    private String age;
    private String majorclass;

    public Integer getStudent_info_id() {
        return student_info_id;
    }

    public void setStudent_info_id(Integer student_info_id) {
        this.student_info_id = student_info_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMajorclass() {
        return majorclass;
    }

    public void setMajorclass(String majorclass) {
        this.majorclass = majorclass;
    }


}
