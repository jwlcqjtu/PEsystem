package com.example.meiyoudalao.pesystem.model;

import com.example.meiyoudalao.pesystem.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findByUsernameAndPassword(String username,String password);
}
