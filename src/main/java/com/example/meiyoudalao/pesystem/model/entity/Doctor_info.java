package com.example.meiyoudalao.pesystem.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "pesystem_doctor_info")
public class Doctor_info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doctor_info_id;
    private String username;
    private String name;
    private String sex;
    private String department;
    private String work_lenght;
    public Integer getDoctor_info_id() {
        return doctor_info_id;
    }

    public void setDoctor_info_id(Integer doctor_info_id) {
        this.doctor_info_id = doctor_info_id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWork_lenght() {
        return work_lenght;
    }

    public void setWork_lenght(String work_lenght) {
        this.work_lenght = work_lenght;
    }

}
