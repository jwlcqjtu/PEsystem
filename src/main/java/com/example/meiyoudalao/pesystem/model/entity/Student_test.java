package com.example.meiyoudalao.pesystem.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "pesystem_student_test")
public class Student_test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_test_id;
    private String username;
    private String history;
    private String weight;
    private String blood_pressure;
    private String color;
    private String right_sight;
    private String left_sight;
    private String facial_features;
    private String vital_capacity;
    private String tooth;
    private String viscus;
    private String comment;
    public Integer getStudent_test_id() {
        return student_test_id;
    }

    public void setStudent_test_id(Integer student_test_id) {
        this.student_test_id = student_test_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRight_sight() {
        return right_sight;
    }

    public void setRight_sight(String right_sight) {
        this.right_sight = right_sight;
    }

    public String getLeft_sight() {
        return left_sight;
    }

    public void setLeft_sight(String left_sight) {
        this.left_sight = left_sight;
    }

    public String getFacial_features() {
        return facial_features;
    }

    public void setFacial_features(String facial_features) {
        this.facial_features = facial_features;
    }

    public String getVital_capacity() {
        return vital_capacity;
    }

    public void setVital_capacity(String vital_capacity) {
        this.vital_capacity = vital_capacity;
    }

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }

    public String getViscus() {
        return viscus;
    }

    public void setViscus(String viscus) {
        this.viscus = viscus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
